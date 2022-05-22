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
                    "Alert Phone Number is incorrect");
        }
    }
    @Test
    public void EmptyNumber() {
        RegistrationPage registrationPage = homePage.ClickRegistration();
        registrationPage.SetPhoneNumber("");
        registrationPage.clickRegistrationButton();
        if(registrationPage.getPhoneNumber().length() == 0) {
            assertTrue(registrationPage.getPhoneNumberValidation()
                            .contains("Please enter your cellphone."),
                    "Alert Phone Number is incorrect");
        }
    }
    @Test
    public void LongNumber() {
        RegistrationPage registrationPage = homePage.ClickRegistration();
        registrationPage.SetPhoneNumber("011460829899");
        registrationPage.clickRegistrationButton();
        if(registrationPage.getPhoneNumber().length() > 11) {
            assertTrue(registrationPage.getPhoneNumberValidation()
                            .contains("Too Long!"),
                    "Alert Phone Number is incorrect");
        }
    }
}
