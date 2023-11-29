package StepObject;

import PageObject.CommonPage;
import PageObject.MobilePhonePage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.testng.Assert;
import java.time.Duration;
import static DataObject.MobilePhonePageData.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
public class MobilePhoneStep extends MobilePhonePage {
    CommonPage commonPage = new CommonPage();
    @Step("მობილურების ფილტრის შემთხვევითი მინიმალური ფასი - {random_price}")
    public int random_min_price(int random_price){
        min_price.shouldBe(Condition.visible, Duration.ofMillis(10000));
        min_price.setValue(String.valueOf(random_price));
        return random_price;
    }@Step("მობილურების ფილტრის შემთხვევითი მაქსიმალური ფასი - {random_price}")
    public int random_max_price(int random_price){
        max_price.shouldBe(Condition.visible, Duration.ofMillis(10000));
        max_price.setValue(String.valueOf(random_price));
        return random_price;
    }
    @Step("მარცხენა სლაიდერის, განლაგების შესაბამისი ფასის გამოთვლა")
    public double get_left_slider_line_price(){
        String px = left_price_slider.getCssValue("left");
        px = px.replaceAll("[^0-9.]", "");
        double double_px = Double.parseDouble(px);
        int max_price = 5999;
        double line_price =  ((max_price * double_px) / 330);
        line_price = Math.round(line_price);
        return line_price;
    }
    @Step("მარჯვენა სლაიდერის განლაგების შესაბამისი ფასის გამოთვლა")
    public double get_right_slider_line_price(){
        String px = right_price_slider.getCssValue("left");
        px = px.replaceAll("[^0-9.]", "");
        double double_px = Double.parseDouble(px);
        int max_price = 5999;
        double line_price =  ((max_price * double_px) / 330);
        line_price = Math.round(line_price);
        return line_price;
    }
    @Step("სლაიდერის მინიმალური ფასის აღმნიშვნელი")
    public int get_left_slider_head_price(){
        String black_price = left_slider_head_price.getText();
        black_price = black_price.replaceAll("[^0-9]", "");
        int int_black_price = Integer.parseInt(black_price);
        return int_black_price;
    }
    @Step("სლაიდერის მაქსიმალური ფასის აღმნიშვნელი")
    public double get_right_slider_head_price(){
        String black_price = right_slider_head_price.getText();
        black_price = black_price.replaceAll("[^0-9]", "");
        double int_black_price = Double.parseDouble(black_price);
        return int_black_price;
    }
    @Step("მობილურების ფასის სორტირება კლებადობით")
    public MobilePhoneStep mobile_phone_decreasing_sort(){
        commonPage.sort_option.click();
        commonPage.decreasing_price.click();
        return this;
    }
    @Step("მობილურების რაოდენობის გამოთვლა გვერძე")
    public int mobile_phone_count_size(){
        mobile_phone_price_div2.shouldBe(Condition.visible, Duration.ofMillis(20000));
        int mobile_count = $(".sc-1e9b893c-12").$$(".sc-bdd54c0a-10").size();
        return mobile_count;
    }
    @Step("მობილურის ფასის შედარება სხვა მობილურის ფასებთან")
    public MobilePhoneStep Compare_prices_test(){
        String first_string_price = mobile_phone_0index_String_price.getText();
        first_string_price = first_string_price.replaceAll("[^0-9]", "");
        int first_price = Integer.parseInt(first_string_price);
        for (int i = 1; i < mobile_phone_count_size(); i++){
            String second_string_price = $(".sc-bdd54c0a-10",i).getText();
            second_string_price = second_string_price.replaceAll("[^0-9]", "");
            int second_price = Integer.parseInt(second_string_price);
             Assert.assertTrue((second_price <= first_price),"მობილურის ფასი ნაკლები ან ტოლი უნდა იყოს შემდეგის ფასზე");
             first_price = second_price;
        }
        return this;
    }
    @Step("მობილურების ფილტრში შემთხვევითი 2999ლ ზე ნაკლები ფასის ჩაწერა - {left_random_price}")
    public int random_left_price(int left_random_price){
        min_price.shouldBe(Condition.visible, Duration.ofMillis(20000));
        min_price.setValue(String.valueOf(left_random_price));
        return left_random_price;
    }
    @Step("მობილურების ფილტრში შემთხვევითი 3000ლ ზე მეტი და 5999 ნაკლები ფასის ჩაწერა - {right_random_price}")
    public int random_right_price(int right_random_price){
        max_price.shouldBe(Condition.visible, Duration.ofMillis(20000));
        max_price.setValue(String.valueOf(right_random_price));
        return right_random_price;
    }
    @Step("სორტირების დალოდება")
    public MobilePhoneStep waiting_iteam(){
        mobile_phone_loading_page.shouldBe(Condition.visible, Duration.ofMillis(10000));
        return this;
    }

    @Step("ყველა მობილურის ფასის შედარება ფილტრში ჩაწერილ ფასებთან ")
    public MobilePhoneStep slider_sort_prices_test() {
        $(".sc-bdd54c0a-0",0).shouldBe(Condition.visible, Duration.ofMillis(10000));
        for ( int i = 0; i < mobile_phone_count_size(); i++ ){
            String next_string_price = $(".sc-bdd54c0a-10",i).getText();
            next_string_price = next_string_price.replaceAll("[^0-9]", "");
            int next_price = Integer.parseInt(next_string_price);
            Assert.assertTrue((left_random_price <= next_price),"ფილტრის მინიმალური ფასი <= უნდა იყოს მობილურის ფასზე !");
            Assert.assertTrue((next_price <= right_random_price),"მობილურის ფასი <= უნდა იყოს ფილტრის მაქსიმალურ ფასზე !");
        }
        return this;
    }

}
