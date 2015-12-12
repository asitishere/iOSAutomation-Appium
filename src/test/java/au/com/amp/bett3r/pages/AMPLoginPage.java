package au.com.amp.bett3r.pages;

import au.com.amp.bett3r.appiumDriver.InitDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.util.concurrent.TimeUnit;

public class AMPLoginPage extends InitDriver {

    public static void loginToAMPApp(String userId, String password) {

        Wait wait = new FluentWait(driver).withTimeout(20, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
        WebElement userLogin = (WebElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@value ='Username']")));
        WebElement userPassword = (WebElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@value ='Password']")));
        driver.tap(1, userLogin, 2);
        driver.executeScript("target.frontMostApp().keyboard().typeString('" + userId + "')");
        driver.tap(1, userPassword, 2);
        driver.executeScript("target.frontMostApp().keyboard().typeString('" + password + "')");
        driver.tap(1, driver.findElement(By.name("Go")), 2);

    }

}
