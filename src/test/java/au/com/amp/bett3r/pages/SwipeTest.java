package au.com.amp.bett3r.pages;

import au.com.amp.bett3r.appiumDriver.InitDriver;
import io.appium.java_client.MobileElement;
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
public class SwipeTest extends InitDriver{

    public static void swipeMe(){

       // AppiumDriver driver =   new InitDriver().getDriver();
        Wait wait=  new FluentWait(driver).withTimeout(20, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
        WebElement setUpMyAMPaccess = (WebElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@name ='Set up My AMP access']")));
        driver.tap(1, setUpMyAMPaccess, 1);

        WebElement showBookmarks = (WebElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@name ='Show Bookmarks']")));
        driver.tap(1, showBookmarks, 1);

        MobileElement mob= (MobileElement) driver.findElementByName("Favorites");

        mob.zoom();

        /*ProcessBuilder processBuilder = new ProcessBuilder(
                "python",
                "/Users/asit/Desktop/swipeInWindow.py",
                "Favorites", "0.5", "0.9", "0.5", "0.3");
        try {
            processBuilder.start();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }
}
