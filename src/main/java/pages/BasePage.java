package pages;

import constants.FrameWorkConstants;
import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    //use protected to use it in the same package SendKeys

    protected  void sendKeys(By by, String value, String waitStrategy){
        if(waitStrategy.equalsIgnoreCase("clickable")){
            waitForElementToBeClickable(by);
        }else if(waitStrategy.equalsIgnoreCase("present")){
            waitForElementToPresent(by);
        }
        DriverManager.getDriver().findElement(by).sendKeys(value);

    }
    //click

    protected void click(By by,String waitStrategy){
        if(waitStrategy.equalsIgnoreCase("clickable")){
            waitForElementToBeClickable(by);
        }else if(waitStrategy.equalsIgnoreCase("present")){
            waitForElementToPresent(by);
        }
        DriverManager.getDriver().findElement(by).click();
    }

    //gettext
    protected String getText(By by,String waitStrategy){
        if(waitStrategy.equalsIgnoreCase("clickable")){
            waitForElementToBeClickable(by);
        }else if(waitStrategy.equalsIgnoreCase("present")){
            waitForElementToPresent(by);
        }
        return DriverManager.getDriver().findElement(by).getText();
        //return null;
    }

    //now use Login and HomePage and remove DriverManager from there

    //wait method having by locator
    private void waitForElementToBeClickable(By by){
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), FrameWorkConstants.getWaittimeinseconds());
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    //another wait Method to remove hardcoded wait time

    private void waitForElementToPresent(By by){
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), FrameWorkConstants.getWaittimeinseconds());
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
    }
}
