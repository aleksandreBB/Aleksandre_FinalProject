package StepObject;

import PageObject.CommonPage;

import static DataObject.CommonPageData.search_input_value;
import static com.codeborne.selenide.Selenide.sleep;


public class CommonPageStep extends CommonPage {
    public CommonPageStep log_in_cart_page(){
        cart_button.click();
        sleep(2000);
        return this;
    }
    public CommonPageStep Search_item(String search_input_value){
        search_input.setValue(search_input_value).pressEnter();
        return this;
    }





}
