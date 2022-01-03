package tests;

import constants.FrameWorkConstants;
import driver.Driver;
import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import javax.swing.*;

public final class FirstTest extends  BaseTest {


    @Test

    // create a method
    public void test1()throws InterruptedException{


        DriverManager.getDriver().findElement(By.name("q")).sendKeys("Selenium Automation", Keys.ENTER);

        Thread.sleep(3000);


    }
    @Test

    // create a method
    public void test2()throws InterruptedException{

        DriverManager.getDriver().findElement(By.name("q")).sendKeys("Selenium", Keys.ENTER);

        Thread.sleep(3000);


    }

}


