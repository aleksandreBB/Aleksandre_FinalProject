import StepObject.HomePageStep;
import StepObject.MobilePhoneStep;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.Chromerunner;
import java.time.Duration;

import static DataObject.MobilePhonePageData.*;
import static com.codeborne.selenide.Selenide.$;
import static java.lang.Thread.sleep;


public class MobilePhonePageTest extends Chromerunner {
    HomePageStep homePageStep = new HomePageStep();
    MobilePhoneStep mobilePhoneStep = new MobilePhoneStep();

    @Test
    @Description("ფასის ფილტრის სლაიდერის რესტი, ნამდვილად შესაბამება თუ არა სლაიდერის მდებარეობა ფილტრის მინიმალური თანხის ინფუთში ჩაწერილ თანხას")
    @Severity(SeverityLevel.CRITICAL)
    public void left_slider_price_test() {
        homePageStep.log_in_mobile_phone_page();
        mobilePhoneStep.random_min_price(random_price);
        mobilePhoneStep.get_left_slider_line_price();
        Assert.assertEquals(mobilePhoneStep.random_min_price(random_price), mobilePhoneStep.get_left_slider_line_price(),"შემთხვევითი ფასი ტოლი უნდა იყოს მარცხენა სლაიდერის განლაგების შესაბამის ფასთან");
    }
    @Test
    @Description("ფასის ფილტრის სლაიდერის რესტი, ნამდვილად შესაბამება თუ არა სლაიდერის მდებარეობა ფილტრის მაქსიმალური თანხის ინფუთში ჩაწერილ თანხას")
    @Severity(SeverityLevel.CRITICAL)
    public void right_slider_price_test() {
        homePageStep.log_in_mobile_phone_page();
        mobilePhoneStep.random_max_price(random_price);
        mobilePhoneStep.get_right_slider_line_price();
        Assert.assertEquals(mobilePhoneStep.random_max_price(random_price), mobilePhoneStep.get_right_slider_line_price(),"შემთხვევითი ფასი ტოლი უნდა იყოს მარჯვენა სლაიდერის განლაგების შესაბამის ფასთან");
    }
    @Test
    @Description("ფასის სლაიდერის აღმნიშვნელი ინფუთის შემოწმება ფილტრის მინიმალური თანხის ინფუთში")
    @Severity(SeverityLevel.CRITICAL)
    public void left_black_price_test(){
        homePageStep.log_in_mobile_phone_page();
        mobilePhoneStep.random_min_price(random_price);
        mobilePhoneStep.get_left_slider_head_price();
        Assert.assertEquals(mobilePhoneStep.get_left_slider_head_price(),mobilePhoneStep.random_min_price(random_price),"მარცხენა სლაიდერის აღმნიშვნელის ფასი ტოლი უნდა იყოს შემთხვევით ფასთან");
    }
    @Test
    @Description("ფასის სლაიდერის აღმნიშვნელი ინფუთის შემოწმება ფილტრის მაქსიმალურ თანხის ინფუთში")
    @Severity(SeverityLevel.CRITICAL)
    public void right_black_price_test(){
        homePageStep.log_in_mobile_phone_page();
        mobilePhoneStep.random_max_price(random_price);
        mobilePhoneStep.get_right_slider_head_price();
        Assert.assertEquals(mobilePhoneStep.get_right_slider_head_price(),mobilePhoneStep.random_max_price(random_price),"მარჯვენა სლაიდერის აღმნიშვნელის ფასი ტოლი უნდა იყოს შემთხვევით ფასთან");
    }
    @Test
    @Description("მობილურების სორტირების ტესტი, ფასის კლებადობის მიხედვით")
    @Severity(SeverityLevel.CRITICAL)
    public void mobile_phone_decreasing_sort_test(){
        homePageStep.log_in_mobile_phone_page();
        mobilePhoneStep.mobile_phone_decreasing_sort();
        mobilePhoneStep.mobile_phone_count_size();
        mobilePhoneStep.Compare_prices_test();
    }
    @Test
    @Description("მობილურების სორტირების ტესტი, მინიმალური და მაქსიმალური ფასის მონიშვნით")
    @Severity(SeverityLevel.CRITICAL)
    public  void mobile_phone_price_sort_test(){
        homePageStep.log_in_mobile_phone_page();
        mobilePhoneStep.random_left_price(left_random_price);
        mobilePhoneStep.random_right_price(right_random_price);
        mobilePhoneStep.waiting_iteam();
        mobilePhoneStep.slider_sort_prices_test();
    }
}
