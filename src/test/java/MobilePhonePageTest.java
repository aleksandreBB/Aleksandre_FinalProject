import StepObject.HomePageStep;
import StepObject.MobilePhoneStep;
import com.codeborne.selenide.Condition;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Chromerunner;

import java.time.Duration;

import static DataObject.MobilePhonePageData.left_random_price;
import static com.codeborne.selenide.Selenide.$;


public class MobilePhonePageTest extends Chromerunner {
    HomePageStep homePageStep = new HomePageStep();
    MobilePhoneStep mobilePhoneStep = new MobilePhoneStep();

    @Test
    public void left_slider_price_test() {
        homePageStep.log_in_mobile_phone_page();
        mobilePhoneStep.random_min_price();
        mobilePhoneStep.get_left_slider_line_price();
        Assert.assertEquals(mobilePhoneStep.random_min_price(), mobilePhoneStep.get_left_slider_line_price());
    }
    @Test
    public void right_slider_price_test() {
        homePageStep.log_in_mobile_phone_page();
        mobilePhoneStep.random_max_price();
        mobilePhoneStep.get_right_slider_line_price();
        Assert.assertEquals(mobilePhoneStep.random_max_price(), mobilePhoneStep.get_right_slider_line_price());
    }
    @Test
    public void left_black_price_test(){
        homePageStep.log_in_mobile_phone_page();
        mobilePhoneStep.random_min_price();
        mobilePhoneStep.get_left_slider_head_price();
        Assert.assertEquals(mobilePhoneStep.get_left_slider_head_price(),mobilePhoneStep.random_min_price());
    }
    @Test
    public void right_black_price_test(){
        homePageStep.log_in_mobile_phone_page();
        mobilePhoneStep.random_max_price();
        mobilePhoneStep.get_right_slider_head_price();
        Assert.assertEquals(mobilePhoneStep.get_right_slider_head_price(),mobilePhoneStep.random_max_price());
    }
    @Test
    public void mobile_phone_sort_test(){
        homePageStep.log_in_mobile_phone_page();
        mobilePhoneStep.mobile_phone_decreasing_sort();
        mobilePhoneStep.mobile_phone_size();
        mobilePhoneStep.Compare_prices_test();
    }

}
