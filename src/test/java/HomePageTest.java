import StepObject.HomePageStep;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import utils.Chromerunner;

public class HomePageTest extends Chromerunner {
    HomePageStep homePageStep = new HomePageStep();

    @Test
    @Description ("მთავარ გვერძე ახალი მოდელების სლაიდერის ტესტი, ნამდვილად აქვს თუ არა ყველა ნივთს NEW ნიშანი")
    @Severity(SeverityLevel.NORMAL)
    public void new_models_slider_Test(){
        homePageStep.scroll_To_New_Slider();
        homePageStep.new_models_slider_size();
        homePageStep.checking_new_icon();
    }
    @Test
    @Description ("მთავარ გვერძე ფასდაკლებული ნივთების სლაიდერის ტესტი, ნამდვილად აქვს თუ არა ყველა ნივთს დაკლებული ფასი")
    @Severity(SeverityLevel.NORMAL)
    public void sale_slider_Test(){
        homePageStep.scroll_To_sale_Slider();
        homePageStep.sale_slider_size();
        homePageStep.checking_crossed_out_price();
    }
}
