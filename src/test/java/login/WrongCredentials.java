package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;

import static org.testng.Assert.assertTrue;

public class WrongCredentials extends BaseTests {

    @Test
    public  void testWrongCredentials(){
        LoginPage loginPage=  homePage.clickFormAuthentication();
        loginPage.setUserName("ammarrab3a@yahoo.com");
        loginPage.setPassword("P@ssword");
        loginPage.clickLoginButton();
        assertTrue(loginPage.getAlertText()
                        .contains("Invalid credentials provided."),
                "Alert text is incorrect");
    }
}
