package au.com.amp.bett3r.pages;

import au.com.amp.bett3r.appiumDriver.InitDriver;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.util.concurrent.TimeUnit;

/**
 * Created by asit on 14/10/2015.
 */
public class GetStartedPage extends InitDriver{

    public static  void getStarted(){

        AppiumDriver driver =   new InitDriver().getDriver();
        Wait wait=  new FluentWait(driver).withTimeout(20, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
        WebElement getStartedButton = (WebElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//UIAButton[@label='Get started' and @visible='true']")));
        driver.tap(1,getStartedButton,1);

    }

}
