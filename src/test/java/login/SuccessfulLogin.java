package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;

import static org.testng.Assert.assertTrue;

public class SuccessfulLogin extends BaseTests {

    @Test
    public  void testSuccessfulLogin(){
      LoginPage loginPage=  homePage.clickFormAuthentication();
      loginPage.setUserName("ammarrab3a@yahoo.com");
      loginPage.setPassword("P@ssw0rd");
      loginPage.clickLoginButton();
      assertTrue(homePage.getTitle()
              .contains("Passboard"),
              "Alert text is incorrect");
    }
}
