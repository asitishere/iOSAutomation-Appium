package au.com.amp.bett3r.pages;

import au.com.amp.bett3r.appiumDriver.InitDriver;
import org.openqa.selenium.By;

/**
 * Created by asit on 14/10/2015.
 */
public class TermsAndConditionsPage extends InitDriver{

    public static void termsAndConditions(){

       // AppiumDriver driver =   new InitDriver().getDriver();
        try {
            driver.tap(1, driver.findElement(By.name("I accept")), 2);
        }

        catch(Exception e){
            driver.tap(1, 15, 554, 3);
        }
    }
}
