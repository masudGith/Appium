
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DialNum {


    public static AppiumDriver<MobileElement> driver;


    public static void calculatorOpen() throws Exception {

//        Device Configuration

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "Micromax B5 Pro");
        cap.setCapability("udid", "GP02360051011803");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "8.1.0");
        // Apps Configuration
        cap.setCapability("appPackage", "com.android.phone");
        cap.setCapability("appActivity", "com.android.phone.EmergencyDialer");


//        Appium Driver
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver<MobileElement>(url, cap);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Application is started...");


        driver.findElement(By.id("com.android.phone:id/zero")).click();
        driver.findElement(By.id("com.android.phone:id/one")).click();
        driver.findElement(By.id("com.android.phone:id/seven")).click();
        driver.findElement(By.id("com.android.phone:id/eight")).click();
        driver.findElement(By.id("com.android.phone:id/five")).click();
        driver.findElement(By.id("com.android.phone:id/two")).click();
        driver.findElement(By.id("com.android.phone:id/zero")).click();
        driver.findElement(By.id("com.android.phone:id/nine")).click();
        driver.findElement(By.id("com.android.phone:id/one")).click();
        driver.findElement(By.id("com.android.phone:id/two")).click();
        driver.findElement(By.id("com.android.phone:id/one")).click();
        driver.findElement(By.id("com.android.phone:id/dialpad")).click();
        System.out.println("Application is Closed");


    }

    public static void main(String[] args) throws Exception {

        try {
            calculatorOpen();
        } catch (Exception e) {
            System.out.println("Exception: "+e);
            System.out.println("Message: "+e.getMessage());
            System.out.println("Causes: "+e.getCause());
            System.out.println("Traces: "+e.getStackTrace());
            System.out.println("Device not found");

        }
    }
}