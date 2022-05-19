package registration;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.RegistrationPage;

import static org.testng.Assert.assertTrue;

public class WrongPhoneNumber extends BaseTests {
    @Test
    public void ShortNumber() {
        RegistrationPage registrationPage = homePage.ClickRegistration();
        registrationPage.SetPhoneNumber("0114608298");
        registrationPage.clickRegistrationButton();
        if(registrationPage.getPhoneNumber().length() < 11) {
            assertTrue(registrationPage.getPhoneNumberValidation()
                            .contains("Too Short!"),
                    "Alert text is incorrect");
        }
    }

}
