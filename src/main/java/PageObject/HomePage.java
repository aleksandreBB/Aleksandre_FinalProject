package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    public SelenideElement
    mobile_phone_button = $(byText("მობილურები")),
    log_in_page = $(".sc-b592c520-1");
}