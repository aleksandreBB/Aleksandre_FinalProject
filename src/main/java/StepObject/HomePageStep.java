package StepObject;

import PageObject.HomePage;
import com.codeborne.selenide.Condition;

import java.time.Duration;

public class HomePageStep extends HomePage {
    public HomePageStep check_hot_slider(){


       return this;
    }
    public HomePageStep log_in_mobile_phone_page(){
        mobile_phone_button.shouldBe(Condition.visible, Duration.ofMillis(8000));
        mobile_phone_button.click();
        return  this;
    }



}
