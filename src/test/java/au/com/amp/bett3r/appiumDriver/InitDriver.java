package au.com.amp.bett3r.appiumDriver;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by asit on 8/10/2015.
 */

public class InitDriver {

public static  AppiumDriver driver=null;


    public static AppiumDriver getDriver() {
        if (driver == null) {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("platformName", "iOS");
            caps.setCapability("platformVersion", "8.4"); //Replace this with your iOS version
            caps.setCapability("deviceName", "iPhone 6"); //Replace this with your simulator/device version
            caps.setCapability("autoAcceptAlerts",true);
           // caps.setCapability("app", "/Users/asit/Library/Developer/Xcode/DerivedData/AMP-dkwfojiyjodxieewwrtopwhavwof/Build/Products/SYS-iPhone-iphonesimulator/AMP.app");
           // caps.setCapability("app", "/Users/asit/Library/Developer/Xcode/DerivedData/AMP-dkwfojiyjodxieewwrtopwhavwof/Build/Products/MOCK-iPhone-iphonesimulator/AMP.app");
            caps.setCapability("app", "/Users/asit/Library/Developer/Xcode/DerivedData/AMP-dkwfojiyjodxieewwrtopwhavwof/Build/Products/UAT-iPhone-iphonesimulator/AMP.app");


            URL uri = null;
            try {
                uri = new URL("http://127.0.0.1:4723/wd/hub");
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }


            driver = new AppiumDriver(uri, caps) {
                public WebElement scrollTo(String text) {
                    return null;
                }

                public WebElement scrollToExact(String text) {
                    return null;
                }
            };
            return driver;
        } else {
            return driver;
        }
    }
}
