package Day5Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

abstract class  Userform{


    public void getform(WebDriver driver, String Url){

        driver.get(Url);
        String formTitle = driver.getTitle();
        System.out.println("Form Title: " + formTitle);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500);");

    }

    public abstract void fillform(WebDriver driver);
}


