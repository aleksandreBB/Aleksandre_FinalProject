import PageObject.CommonPage;
import PageObject.RegAuthorizationPage;
import StepObject.CommonPageStep;
import StepObject.HomePageStep;
import StepObject.RegAuthorizationPageStep;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Chromerunner;

import static DataObject.RegAuthorizationPageData.*;

public class RegistrationAuthorizationTest extends Chromerunner {
    RegAuthorizationPageStep regAuthorizationPageStep = new RegAuthorizationPageStep();
    RegAuthorizationPage regAuthorizationPage = new RegAuthorizationPage();
    HomePageStep homePageStep = new HomePageStep();
    CommonPageStep commonPageStep = new CommonPageStep();
    CommonPage commonPage = new CommonPage();

    @Test
    @Description("რეგისტრაცის დადებითი ტესტი")
    @Severity(SeverityLevel.BLOCKER)
    public void registration_Test(){
        regAuthorizationPageStep.log_in_reg_authorization_page();
        regAuthorizationPageStep.registration_page_click();
        Assert.assertTrue((regAuthorizationPage.reg_phone_number_input).is(Condition.visible),"ტელეფონის ჩასაწერი ველი უნდა ჩანდეს");
        Assert.assertTrue((regAuthorizationPage.read_and_agree_text).is(Condition.visible),"უნდა ჩანდეს ტექსტი 'წავიკითხე და ვეთანხმები წესებსა და პირობებს'");
        Assert.assertTrue((regAuthorizationPage.other_registration).is(Condition.visible),"უნდა ჩანდეს ტექსტი 'ან გაიარე ავტორიზაცია სხვა მეთოდით'");
        regAuthorizationPageStep.put_random_number(full_random_number);
        regAuthorizationPageStep.agree_terms_and_conditions();
        regAuthorizationPageStep.registration_button_click();
        regAuthorizationPageStep.waiting_confirm_number();
        Assert.assertTrue((regAuthorizationPage.confirm_number).is(Condition.visible),"უნდა გამოჩნდეს ნომრის დადასტურების ფანჯარა");
    }
    @Test
    @Description("რეგისტრაცის უარყოპითი ტესტი")
    @Severity(SeverityLevel.CRITICAL)
    public void registration_mandate_Test(){
        regAuthorizationPageStep.log_in_reg_authorization_page();
        regAuthorizationPageStep.registration_page_click();
        Assert.assertTrue((regAuthorizationPage.reg_phone_number_input).is(Condition.visible),"ტელეფონის ჩასაწერი ველი უნდა ჩანდეს");
        Assert.assertTrue((regAuthorizationPage.read_and_agree_text).is(Condition.visible),"უნდა ჩანდეს ტექსტი 'წავიკითხე და ვეთანხმები წესებსა და პირობებს'");
        Assert.assertTrue((regAuthorizationPage.other_registration).is(Condition.visible),"უნდა ჩანდეს ტექსტი 'ან გაიარე ავტორიზაცია სხვა მეთოდით'");
        regAuthorizationPageStep.put_incomplete_random_number(fake_random_number);
        regAuthorizationPageStep.agree_terms_and_conditions();
        regAuthorizationPageStep.registration_button_click();
        Assert.assertTrue((regAuthorizationPage.mandate).is(Condition.visible),"უნდა გამოჩნდეს ტექსტი 'არასწორი მონაცემი'");
    }

    @Test
    @Description("ავტორიზაცის დადებითი ტესტი ტელეფონის ნომრით")
    @Severity(SeverityLevel.BLOCKER)
    public void authorization_by_number_Test(){
        regAuthorizationPageStep.log_in_reg_authorization_page()
                                .authorization_page_click()
                                .enter_authorization_by_number()
                                .put_random_number(full_random_number);
        regAuthorizationPageStep.send_code_click();
        regAuthorizationPageStep.waiting_confirm_code();
        Assert.assertTrue((regAuthorizationPage.confirm_code).is(Condition.visible),"უნდა გამოჩნდეს კოდის დადასტურების ინფუთი");
    }
    @Test
    @Description("ავტორიზაცის უარყოფითი ტესტი ტელეფონის ნომრით")
    @Severity(SeverityLevel.CRITICAL)
    public void authorization_by_number_mandate_Test(){
        regAuthorizationPageStep.log_in_reg_authorization_page()
                                .authorization_page_click()
                                .enter_authorization_by_number();
        regAuthorizationPageStep.put_incomplete_random_number(fake_random_number);
        regAuthorizationPageStep.send_code_click();
        regAuthorizationPageStep.waiting_confirm_code();
        Assert.assertTrue((regAuthorizationPage.mandate).is(Condition.visible),"უნდა გამოჩნდეს ტექსტი 'არასწორი მონაცემი'");
    }

    @Test
    @Description("ავტორიზაცის დადებითი ტესტი მეილით")
    @Severity(SeverityLevel.BLOCKER)
    public void authorization_by_email_Test(){
        regAuthorizationPageStep.log_in_reg_authorization_page();
        regAuthorizationPageStep.authorization_page_click();
        regAuthorizationPageStep.enter_authorization_by_email();
        Assert.assertTrue((regAuthorizationPage.forgot_password).is(Condition.visible),"უნდა ჩანდეს ტექსტი 'დაგავიწყდა პაროლი'");
        regAuthorizationPageStep.put_random_email(authorization_email);
        regAuthorizationPageStep.put_random_password(authorization_password);
        regAuthorizationPageStep.enter_by_email_click();
        regAuthorizationPageStep.waiting_invalid_username_or_password();
        Assert.assertTrue((regAuthorizationPage.invalid_username_or_password).is(Condition.visible),"უნდა გამოჩნდეს მანდატორი");
    }
    @Test
    @Description("ავტორიზაცის უარყოფითი ტესტი მეილით")
    @Severity(SeverityLevel.CRITICAL)
    public void authorization_by_email_mandate_Test(){
        regAuthorizationPageStep.log_in_reg_authorization_page();
        regAuthorizationPageStep.authorization_page_click();
        regAuthorizationPageStep.enter_authorization_by_email();
        Assert.assertTrue((regAuthorizationPage.forgot_password).is(Condition.visible),"უნდა ჩანდეს ტექსტი 'დაგავიწყდა პაროლი'");
        regAuthorizationPageStep.put_wrong_random_email(authorization_last_name);
        regAuthorizationPageStep.put_random_password(authorization_password);
        regAuthorizationPageStep.enter_by_email_click();
        regAuthorizationPageStep.waiting_invalid_username_or_password();
        Assert.assertTrue((regAuthorizationPage.invalid_username_or_password).is(Condition.visible),"უნდა გამოჩნდეს მანდატორი");
    }
}
