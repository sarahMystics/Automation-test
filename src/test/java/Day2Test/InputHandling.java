package Day2Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class InputHandling {

    public static WebDriver InitWebdriver(){

        WebDriverManager.chromedriver().getWebDriver();
        WebDriver driver = new ChromeDriver();
        return driver;
    }

    public static String OpenWindow(WebDriver driver){

        Scanner sc = new Scanner(System.in);
        System.out.println("get url from user:");
        String Url = sc.next();
        driver.manage().window().maximize();

         return Url;
    }

    public static void DoTextBox(WebDriver driver,String Url) throws IOException {

        driver.get(Url);
        String Tittle = driver.getTitle();
        System.out.println(Tittle);

        WebElement TxtBoxbtn = driver.findElement(By.xpath("//span[contains(text(),'Text Box')]"));
        TxtBoxbtn.click();
        WebElement element = driver.findElement(By.xpath("//h1[contains(text(),'Text Box')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        WebElement FullName = driver.findElement(By.xpath("//input[@id='userName']"));
        FullName.clear();
        FullName.sendKeys("Saranya DaraniDaran");
        WebElement Email = driver.findElement(By.xpath("//input[@id='userEmail']"));
        Email.clear();
        Email.sendKeys("Sara@gmail.com");
        WebElement CurrenAddress = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        CurrenAddress.clear();
        CurrenAddress.sendKeys("No;14 Sms St, Chennai-89");
        WebElement PermenentAddress = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        PermenentAddress.clear();
        PermenentAddress.sendKeys("NO:10 Nerunagar, Chennai-19");
        WebElement Submitbtn = driver.findElement(By.xpath("//button[@id='submit']"));
        Submitbtn.click();
        WebElement Output = driver.findElement(By.xpath("//div[@id='output']"));
        String text = Output.getText();
        System.out.println(text);
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destination = new File("C:\\Users\\Saranya\\IdeaProjects\\Automation-test\\Assets\\screenshot.png");
        FileHandler.copy(screenshot, destination);
    }

    public static void CloseWindow(WebDriver driver){
      driver.quit();
    }

}
