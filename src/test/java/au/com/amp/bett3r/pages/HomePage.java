package au.com.amp.bett3r.pages;

import au.com.amp.bett3r.appiumDriver.InitDriver;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by asit on 14/10/2015.
 */
public class HomePage extends InitDriver{


    public static void clickNavMenu() {
        AppiumDriver driver = new InitDriver().getDriver();
        Wait wait = new FluentWait(driver).withTimeout(20, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
        WebElement navMenu = (WebElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@name ='navMenuButton']")));
        driver.tap(1, navMenu, 2);
    }

    public static void clickReorderIcon() {
       AppiumDriver driver = new InitDriver().getDriver();
        Wait wait = new FluentWait(driver).withTimeout(20, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
        WebElement navMenu = (WebElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@name ='Reorder icon']")));
        driver.tap(1, navMenu, 2);
    }

    public static String getBett3rAccount() {
       AppiumDriver driver = new InitDriver().getDriver();
        Wait wait = new FluentWait(driver).withTimeout(20, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
        WebElement bett3rAccount = (WebElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@name ='Bett3r account']")));
        return bett3rAccount.getText().trim();
    }

    public static List<String> getBett3rAccountDetails() {
        AppiumDriver driver = new InitDriver().getDriver();
        Wait wait = new FluentWait(driver).withTimeout(20, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
        List<String> accountList= new ArrayList<>();

        WebElement saveAccount = (WebElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@name ='Save']")));
        accountList.add(saveAccount.getText().trim());

        WebElement payAccount = (WebElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@name ='Pay']")));
        accountList.add(payAccount.getText().trim());

        WebElement spendAccount = (WebElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@name ='Spend']")));
        accountList.add(spendAccount.getText().trim());

        return accountList;

    }

    public static String getSaveBalance() {
        AppiumDriver driver = new InitDriver().getDriver();
        Wait wait = new FluentWait(driver).withTimeout(20, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
        WebElement saveBalance = (WebElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[3]/UIAStaticText[4]")));
        return saveBalance.getText().trim();
    }

    public static String getSPayBalance() {
        AppiumDriver driver = new InitDriver().getDriver();
        Wait wait = new FluentWait(driver).withTimeout(20, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
        WebElement payBalance = (WebElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[4]/UIAStaticText[4]")));
        return payBalance.getText().trim();
    }

    public static String getSpendBalance() {
        AppiumDriver driver = new InitDriver().getDriver();
        Wait wait = new FluentWait(driver).withTimeout(20, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
        WebElement spendBalance = (WebElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[5]/UIAStaticText[4]")));
        return spendBalance.getText().trim();
    }

}
