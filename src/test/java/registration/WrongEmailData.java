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
        registrationPage.SetFirstName("Ammar");
        registrationPage.SetLastName("Hussien");
        registrationPage.SetPhoneNumber("01141182989");
        registrationPage.setPassword("P@ssw0rd");
        registrationPage.ClickCheckBox();
        registrationPage.clickRegistrationButton();
        assertTrue(registrationPage.getEmailValidation()
                        .contains("Invalid email format."),
                "Alert Email is incorrect");
    }
    @Test
    public void TestEmptyEmail(){
        RegistrationPage registrationPage = homePage.ClickRegistration();
        registrationPage.SetEmail("");
        registrationPage.SetFirstName("Ammar");
        registrationPage.SetLastName("Hussien");
        registrationPage.SetPhoneNumber("01141182989");
        registrationPage.setPassword("P@ssw0rd");
        registrationPage.ClickCheckBox();
        registrationPage.clickRegistrationButton();
        assertTrue(registrationPage.getEmailValidation()
                        .contains("Please enter the Email address."),
                "Alert Email is incorrect");
    }
    @Test
    public void testAlreadyExistEmail() {
        RegistrationPage registrationPage = homePage.ClickRegistration();
        registrationPage.SetEmail("ammarrab3a@yahoo.com");
        registrationPage.SetFirstName("Ammar");
        registrationPage.SetLastName("Hussien");
        registrationPage.SetPhoneNumber("01141182989");
        registrationPage.setPassword("P@ssw0rd");
        registrationPage.ClickCheckBox();
        registrationPage.clickRegistrationButton();
        registrationPage.getAlert();
        assertTrue(registrationPage.getAlert()
                        .contains("Email is already in use"),
                "Alert Email is incorrect");
    }
}
