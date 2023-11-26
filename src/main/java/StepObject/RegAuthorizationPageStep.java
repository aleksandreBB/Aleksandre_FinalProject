package StepObject;

import PageObject.CommonPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.checkerframework.checker.units.qual.C;

import java.time.Duration;

import static DataObject.CommonPageData.*;
import static DataObject.MobilePhonePageData.random_price;
import static DataObject.RegAuthorizationPageData.*;
import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;


import PageObject.RegAuthorizationPage;
import com.codeborne.selenide.Condition;

import java.time.Duration;

public class RegAuthorizationPageStep extends RegAuthorizationPage {
    @Step("რეგისტრაცია ავტორიზაცის გვერძე გადასვლა")
    public RegAuthorizationPageStep log_in_reg_authorization_page(){
        registration_authorization_button.click();
        return this;
    }
    @Step("რეგისტრაცის გვერძე გადასვლა")
    public RegAuthorizationPageStep registration_page_click(){
        registration_page_button.click();
        return this;
    }
    @Step("მობილურის ველში არასრული შემთხვევითი ნომრის ჩაწერა - {fake_random_number}")
    public int put_incomplete_random_number(){
        reg_phone_number_input.setValue(String.valueOf(fake_random_number));
        return fake_random_number;
    }
    @Step("მობილურის ველში სრული შემთხვევითი ნომრის ჩაწერაა")
    public int put_random_number(){
        reg_phone_number_input.setValue(String.valueOf(full_random_number));
        return full_random_number;
    }
    @Step(" 'წავიკითხე და ვეთანხმები წესებსა და პირობებს' დათანხმება")
    public RegAuthorizationPageStep agree_terms_and_conditions() {
        read_and_agree_text.click();
        return this;
    }
    @Step("ნომრის დადასტურების ინფუთის დალოდება")
    public RegAuthorizationPageStep waiting_confirm_number() {
        confirm_number.shouldBe(Condition.visible, Duration.ofMillis(8000));
        return this;
    }
    @Step("რეგისტრაციის ღილაკზე დაჭერა")
    public RegAuthorizationPageStep registration_button_click() {
        registration_button.click();
        return this;
    }
    @Step("ავტორიზაცის გვერძე გადასვლა")
    public RegAuthorizationPageStep authorization_page_click(){
        authorization_page_button.click();
        return this;
    }
    @Step("ავტორიზაცის კოდის გამოგზავნაზე დაჭერა")
    public RegAuthorizationPageStep send_code_click(){
        send_code.click();
        return this;
    }
    @Step("ავტორიზაცის კოდის ინფუთზე დალოდება")
    public RegAuthorizationPageStep waiting_confirm_code() {
        confirm_code.shouldBe(Condition.visible, Duration.ofMillis(8000));
        return this;
    }
    @Step("ავტორიზაცია მობილური ნომრით გვერდძე გადასვლა")
    public RegAuthorizationPageStep enter_authorization_by_number(){
        authorization_by_number.click();
        return this;
    }
    @Step("ავტორიზაცია მეილით გვერძე გადასვლა")
    public RegAuthorizationPageStep enter_authorization_by_email(){
        authorization_by_email.click();
        return this;
    }
    @Step("შემთხვევითი მეილის შეყვანა - {uthorization_email}")
    public String put_random_email(){
        authorization_email_input.setValue(authorization_email);
        return authorization_email;
    }
    @Step("არასწოორი შემთხვევითი მეილის შეყვანა - {authorization_last_name}")
    public String put_wrong_random_email(){
        authorization_email_input.setValue(authorization_last_name);
        return authorization_last_name;
    }
    @Step("შემთხვევითი პაროლის შეყვანა - {authorization_password}")
    public String put_random_password(){
        authorization_password_input.setValue(authorization_password);
        return authorization_password;
    }
    @Step("შესვლა მეილის საშვალებით")
    public RegAuthorizationPageStep enter_by_email_click(){
        enter_by_email.click();
        return this;
    }
    @Step("მანდატორის გამოჩენაზე დალოდება")
    public RegAuthorizationPageStep waiting_invalid_username_or_password() {
        invalid_username_or_password.shouldBe(Condition.visible, Duration.ofMillis(8000));
        return this;
    }

}
