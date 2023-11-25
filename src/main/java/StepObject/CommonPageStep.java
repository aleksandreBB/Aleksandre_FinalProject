package StepObject;

import PageObject.CommonPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.checkerframework.checker.units.qual.C;

import java.time.Duration;

import static DataObject.CommonPageData.*;
import static DataObject.MobilePhonePageData.random_price;
import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;


public class CommonPageStep extends CommonPage {
    @Step("კალათის გვერძე შესვლა")
    public CommonPageStep log_in_cart_page(){
        cart_button.click();
        sleep(2000);
        return this;
    }
    @Step("ძიებაში ჩაწერა - {search_input_value}")
    public CommonPageStep Search_item(String search_input_value){
        search_input.setValue(search_input_value).pressEnter();
        return this;
    }
}
