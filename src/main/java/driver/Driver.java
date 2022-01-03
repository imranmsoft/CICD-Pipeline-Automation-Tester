package driver;

import constants.FrameWorkConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ReadPropertyFile;

import java.util.Objects;


public final class Driver  {

    //add constructor
    private  Driver(){}
    //global variable
    //public static WebDriver driver;

    //initilize driver
    public static void initDriver() throws Exception {

        // checkign it is NULL or not
       if(Objects.isNull(DriverManager.getDriver())){
            System.setProperty("webdriver.chrome.driver", FrameWorkConstants.getChromeDriverPath());

            WebDriver driver = new ChromeDriver();
            //set driver
           DriverManager.setDriver(driver);

            //open the url
           // hardocoded url should be removed and call from getproperty
          // DriverManager.getDriver().get("https://google.com");
           DriverManager.getDriver().get(ReadPropertyFile.getValue("url"));

        }
    }
    //quit driver
    public static void quitDriver() {
       if (Objects.nonNull(DriverManager.getDriver())) {

           /* call teh getDriver method from DriverManager */
            DriverManager.getDriver().quit();

            //call the unload method from DriverManager
            DriverManager.unload();
        }
    }
}
