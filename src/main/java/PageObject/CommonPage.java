package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CommonPage {
    public SelenideElement
    search_input = $(".sc-c28948c8-1"),
    cart_button = $("#cart-p"),
    sort_option = $(".sc-e7d6b729-2"),
    decreasing_price = $(byText("ფასი: კლებადობით"),0);
}
