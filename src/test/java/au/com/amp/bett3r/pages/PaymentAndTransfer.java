package au.com.amp.bett3r.pages;

import au.com.amp.bett3r.appiumDriver.InitDriver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
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
public class PaymentAndTransfer extends InitDriver{


    public static void clickPaymentsAndTransfers(){
       // AppiumDriver driver =   new InitDriver().getDriver();
        Wait wait=  new FluentWait(driver).withTimeout(20, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
        WebElement paymentAndTransfer = (WebElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@name ='Payments and transfers']")));
        driver.tap(1,paymentAndTransfer,2);
    }

    public static void clickOnExternalAccounts(){
      //  AppiumDriver driver =   new InitDriver().getDriver();
        Wait wait=  new FluentWait(driver).withTimeout(20, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
        WebElement paymentAndTransfer = (WebElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@name ='External accounts']")));
        driver.tap(1,paymentAndTransfer,1);
        driver.tap(1, paymentAndTransfer, 1);

    }


    public static void swipeAccount(){
        AppiumDriver driver =   new InitDriver().getDriver();
        Wait wait=  new FluentWait(driver).withTimeout(20, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
        WebElement testAccount= (WebElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@name ='AMPAccountListTableViewCell_0_0']")));

        TouchAction touchMe= new TouchAction(driver);
        ((TouchAction)touchMe).press(0,437).waitAction(1000).moveTo(0,337).release().perform();

       // driver.swipe(15, 447,0,437,2);




    }

}
