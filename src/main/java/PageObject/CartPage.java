package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CartPage {
    public SelenideElement

    empty_cart = $(".sc-60db655c-12"),
    add_button = $(".sc-e336402b-1",0),
    add_button2 = $(".sc-e336402b-1",2),
    add_button3 = $(".sc-e336402b-1",3),

    warning_notice =$(byText("ნივთი უკვე კალათაშია")),
    clear_button = $(byText("გასაგებია")),
    cart_item = $(".sc-718d9655-2"),

    cart_item_price = $(".sc-718d9655-17"),
    cart_item_area = $(".sc-718d9655-1"),

    value_of_items_string = $(".sc-5c2c2f39-5",0),
    value_of_shipping_string = $(".sc-5c2c2f39-5",1),
    amount_to_be_paid_string = $(".sc-5c2c2f39-8"),
    buy_button = $(".sc-5c2c2f39-9");
//    cart_items_div = $(".sc-718d9655-1"),
//    cart_size = $(".sc-718d9655-17");


}



