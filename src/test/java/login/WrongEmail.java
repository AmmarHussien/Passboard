package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;

import static org.testng.Assert.assertTrue;

public class WrongEmail extends BaseTests {

    @Test
    public  void testWrongUsername(){
        LoginPage loginPage=  homePage.clickFormAuthentication();
        loginPage.setUserName("tomsmiths");
        loginPage.setPassword("P@ssw0rd");
        loginPage.clickLoginButton();
        assertTrue(loginPage.getEmailAlert()
                        .contains("Invalid email format"),
                "Alert text is incorrect");
    }
}
