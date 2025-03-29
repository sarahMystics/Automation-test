import java.io.IOException;

import static Day1Test.TestDriver.chromeHealth;
import static Day1Test.TestDriver.firefoxHealth;
import static Day2Test.InputHandling.*;
import static Day3And4Test.CheckboxRediolinkshandling.Buildsetup;
import static Day3And4Test.CheckboxRediolinkshandling.CreateTaskClass;

public class Main {

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
      String Url1 = Buildsetup(driver);
      CreateTaskClass(driver,Url);
      //CloseWindow(driver);

    }

}
