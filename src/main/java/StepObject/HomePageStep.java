package StepObject;

import PageObject.HomePage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import java.time.Duration;

public class HomePageStep extends HomePage {
    @Step("მობილურების გვერძე გადასვლა")
    public HomePageStep log_in_mobile_phone_page(){
        mobile_phone_button.shouldBe(Condition.visible, Duration.ofMillis(18000));
        mobile_phone_button.click();
        return  this;
    }



}
