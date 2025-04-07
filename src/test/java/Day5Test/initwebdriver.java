package Day5Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class initwebdriver {

   public static void initwebdriver(){

    }
    public static WebDriver Initdriver(){

        WebDriverManager.chromedriver().getWebDriver();
        WebDriver driver = new ChromeDriver();
        return driver;

    }
}
