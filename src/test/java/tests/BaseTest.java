package tests;

import constants.FrameWorkConstants;
import driver.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    //this method protected will be used for same packages all calasses

    protected BaseTest(){}

    //global method

    // before and after method using two chrome will launch
    //adding testng.xml file parallel=methods, test-count=2
    //after running stale element error will show, so create Driver maanager class

    @BeforeMethod
    public void startUp() throws Exception {

        //call initdriver using Driver class
        Driver.initDriver();


    }
    @AfterMethod
    public void tearDown(){
        //call quitDriver using Driver class
    Driver.quitDriver();

    }
}
