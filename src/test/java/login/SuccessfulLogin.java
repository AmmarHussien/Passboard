package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;

import static org.testng.AssertJUnit.assertEquals;

public class SuccessfulLogin extends BaseTests {

    @Test
    public  void testSuccessfulLogin(){
      LoginPage loginPage=  homePage.clickFormAuthentication();
      loginPage.setUserName("ammarrab3a@yahoo.com");
      loginPage.setPassword("P@ssw0rd");
      loginPage.clickLoginButton();
      loginPage.waiting();
        assertEquals(homePage.getTitle()
                ,"Passboard" );
    }
}
