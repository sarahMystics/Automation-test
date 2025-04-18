import Day5Test.User;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.Scanner;

import static Day1Test.TestDriver.chromeHealth;
import static Day1Test.TestDriver.firefoxHealth;
import static Day2Test.InputHandling.*;
import static Day3And4Test.CheckboxRediolinkshandling.Buildsetup;
import static Day3And4Test.CheckboxRediolinkshandling.CreateTaskClass;
import static java.lang.System.in;
import static java.lang.System.out;


public class Main {
  public static Object initWebDriver;

  //Methods
    //Memory
    //Keywords [new , static]
    //Parameter, arguments
    //stack & heap
    //Data type

    public static void main(String[] args) throws IOException, InterruptedException {
//
//      var result = chromeHealth();
//      System.out.println(result);
//
//      var Fx = firefoxHealth();
//      System.out.println(Fx);

        /* Open respective app and validate text box and fill the text box form and close the drive*/
      var driver = InitWebdriver();
       String Url = OpenWindow(driver);
      //DoTextBox(driver, Url);
      //String Url1 = Buildsetup(driver);
      //CreateTaskClass(driver,Url);
      //CloseWindow(driver);
        /*............................................................*/
        Scanner sc = new Scanner(in);
        //out.println("get url from user:");
        //String ChromeURL = sc.next();
        out.println("get first name from user:");
        String FName = sc.next();
        out.println("get last name from user:");
        String LName = sc.next();
        out.println("get email from user:");
        String email = sc.next();
        out.println("get mobile number from user:");
        String MobileNum = sc.next();
        out.println("get Dob from user:");
        String Dob = sc.next();
        out.println("get Subject from user:");
        String Subjects = sc.next();
        out.println("get Current address from user:");
        String CurentAddress = sc.next();
        out.println("get State name from user");
        String State = sc.next();
        out.println("get City name from user");
        String City = sc.next();

        User user = new User(FName,LName,email,MobileNum,Dob,Subjects,CurentAddress,State,City);
        user.getform(driver,Url);
        user.fillform(driver);
        driver.close();


    }

}
