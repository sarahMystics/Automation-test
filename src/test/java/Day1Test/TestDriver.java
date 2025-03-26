package Day1Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestDriver {

    static String ChromeURL = "http://www.google.com";
    static String chrometitle = "";
    static String DDURL = "https://daily.dev";
    static String message = "";

    public static String chromeHealth(){
        WebDriverManager.chromedriver().getWebDriver();
        WebDriver driver = new ChromeDriver();
        message =  helper(driver , ChromeURL);
        driver.close();
        return chrometitle;
    }

    public static String firefoxHealth(){
        WebDriverManager.firefoxdriver().getWebDriver();
        WebDriver driver = new FirefoxDriver();
        message = helper(driver , DDURL);
        driver.close();
        return message;
    }

    public static String helper(WebDriver driver,String url){
        driver.get(url);
        driver.manage().window().maximize();
        return driver.getTitle();
    }

}
