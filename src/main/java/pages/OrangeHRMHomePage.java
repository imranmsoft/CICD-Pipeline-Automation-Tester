package pages;

import constants.FrameWorkConstants;
import driver.Driver;
import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public final class OrangeHRMHomePage extends BasePage{

    private final By welcomeLink=By.id("welcome");

    private final By logOutButton=By.linkText("Logout");

    //create a method for welcome Link
    public OrangeHRMHomePage clickWelcomeLink(){
        //driver reference
        //DriverManager.getDriver().findElement(welcomeLink).click();
        click(welcomeLink,"clickable");
        return this;

    }
    //create a method for LogOUt
    public OrangeHRMLoginPage logOutButton() {
        //driver reference

       // Thread.sleep(3000);
        //User explicit watit
        WebDriverWait wait=new WebDriverWait(DriverManager.getDriver(), FrameWorkConstants.getWaittimeinseconds());
        wait.until(ExpectedConditions.elementToBeClickable(logOutButton));
       // DriverManager.getDriver().findElement(logOutButton).click();
        click(logOutButton, "clickable");
        return new OrangeHRMLoginPage();

    }



}
