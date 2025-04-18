package Day3And4Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.PublicKey;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import static java.lang.System.*;
import static org.openqa.selenium.WebElement.*;

public class CheckboxRediolinkshandling {


    public static WebDriver InitWebdriver(){

        WebDriverManager.chromedriver().getWebDriver();
        WebDriver driver = new ChromeDriver();
        return driver;
    }

    public static String Buildsetup(WebDriver driver) throws InterruptedException {

        Scanner sc = new Scanner(in);
        out.println("get url from user:");
        String Url1 = sc.next();
        out.println("Enter the number of windows to open:");
        driver.manage().window().maximize();
        int numWindows = sc.nextInt();
        driver.get(Url1);
        for (int i = 1; i < numWindows; i++) {
            ((JavascriptExecutor) driver).executeScript("window.open('" + Url1 + "', '_blank');");

        }




        return Url1;
    }


    public static void CreateTaskClass(WebDriver driver,String Url1) throws InterruptedException {

        driver.get(Url1);
        driver.manage().window().maximize();
        String Tittle = driver.getTitle();
        System.out.println(Tittle);

        /*CheckBox*/
        WebElement btn_Checkbox = driver.findElement(By.xpath("//div[@class='accordion']//child::div[@class='element-group'][1]//child::div[@class='element-list collapse show']//child::ul//child::li[@id='item-1']//span[@class='text']"));
        btn_Checkbox.click();
        WebElement lbl_Checkbox = driver.findElement(By.xpath("//ul[@class='menu-list']//following-sibling::li[@id='item-1'][1]//span[contains(text(),'Check Box')]//following::h1[contains(text(),'Check Box')]"));
        String SubtittleCheck = lbl_Checkbox.getText();
        System.out.println(SubtittleCheck);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500);");
        WebElement lbl_Home = driver.findElement(By.xpath("//span[contains(text(),'Home')]"));
        lbl_Home.click();
        WebElement lbl_YouhaveSelectedNotes = driver.findElement(By.xpath("//div[@id='result']"));
        String Home_Result = lbl_YouhaveSelectedNotes.getText();
        System.out.println("Home notes: "+Home_Result);
        WebElement btn_Toggle = driver.findElement(By.xpath("(((//div[@id='tree-node']//child::ol)[1]//child::li)[1]//child::span[@class='rct-text'])[1]//child::button"));
        btn_Toggle.click();
        WebElement lbl_Desktop = driver.findElement(By.xpath("//span[contains(text(),'Desktop')]"));
        lbl_Home.click();
        lbl_Desktop.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        System.out.println("Desktops notes: "+Home_Result);
        lbl_Desktop.click();
        WebElement lbl_Documents = driver.findElement(By.xpath("//span[contains(text(),'Documents')]"));
        lbl_Documents.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        System.out.println("Documents notes: "+Home_Result);
        lbl_Documents.click();
        WebElement lbl_Downloads = driver.findElement(By.xpath("//span[contains(text(),'Downloads')]"));
        lbl_Downloads.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        System.out.println("Download notes: "+Home_Result);

        /*Handiling Radio Button*/
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement btn_Radio = driver.findElement(By.xpath("//div[@class='accordion']//child::div[@class='element-group'][1]//child::div[@class='element-list collapse show']//child::ul//child::li[@id='item-2']//span[@class='text']"));
        btn_Radio.click();
        WebElement lbl_Radiobtn = driver.findElement(By.xpath("//ul[@class='menu-list']//following-sibling::li[@id='item-1'][1]//span[contains(text(),'Check Box')]//following::h1[contains(text(),'Radio Button')]"));
        String SubtittleRadio = lbl_Radiobtn.getText();
        System.out.println(SubtittleRadio);
        WebElement Quet = driver.findElement(By.xpath("//div[contains(text(),'Do you like the site?')]"));
        String RadioQuestion = Quet.getText();
        System.out.println("Print the quest: "+RadioQuestion);
        js.executeScript("window.scrollBy(0, 500);");
        WebElement YesRadio1 = driver.findElement(By.xpath("//*[@id='yesRadio']"));
        WebElement YesRadio = driver.findElement(By.xpath("//label[@for='yesRadio']"));
        WebElement impressiveRadio1 = driver.findElement(By.xpath("//*[@id='impressiveRadio']"));
        YesRadio.click();
        WebElement ImpressiveRadio = driver.findElement(By.xpath("//label[@for='impressiveRadio']"));
        //ImpressiveRadio.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        if (YesRadio1.isSelected()) {
            WebElement MessageforOptions = driver.findElement(By.xpath("//p[contains(text(),'You have selected')]"));
            String MO = MessageforOptions.getText();
            System.out.println(MO);
        } else if (impressiveRadio1.isSelected()) {
            WebElement MessageforOptions = driver.findElement(By.xpath("//p[contains(text(),'You have selected')]"));
            String MO = MessageforOptions.getText();
            System.out.println(MO);
        } else {
            System.out.println("No option selected");
        }
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        /*Links*/

        js.executeScript("window.scrollBy(0, 500);");
        WebElement btn_link = driver.findElement(By.xpath("//div[@class='accordion']//child::div[@class='element-group'][1]//child::div[@class='element-list collapse show']//child::ul//child::li[@id='item-5']//span[@class='text']"));
        btn_link.click();
        WebElement lbl_link = driver.findElement(By.xpath("//ul[@class='menu-list']//following-sibling::li[@id='item-1'][1]//span[contains(text(),'Check Box')]//following::h1[contains(text(),'Links')]"));
        String Linktxt = lbl_link.getText();
        System.out.println(Linktxt);
        WebElement new_tab = driver.findElement(By.xpath("//Strong[contains(text(),'Following links will open new tab')]"));
        String newtabheader = new_tab.getText();
        System.out.println(newtabheader);
        WebElement Home_lnk = driver.findElement(By.xpath("//a[contains(@href,'demoqa') and @id='simpleLink']"));
        Home_lnk.click();
        List<String> windowHandles = driver.getWindowHandles().stream().toList();
        driver.switchTo().window(windowHandles.get(1));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //String Home = driver.getTitle();
        //System.out.println(Home);
        driver.switchTo().window(windowHandles.get(0));
        String mainpage = driver.getTitle();
        System.out.println(mainpage);
        WebElement Home_lnk9v = driver.findElement(By.xpath("//a[contains(@href,'demoqa') and @id='dynamicLink']"));
        //WebElement Createdapi = driver.findElement( By.xpath("//a[contains(@href,'javascript') and @id='created']"));
        //Createdapi.click();
        Home_lnk9v.click();
        driver.switchTo().window(windowHandles.get(1));
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //System.out.println(Home);
        driver.switchTo().window(windowHandles.get(0));
        System.out.println(mainpage);

        /*api call*/
        js.executeScript("window.scrollBy(0, 500);");
        WebElement apicall_lnk = driver.findElement(By.xpath("//Strong[contains(text(),'Following links will send an api call')]"));
        String apicllnktext = apicall_lnk.getText();
        System.out.println(apicllnktext);
        WebElement Created_lnk = driver.findElement(By.xpath("//a[contains(@href,'javascript') and @id='created']"));
        Created_lnk.click();
        WebElement Created_Sts = driver.findElement(By.xpath("//b[contains(text(),'201')]"));
        String Createdstscode = Created_Sts.getText();
        System.out.println(Createdstscode.equals("201"));
        System.out.println("Link has responded with staus 201 and status text Created");

        WebElement Nocont_lnk = driver.findElement(By.xpath("//a[contains(@href,'javascript') and @id='no-content']"));
        Nocont_lnk.click();
        WebElement Nocont_Sts = driver.findElement(By.xpath("//b[contains(text(),'204')]"));
        String Contentstscode = Nocont_Sts.getText();
        System.out.println(Contentstscode.equals("204"));
        System.out.println("Link has responded with staus 204 and status text No Content");

        WebElement Moved_lnk = driver.findElement(By.xpath("//a[contains(@href,'javascript') and @id='moved']"));
        Moved_lnk.click();
        WebElement Moved_Sts = driver.findElement(By.xpath("//b[contains(text(),'301')]"));
        String Movedstscode = Moved_Sts.getText();
        System.out.println(Movedstscode.equals("301"));
        System.out.println("Link has responded with staus 301 and status text Moved Permanently");
        WebElement BadReq_lnk = driver.findElement(By.xpath("//a[contains(@href,'javascript') and @id='bad-request']"));
        BadReq_lnk.click();
        WebElement  Badreq_Sts = driver.findElement(By.xpath("//b[contains(text(),'301')]"));
        String Badreqstscode = Badreq_Sts.getText();
        System.out.println(Badreqstscode.equals("301"));
        System.out.println("Link has responded with staus 301 and status text Moved Permanently");

        WebElement Unauthorized_lnk = driver.findElement(By.xpath("//a[contains(@href,'javascript') and @id='unauthorized']"));
        Unauthorized_lnk.click();
        WebElement  Unauth_Sts = driver.findElement(By.xpath("//b[contains(text(),'401')]"));
        String Unauthstscode = Unauth_Sts.getText();
        System.out.println(Unauthstscode.equals("401"));
        System.out.println("Link has responded with staus 401 and status text Unauthorized");

        WebElement Forbidden_lnk = driver.findElement(By.xpath("//a[contains(@href,'javascript') and @id='forbidden']"));
        Forbidden_lnk.click();
        WebElement  Forbi_Sts = driver.findElement(By.xpath("//b[contains(text(),'403')]"));
        String Forbistscode = Forbi_Sts.getText();
        System.out.println(Forbistscode.equals("403"));
        System.out.println("Link has responded with staus 403 and status text Forbidden");

        WebElement NotFound_lnk = driver.findElement(By.xpath("//a[contains(@href,'javascript') and @id='invalid-url']"));
        NotFound_lnk.click();
        WebElement  NotF_Sts = driver.findElement(By.xpath("//b[contains(text(),'404')]"));
        String NotFstscode = NotF_Sts.getText();
        System.out.println(NotFstscode.equals("404"));
        System.out.println("Link has responded with staus 404 and status text Not Found");

        driver.quit();
    }

}
