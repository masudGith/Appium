import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Calculator {

    public static AppiumDriver<MobileElement> driver;

    public static void calculatorOpen() throws Exception {

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "Micromax B5 Pro");
        cap.setCapability("deviceVersion", "8.1.0");
        cap.setCapability("udid", "GP02360051011803");
        cap.setCapability("platformName", "Android");


        cap.setCapability("appPackage", "com.android.calculator2");
        cap.setCapability("appActivity", "com.android.calculator2.view.BaseActivity");


        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver<MobileElement>(url, cap);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Application is started...");


        driver.findElement(By.id("com.android.calculator2:id/digit7")).click();
        //driver.findElement(By.id("com.android.calculator2:id/plus")).click();   //for "(7+8)"
        //driver.findElement(By.id("com.android.calculator2:id/minus")).click();  //for "(7-8)"
        //driver.findElement(By.id("com.android.calculator2:id/mul")).click();    //for "(7*8)"
        driver.findElement(By.id("com.android.calculator2:id/div")).click();    //for "(7/8)"
        driver.findElement(By.id("com.android.calculator2:id/digit8")).click();
        driver.findElement(By.id("com.android.calculator2:id/equal")).click();
        // for result (7+8)=15
        //MobileElement result = driver.findElement(By.xpath("//android.widget.ListView/android.widget.LinearLayout/android.widget.TextView"));
        // for result (7-8)=-1
        //MobileElement result = driver.findElement(By.xpath("//android.widget.ListView/android.widget.LinearLayout/android.widget.TextView"));
        //for result (7*8)=56
        //MobileElement result = driver.findElement(By.xpath("//android.widget.ListView/android.widget.LinearLayout/android.widget.TextView"));
        //for result (7/8)=0.875
        MobileElement result = driver.findElement(By.xpath("//android.widget.ListView/android.widget.LinearLayout/android.widget.TextView"));

        System.out.println("Result is : " + result.getText());
        System.out.println("Application is closed");
    }

    public static void main (String[]args) throws Exception {

            try {
                calculatorOpen();
            } catch (Exception e) {
                System.out.println("Exception: " + e);
                System.out.println("Message: " + e.getMessage());
                System.out.println("cause: " + e.getCause());
                System.out.println("Traces: " + e.getStackTrace());
                System.out.println("Device not found");
            }

        }



}