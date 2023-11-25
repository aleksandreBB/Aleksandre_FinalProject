import PageObject.CartPage;
import PageObject.CommonPage;
import PageObject.RegAuthorizationPage;
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
    RegAuthorizationPage regAuthorizationPage = new RegAuthorizationPage();
    CartPageStep cartPageStep = new CartPageStep();
    CommonPageStep commonPageStep = new CommonPageStep();
    CartPage cartPage = new CartPage();
    HomePageStep homePageStep = new HomePageStep();
   @Test
   public void add_and_clear_item_to_cart_test() {
       commonPageStep.log_in_cart_page();
       cartPageStep.empty_cart_check();
       commonPageStep.Search_item(search_input_value);
       cartPageStep.add_button_check();
       commonPageStep.log_in_cart_page();
       Assert.assertTrue((cartPage.cart_item).is(Condition.visible),"ნივთი უნდა იყოს კალათაში");
       cartPageStep.clear_cart_button_click();
       Assert.assertTrue((cartPageStep.clear_cart_window).is(Condition.visible),"უნდა გამოვიდეს ნივთების გასუფთავების ფანჯარა");
       cartPageStep.clear_cart_click();
       Assert.assertFalse((cartPage.cart_item).is(Condition.visible), " ნივთი აღარ უნდა იყოს კალათაში");

   }
    @Test
    public void cart_price_test() {
        homePageStep.log_in_mobile_phone_page();
        cartPageStep.add_3_item_in_cart();
        commonPageStep.log_in_cart_page();
        cartPageStep.cart_item_sum();
        cartPageStep.value_of_items();
        Assert.assertEquals(cartPageStep.cart_item_sum(), cartPageStep.value_of_items(),"გამოთვლილი ნივთების ჟამი ტოლი უნდა იყოს მთლიან ღირებულებაზე");
    }
    @Test
    public void full_price_test(){
        homePageStep.log_in_mobile_phone_page();
        cartPageStep.add_item_in_cart();
        commonPageStep.log_in_cart_page();
        cartPageStep.value_of_shipping();
        cartPageStep.amount_to_be_Paid();
        Assert.assertEquals(cartPageStep.amount_to_be_Paid(),
                cartPageStep.value_of_items() + cartPageStep.value_of_shipping(),"გადასახდელი თანხა ტორი უნდა იყოს ღირებულებას მიმატებული მიწოდების ღირებულება");
        cartPageStep.go_to_buy();
        Assert.assertTrue(regAuthorizationPage.authorization_page.is(Condition.visible),"რეგისტრაზია ავტორიზაცის გვერდის გამოსვლა");
    }
}
