package StepObject;

import PageObject.CommonPage;
import PageObject.MobilePhonePage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;
import java.time.Duration;
import static DataObject.MobilePhonePageData.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
public class MobilePhoneStep extends MobilePhonePage {
    CommonPage commonPage = new CommonPage();
    public int random_min_price(){
        min_price.shouldBe(Condition.visible, Duration.ofMillis(20000));
        min_price.setValue(String.valueOf(random_price));
        return random_price;
    }
    public int random_max_price(){
        max_price.shouldBe(Condition.visible, Duration.ofMillis(20000));
        max_price.setValue(String.valueOf(random_price));
        return random_price;
    }
    public double get_left_slider_line_price(){
        String px = left_price_slider.getCssValue("left");
        px = px.replaceAll("[^0-9.]", "");
        double double_px = Double.parseDouble(px);
        int max_price = 5999;
        double line_price =  ((max_price * double_px) / 330);
        line_price = Math.round(line_price);
        return line_price;
    }
    public double get_right_slider_line_price(){
        String px = right_price_slider.getCssValue("left");
        px = px.replaceAll("[^0-9.]", "");
        double double_px = Double.parseDouble(px);
        int max_price = 5999;
        double line_price =  ((max_price * double_px) / 330);
        line_price = Math.round(line_price);
        return line_price;
}
    public int get_left_slider_head_price(){
        String black_price = left_slider_head_price.getText();
        black_price = black_price.replaceAll("[^0-9]", "");
        int int_black_price = Integer.parseInt(black_price);
        return int_black_price;
    }
    public double get_right_slider_head_price(){
        String black_price = right_slider_head_price.getText();
        black_price = black_price.replaceAll("[^0-9]", "");
        double int_black_price = Double.parseDouble(black_price);
        return int_black_price;
    }
    public MobilePhoneStep mobile_phone_decreasing_sort(){
        commonPage.sort_option.click();
        commonPage.decreasing_price.click();
        return this;
    }
    public int mobile_phone_count_size(){
        mobile_phone_price_div2.shouldBe(Condition.visible, Duration.ofMillis(20000));
        int mobile_count = $(".sc-1e9b893c-12").$$(".sc-bdd54c0a-10").size();
        return mobile_count;
    }
    public MobilePhoneStep Compare_prices_test(){
        String first_string_price = mobile_phone_0index_String_price2.getText();
        first_string_price = first_string_price.replaceAll("[^0-9]", "");
        int first_price = Integer.parseInt(first_string_price);
        for (int i = 1; i < mobile_phone_count_size(); i++){
            String second_string_price = $(".sc-bdd54c0a-10",i).getText();
            second_string_price = second_string_price.replaceAll("[^0-9]", "");
            int second_price = Integer.parseInt(second_string_price);
             Assert.assertTrue(second_price <= first_price );
             first_price = second_price;
        }
        return this;
    }
    public int random_left_price(){
        min_price.shouldBe(Condition.visible, Duration.ofMillis(20000));
        min_price.setValue(String.valueOf(left_half_random_price));
        return random_price;
    }
    public int random_right_price(){
        max_price.shouldBe(Condition.visible, Duration.ofMillis(20000));
        max_price.setValue(String.valueOf(right_half_random_price));
        return random_price;
    }
//    public MobilePhoneStep mobile_phone_space_waiting(){
//        mobile_phone_0index_String_price2.shouldBe(Condition.visible, Duration.ofMillis(10000));
//        return this;
//    }
    public MobilePhoneStep slider_sort_prices_test() {
        sleep(4000);
//        mobile_phone_0index_String_price2.shouldBe(Condition.visible, Duration.ofMillis(10000));
        for ( int i = 0; i < mobile_phone_count_size(); i++ ){
            String next_string_price = $(".sc-bdd54c0a-10",i).getText();
            next_string_price = next_string_price.replaceAll("[^0-9]", "");
            int next_price = Integer.parseInt(next_string_price);
            Assert.assertTrue(left_half_random_price <= next_price);
            Assert.assertTrue(next_price <= right_half_random_price);
        }
        return this;
    }








}
