package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;

import static org.testng.Assert.assertTrue;

public class WrongEmail extends BaseTests {

    @Test
    public void testWrongEmail(){
        LoginPage loginPage=  homePage.clickFormAuthentication();
        loginPage.setUserName("ammar");
        loginPage.setPassword("P@ssw0rd");
        loginPage.clickLoginButton();
        assertTrue(loginPage.getEmailAlert()
                        .contains("Invalid email format"),
                "Alert text is incorrect");
    }
}
