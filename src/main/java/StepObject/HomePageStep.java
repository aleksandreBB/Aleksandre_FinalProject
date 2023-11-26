package StepObject;

import PageObject.CommonPage;
import PageObject.HomePage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class HomePageStep extends HomePage {
    SoftAssert soft = new SoftAssert();
    @Step("მობილურების გვერძე გადასვლა")
    public HomePageStep log_in_mobile_phone_page(){
        mobile_phone_button.shouldBe(Condition.visible, Duration.ofMillis(28000));
        mobile_phone_button.click();
        return  this;
    }
    @Step("ჩამოსქროლვა ახალი ნივთების სლაიდერამდე")
    public HomePageStep scroll_To_New_Slider(){
        new_models_slider.scrollTo();
        return this;
    }
    @Step("ახალი ნივთების სლაიდერის ზომის გაგება")
    public int new_models_slider_size(){
        int slider_size = new_models_slider_size.size();
        return slider_size;
    }
    @Step("შემოწმება აქვს თუ არა ყველა ნივთს NEW ნიშანი")
    public HomePageStep checking_new_icon(){
        for (int i = 0; i < new_models_slider_size(); i++){
            soft.assertTrue(new_models_slider.$(".sc-bdd54c0a-0", i).$(".sc-bdd54c0a-32").has(Condition.ownText("NEW")),"ყველა ნივთს უნდა ქონდეს NEW - ნიშანი");
            soft.assertAll();
        }
        return this;
    }



}
