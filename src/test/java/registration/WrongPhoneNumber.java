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
            assertTrue(registrationPage.getPhoneNumberValidation()
                            .contains("Too Short!"),
                    "Alert Phone Number is incorrect");
    }
    @Test
    public void EmptyNumber() {
        RegistrationPage registrationPage = homePage.ClickRegistration();
        registrationPage.SetPhoneNumber("");
        registrationPage.clickRegistrationButton();
            assertTrue(registrationPage.getPhoneNumberValidation()
                            .contains("Please enter your cellphone."),
                    "Alert Phone Number is incorrect");
    }
    @Test
    public void LongNumber() {
        RegistrationPage registrationPage = homePage.ClickRegistration();
        registrationPage.SetEmail("ammarasdrab3a@yahoo.com");
        registrationPage.SetFirstName("Ammar");
        registrationPage.SetLastName("Hussien");
        registrationPage.SetPhoneNumber("0114608298999");
        registrationPage.setPassword("P@ssw0rd");
        registrationPage.ClickCheckBox();
        registrationPage.clickRegistrationButton();
            assertTrue(registrationPage.getPhoneNumberValidation()
                            .contains("Too Long!"),
                    "Alert Phone Number is incorrect");
    }
    @Test
    public void testAlreadyExistPhoneNumber() {
        RegistrationPage registrationPage = homePage.ClickRegistration();
        registrationPage.SetEmail("ammarasdrab3a@yahoo.com");
        registrationPage.SetFirstName("Ammar");
        registrationPage.SetLastName("Hussien");
        registrationPage.SetPhoneNumber("01146082989");
        registrationPage.setPassword("P@ssw0rd");
        registrationPage.ClickCheckBox();
        registrationPage.clickRegistrationButton();
        registrationPage.getAlert();
        assertTrue(registrationPage.getAlert()
                        .contains("Phone is already in use"),
                "Alert Email is incorrect");
    }
}
