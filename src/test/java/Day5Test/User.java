package Day5Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static java.lang.System.out;

public class User extends Userform {

    String State = "";
    //String ChromeURL = "";
    String FName = "";
    String LName = "";
    String email = "";
    String MobileNum = "";
    String Dob = "";
    String Subjects = "";
    String CurrentAddress = "";
    String City = "";

    public User(String FName, String LName, String email, String MobileNum, String Dob, String Subjects, String CurrentAddress, String State, String City) {

        //this.ChromeURL = ChromeURL;
        this.FName = FName;
        this.LName = LName;
        this.email = email;
        this.MobileNum = MobileNum;
        this.Dob = Dob;
        this.Subjects = Subjects;
        this.CurrentAddress = CurrentAddress;
        this.State = State;
        this.City = City;



    }




    @Override
    public void fillform(WebDriver driver) {

        WebElement Form = driver.findElement(By.xpath("(//*[contains(text(),'Forms')]//following::div[@class='icon'])[1]"));
        Form.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement practiceform = driver.findElement(By.xpath("//*[contains(text(),'Practice Form')]"));
        practiceform.click();
        driver.findElement(By.id("firstName")).sendKeys(this.FName);
        driver.findElement(By.id("lastName")).sendKeys(this.LName);
        driver.findElement(By.id("userEmail")).sendKeys(this.email);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 300);");
        WebElement gender = driver.findElement(By.xpath("(//div[@id='genterWrapper']//input)[2]//following::label[1]"));
        gender.click();
        driver.findElement(By.id("userNumber")).sendKeys(this.MobileNum);
        //driver.findElement(By.id("dateOfBirthInput")).sendKeys(this.Dob);
        //driver.findElement(By.id("subjectsContainer")).click();
        //driver.findElement(By.id("subjectsContainer")).sendKeys(this.Subjects);
        WebElement hobbies = driver.findElement(By.xpath("(//div[@id='hobbiesWrapper']//input)[3]//following::label[1]"));
        hobbies.click();
        WebElement Picture = driver.findElement(By.id("uploadPicture"));
        Picture.sendKeys("C:\\Users\\Saranya\\Documents\\Programs types - filehandling.txt");
        driver.findElement(By.id("currentAddress")).sendKeys(this.CurrentAddress);
        js.executeScript("window.scrollBy(0, 300);");
        driver.findElement(By.id("state")).sendKeys(this.State);
        driver.findElement(By.id("city")).sendKeys(this.City);
        driver.findElement(By.id("submit")).click();



    }
}
