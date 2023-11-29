package utils;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.open;

public class Chromerunner {
    @BeforeMethod(description = "იხსნება ზუმერის გვერდი 1920x1080 გაფართოებით")
    public void setUp(){
        Configuration.browserSize = "1920x1080";
        open("https://www.zoommer.ge/");
    }


    @AfterMethod(description = "ქეშის და ბრაუზერის ლოკალური მეხსიერების გასუფთავება")
    public void tearDown(){
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
//        Selenide.closeWindow();
//        Selenide.closeWebDriver();
    }
}
