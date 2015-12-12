package au.com.amp.bett3r.pages;

import au.com.amp.bett3r.appiumDriver.InitDriver;
import au.com.amp.bett3r.helpers.StringManupulation;
import org.openqa.selenium.By;

/**
 * Created by asit on 9/10/2015.
 */
public class SetYourPinPage extends InitDriver {


    public static void setPin(){

        try {

            driver.findElement(By.name("1")).click();
        }

        catch(Exception e){

            driver.tap(1,driver.findElement(By.name("1")),2);
        }

        try {

            driver.findElement(By.name("1")).click();
        }

        catch(Exception e){
            driver.tap(1,driver.findElement(By.name("1")),2);
        }

        try {

            driver.findElement(By.name("1")).click();
        }

        catch(Exception e){
            driver.tap(1,driver.findElement(By.name("1")),2);
        }

        try {

            driver.findElement(By.name("1")).click();
        }

        catch(Exception e){
            driver.tap(1,driver.findElement(By.name("1")),2);
        }

    }

    public static void confirmPin(){


        try {

            driver.findElement(By.name("1")).click();
        }

        catch(Exception e){

            driver.tap(1,driver.findElement(By.name("1")),2);
        }

        try {

            driver.findElement(By.name("1")).click();
        }

        catch(Exception e){
            driver.tap(1,driver.findElement(By.name("1")),2);
        }

        try {

            driver.findElement(By.name("1")).click();
        }

        catch(Exception e){
            driver.tap(1,driver.findElement(By.name("1")),2);
        }

        try {

            driver.findElement(By.name("1")).click();
        }

        catch(Exception e){
            driver.tap(1,driver.findElement(By.name("1")),2);
        }
    }

    public static void setThePin(String pin){

        for (String output : StringManupulation.splitTheWordToChar(pin)) {
                driver.tap(1,driver.findElement(By.name(output)),2);
        }

    }
    public static  void verifyThePin(String pin){
        setThePin(pin);
    }

}
