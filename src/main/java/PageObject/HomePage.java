package PageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    public SelenideElement
    mobile_phone_button = $(".sc-ded1b9c5-9",0),
    hot_offers_slider = $(".sc-ecbb3abd-2",0),
    new_models_slider = $(".sc-ecbb3abd-2",1);
    public ElementsCollection
    hot_offer_slider_item = $(".sc-ecbb3abd-2",0).$$(".sc-bdd54c0a-0"),
    new_models_slider_item = $(".sc-ecbb3abd-2",1).$$(".sc-bdd54c0a-0");


}
