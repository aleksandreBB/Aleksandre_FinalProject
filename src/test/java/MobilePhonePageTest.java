import StepObject.HomePageStep;
import StepObject.MobilePhoneStep;
import com.codeborne.selenide.Condition;
import org.testng.Assert;
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
    public void left_slider_price_test() {
        homePageStep.log_in_mobile_phone_page();
        mobilePhoneStep.random_min_price(random_price);
        mobilePhoneStep.get_left_slider_line_price();
        Assert.assertEquals(mobilePhoneStep.random_min_price(random_price), mobilePhoneStep.get_left_slider_line_price(),"შემთხვევითი ფასი ტოლი უნდა იყოს მარცხენა სლაიდერის განლაგების შესაბამის ფასთან");
    }
    @Test
    public void right_slider_price_test() {
        homePageStep.log_in_mobile_phone_page();
        mobilePhoneStep.random_max_price(random_price);
        mobilePhoneStep.get_right_slider_line_price();
        Assert.assertEquals(mobilePhoneStep.random_max_price(random_price), mobilePhoneStep.get_right_slider_line_price(),"შემთხვევითი ფასი ტოლი უნდა იყოს მარჯვენა სლაიდერის განლაგების შესაბამის ფასთან");
    }
    @Test
    public void left_black_price_test(){
        homePageStep.log_in_mobile_phone_page();
        mobilePhoneStep.random_min_price(random_price);
        mobilePhoneStep.get_left_slider_head_price();
        Assert.assertEquals(mobilePhoneStep.get_left_slider_head_price(),mobilePhoneStep.random_min_price(random_price),"მარცხენა სლაიდერის აღმნიშვნელის ფასი ტოლი უნდა იყოს შემთხვევით ფასთან");
    }
    @Test
    public void right_black_price_test(){
        homePageStep.log_in_mobile_phone_page();
        mobilePhoneStep.random_max_price(random_price);
        mobilePhoneStep.get_right_slider_head_price();
        Assert.assertEquals(mobilePhoneStep.get_right_slider_head_price(),mobilePhoneStep.random_max_price(random_price),"მარჯვენა სლაიდერის აღმნიშვნელის ფასი ტოლი უნდა იყოს შემთხვევით ფასთან");
    }
    @Test
    public void mobile_phone_decreasing_sort_test(){
        homePageStep.log_in_mobile_phone_page();
        mobilePhoneStep.mobile_phone_decreasing_sort();
        mobilePhoneStep.mobile_phone_count_size();
        mobilePhoneStep.Compare_prices_test();
    }
    @Test
    public  void mobile_phone_price_sort_test(){
        homePageStep.log_in_mobile_phone_page();
        mobilePhoneStep.random_left_price(left_random_price);
        mobilePhoneStep.random_right_price(right_random_price);
        mobilePhoneStep.waiting_iteam();
        mobilePhoneStep.slider_sort_prices_test();
    }
}
