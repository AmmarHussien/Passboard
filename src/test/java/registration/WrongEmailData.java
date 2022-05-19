package registration;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.RegistrationPage;

import static org.testng.Assert.assertTrue;

public class WrongEmailData extends BaseTests {
    @Test
    public void TestWrongEmailFormat(){
        RegistrationPage registrationPage = homePage.ClickRegistration();
        registrationPage.SetEmail("ammar");
        registrationPage.clickRegistrationButton();
        assertTrue(registrationPage.getEmailValidation()
                        .contains("Invalid email format."),
                "Alert text is incorrect");
    }
    @Test
    public void TestEmptyEmail(){
        RegistrationPage registrationPage = homePage.ClickRegistration();
        registrationPage.SetEmail("");
        registrationPage.clickRegistrationButton();
        assertTrue(registrationPage.getEmailValidation()
                        .contains("Please enter the Email address."),
                "Alert text is incorrect");
    }
}
