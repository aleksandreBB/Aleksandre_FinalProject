import StepObject.HomePageStep;
import org.testng.annotations.Test;
import utils.Chromerunner;

public class HomePageTest extends Chromerunner {
    HomePageStep homePageStep = new HomePageStep();

    @Test
    public void New_models_slider_Test(){
        homePageStep.scroll_To_New_Slider();
        homePageStep.new_models_slider_size();
        homePageStep.checking_new_icon();
    }
}
