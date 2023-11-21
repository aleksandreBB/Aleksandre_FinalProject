package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class MobilePhonePage {
    public SelenideElement
    min_price = $(".sc-cf417ca-4",0),
    max_price = $(".sc-cf417ca-4",1),

    left_price_slider = $(".MuiSlider-thumb",0),
    right_price_slider = $(".MuiSlider-thumb",1),
    left_slider_head_price = $(".MuiSlider-valueLabelLabel", 0),
    right_slider_head_price = $(".MuiSlider-valueLabelLabel", 1),
    mobile_phone_item_area = $(".sc-1e9b893c-12"),
    mobile_phone_price_div = $(".sc-73f3188d-10"),
    mobile_phone_price_div2 = $(".sc-bdd54c0a-10"),

    mobile_phone_0index_String_price = $(".sc-73f3188d-10",0),
    mobile_phone_0index_String_price2 = $(".sc-bdd54c0a-10",0),

    see_more = $(".sc-1e9b893c-14");


}
