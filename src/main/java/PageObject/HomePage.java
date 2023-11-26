package PageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    public SelenideElement
//    mobile_phone_button2 = $(byText("მობილურები")),
    mobile_phone_button = $(".sc-ded1b9c5-9",0),
    new_models_slider = $(".sc-ecbb3abd-2",1),
    home_page_item = $(".sc-bdd54c0a-0"),
    items_moreInfo_icon = $(".sc-bdd54c0a-32");

    public ElementsCollection
    new_models_slider_size = $(".sc-ecbb3abd-2",1).$$(".sc-bdd54c0a-0");

}
