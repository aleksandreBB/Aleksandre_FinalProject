package PageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.by;
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
    buy_button = $(".sc-5c2c2f39-9"),

//    cart_items_div = $(".sc-718d9655-1"),
//    cart_size = $(".sc-718d9655-17");



    clear_cart_buttom = $(".sc-ee6d7bd2-4"),
    clear_cart_window = $ (".sc-ba053bcb-3"),

    clear_cart_yes = $(".sc-ba053bcb-8",0),
    clear_cart_no = $(".sc-ba053bcb-8",1),
    cart_item_count_icon_1 = $("#cart-web").$(byText("1")),
    cart_item_count_icon_2 = $("#cart-web").$(byText("2")),
    cart_item_count_icon_3 = $("#cart-web").$(byText("3"));
    public ElementsCollection
    cart_count = $(".sc-718d9655-1").$$(".sc-718d9655-17");

}




