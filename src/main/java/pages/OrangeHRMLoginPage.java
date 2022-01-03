package pages;

import constants.FrameWorkConstants;
import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//use BasePage extends not to use same thign again
public final class OrangeHRMLoginPage extends BasePage {

    private final By usernameBox=By.id("txtUsername");
    private final By passwordBox=By.id("txtPassword");
    private final By loginButton=By.id("btnLogin");
    private final By invalidCredsError=By.id("spanMessage");

    //create a method for Username
    public OrangeHRMLoginPage enterUsername(String usernamevalue){
        //driver reference
        //DriverManager.getDriver().findElement(usernameBox).sendKeys(username);
        sendKeys(usernameBox, usernamevalue,"present");
        return this;

    }
    //create a method for Password
    public OrangeHRMLoginPage enterPassword(String passwordvalue){
        //driver reference
       // DriverManager.getDriver().findElement(passwordBox).sendKeys(password);
        sendKeys(passwordBox, passwordvalue,"present");
        return this;

    }

    //create a method for Login button
    public OrangeHRMHomePage clickLoginButton(){
        //driver reference
      //  DriverManager.getDriver().findElement(loginButton).click();
        //click method and login button locator
        click(loginButton,"clickable");
        //after login it will show HomePage
        return new OrangeHRMHomePage();

    }
    //create a method for Invalid login credential
    public String invalidCredsErrorText()  {
        //driver reference
        //Thread.sleep(3000);
        WebDriverWait wait=new WebDriverWait(DriverManager.getDriver(), FrameWorkConstants.getWaittimeinseconds());
        wait.until(ExpectedConditions.elementToBeClickable(invalidCredsError));
       //return DriverManager.getDriver().findElement(invalidCredsError).getText();
        //removing DriverManager for GetTEXT
        return getText(invalidCredsError,"present");


        //create one more Text for InvalidCreds


    }
}
