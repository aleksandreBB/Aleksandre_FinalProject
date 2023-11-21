import PageObject.CartPage;
import PageObject.CommonPage;
import StepObject.CartPageStep;
import StepObject.CommonPageStep;
import StepObject.HomePageStep;
import com.codeborne.selenide.Condition;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Chromerunner;


import static DataObject.CommonPageData.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class CartTest extends Chromerunner {
    CartPageStep cartPageStep = new CartPageStep();
    CommonPageStep commonPageStep = new CommonPageStep();
    CartPage cartPage = new CartPage();
    HomePageStep homePageStep = new HomePageStep();
   @Test
   public void add_item_to_cart_test() {
       commonPageStep.log_in_cart_page();
       cartPageStep.empty_cart_check();
       commonPageStep.Search_item(search_input_value);
       cartPageStep.add_button_check();
       commonPageStep.log_in_cart_page();
       Assert.assertTrue((cartPage.cart_item).is(Condition.visible));
       cartPageStep.clear_cart_button_click();
       Assert.assertTrue((cartPageStep.clear_cart_window).is(Condition.visible));
       cartPageStep.clear_cart_click();
       Assert.assertFalse((cartPage.cart_item).is(Condition.visible));

   }
    @Test
    public void cart_price_test() {
        homePageStep.log_in_mobile_phone_page();
        cartPageStep.add_3_item_in_cart();
        commonPageStep.log_in_cart_page();
        cartPageStep.cart_item_sum();
        cartPageStep.value_of_items();
        Assert.assertEquals(cartPageStep.cart_item_sum(), cartPageStep.value_of_items());
    }
    @Test
    public void full_price_test(){
        homePageStep.log_in_mobile_phone_page();
        cartPageStep.add_item_in_cart();
        commonPageStep.log_in_cart_page();
        cartPageStep.value_of_shipping();
        cartPageStep.amount_to_be_Paid();
        Assert.assertEquals(cartPageStep.amount_to_be_Paid(),
                cartPageStep.value_of_items() + cartPageStep.value_of_shipping());
        cartPageStep.go_to_buy();
        Assert.assertTrue(homePageStep.log_in_page.is(Condition.visible));
    }

}
