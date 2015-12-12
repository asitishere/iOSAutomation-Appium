package au.com.amp.bett3r.pages;

import au.com.amp.bett3r.appiumDriver.InitDriver;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/**
 * Created by asit on 10/11/2015.
 */
public class PayPage extends InitDriver {

    public static void clickPay() {
        AppiumDriver driver =   new InitDriver().getDriver();
        Wait wait=  new FluentWait(driver).withTimeout(20, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
        WebElement payLink = (WebElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[3]/UIAStaticText[1]")));
        driver.tap(1,payLink,2);
    }

    public static void touchMe(){
        AppiumDriver driver =   new InitDriver().getDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        HashMap <String, String> scrollObject = new HashMap <String, String>();
        scrollObject.put("direction","down");
        scrollObject.put("element", ((RemoteWebElement) driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAElement[1]/UIAElement[2]/UIATableView[1]/UIATableCell[2]"))).getText());

        WebElement forecastTable = driver.findElementByName("AMPBetterForecastTableViewCell_0_1");
        System.out.println(forecastTable.getText());

        WebElement buttonOccurrence = forecastTable.findElement(By.name("buttonOccurrence"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();",buttonOccurrence);

    }

    public static void clickMoreButton(){
        AppiumDriver driver =   new InitDriver().getDriver();
        Wait wait = new FluentWait(driver).withTimeout(20, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
        WebElement moreButton = (WebElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@name='moreButton']")));
        driver.tap(1, moreButton, 2);
       // moreButton.click();
    }

    public static void tapManageMyIncome(){
        AppiumDriver driver =   new InitDriver().getDriver();
        Wait wait = new FluentWait(driver).withTimeout(20, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
        WebElement manageMyIncome = (WebElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@label='Manage my income']")));
        driver.tap(1,manageMyIncome,2);

    }
}
