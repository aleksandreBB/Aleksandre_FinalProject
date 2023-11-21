package StepObject;
import PageObject.CartPage;
import com.codeborne.selenide.Condition;
import org.testng.Assert;
import java.time.Duration;
import static com.codeborne.selenide.Selenide.*;

public class CartPageStep extends CartPage {

    public CartPageStep empty_cart_check(){
        empty_cart.shouldBe(Condition.visible, Duration.ofMillis(8000));
        Assert.assertTrue(empty_cart.is(Condition.visible));
        return this;
    }
    public CartPageStep add_button_check(){
        add_button.shouldBe(Condition.visible, Duration.ofMillis(8000));
        add_button.click();
        sleep(1000);
        Assert.assertTrue(add_button.is(Condition.text("კალათაშია")));
        add_button.click();
        warning_notice.shouldBe(Condition.visible, Duration.ofMillis(8000));
        Assert.assertTrue(warning_notice.is(Condition.visible));
        clear_button.click();
        return this;
    }
    public CartPageStep waiting_item(){
        cart_item.shouldBe(Condition.visible, Duration.ofMillis(8000));
        return this;
    }
    public CartPageStep add_item_in_cart(){
        add_button.shouldBe(Condition.visible, Duration.ofMillis(8000));
        add_button.click();
        sleep(1000);
        return this;
    }
    public CartPageStep add_3_item_in_cart(){
        add_button.shouldBe(Condition.visible, Duration.ofMillis(8000));
        sleep(5000);
        add_button.click();
        sleep(1000);
        add_button2.click();
        sleep(1000);
        add_button3.click();
        sleep(1000);
        return this;
        //თაკო აქ სლიფის გარეშე არ მუშაობს სწრაპად კლიკავს და კალათაში მარტო ბოლო ვარდება ხოლმე
    }



    public int cart_item_sum(){
        cart_item_area.shouldBe(Condition.visible, Duration.ofMillis(8000));
        int cart_count = $(".sc-718d9655-1").$$(".sc-718d9655-17").size();
        int sum = 0 ;
        for(int i = 0; i < cart_count; i ++){
            String string_price = $(".sc-718d9655-17", i).getText();
            string_price = string_price.replaceAll("[^0-9.]", "");
            int second_price = Integer.parseInt(string_price);
            sum += second_price;
        }
        return sum;

    }

    public int value_of_items(){
        value_of_items_string.shouldBe(Condition.visible, Duration.ofMillis(8000));
        String string_value = value_of_items_string.getText();
        string_value = string_value.replaceAll("[^0-9.]", "");
        int value_items = Integer.parseInt(string_value);

        return value_items;
    }

    public int value_of_shipping(){
        String string_hipping_cost = value_of_shipping_string.getText();
        string_hipping_cost = string_hipping_cost.replaceAll("[^0-9.]", "");
        int value_shipping = Integer.parseInt(string_hipping_cost);

        return value_shipping;

    }

    public int amount_to_be_Paid(){
        String string_amount_to_be_paid = amount_to_be_paid_string.getText();
        string_amount_to_be_paid = string_amount_to_be_paid.replaceAll("[^0-9.]", "");
        int amount_to_paid = Integer.parseInt(string_amount_to_be_paid);
        return amount_to_paid;
    }

    public CartPageStep go_to_buy(){
        buy_button.click();
        return this;
    }

    public CartPageStep clear_cart_button_click(){
        clear_cart_buttom.click();
        return this;
    }
    public CartPageStep clear_cart_click(){
        clear_cart_yes.click();
        sleep(2000);
        return this;
    }

}



