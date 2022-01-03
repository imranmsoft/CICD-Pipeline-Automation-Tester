package tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.OrangeHRMHomePage;
import pages.OrangeHRMLoginPage;

//EXtending BaseTest for initializing Driver
public class OrangeHRMTest extends BaseTest {

    //create constructor
    private OrangeHRMTest(){}

    //create a method for loginTest

    @Test
    public void loginTest() {

        //create object for OrangeHRMLoginPage and OrangeHRMHomePage

        OrangeHRMLoginPage lp = new OrangeHRMLoginPage();
        //OrangeHRMHomePage hp =new OrangeHRMHomePage();

        //call teh methods by using object
        lp.enterUsername("admin")
                .enterPassword("admin123")
                .clickLoginButton()
          //homePage
                .clickWelcomeLink()
                .logOutButton(); //error showing for thread.sleep
        //go to the testNGXML

    }
    @Test
    public void inValidCredsTest(){

        //create object for OrangeHRMLoginPage and OrangeHRMHomePage

        OrangeHRMLoginPage lp = new OrangeHRMLoginPage();

        //call teh methods by using object
        lp.enterUsername("adminadd")
          .enterPassword("admin123dfdsf")
          .clickLoginButton();

       Assert.assertEquals(lp.invalidCredsErrorText(), "Invalid credentials");
    }


}
