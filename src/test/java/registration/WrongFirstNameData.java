package registration;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.RegistrationPage;

import static org.testng.Assert.assertTrue;

public class WrongFirstNameData extends BaseTests {

    @Test
    public void testShortFirstNameData() {
        RegistrationPage registrationPage = homePage.ClickRegistration();
        registrationPage.SetFirstName("a");
        registrationPage.SetLastName("Hussien");
        registrationPage.SetEmail("ammarrrssb3a@gmail.com");
        registrationPage.SetPhoneNumber("01141182989");
        registrationPage.setPassword("P@ssw0rd");
        registrationPage.ClickCheckBox();
        registrationPage.clickRegistrationButton();
            assertTrue(registrationPage.getFirstNameValidation()
                            .contains("Too Short!"),
                    "Alert First Name is incorrect");
    }

    @Test
    public void testEmptyFirstName() {
        RegistrationPage registrationPage = homePage.ClickRegistration();
        registrationPage.SetFirstName("");
        registrationPage.SetLastName("Hussien");
        registrationPage.SetEmail("ammarrrssb3a@gmail.com");
        registrationPage.SetPhoneNumber("01141182989");
        registrationPage.setPassword("P@ssw0rd");
        registrationPage.ClickCheckBox();
        registrationPage.clickRegistrationButton();
            assertTrue(registrationPage.getFirstNameValidation()
                            .contains("First name required"),
                    "Alert First Name is incorrect");
    }

    @Test
    public void testLongFirstName() {
        RegistrationPage registrationPage = homePage.ClickRegistration();
        registrationPage.SetFirstName("AmmarAmmarAmmarAmmarAmmarAmmarAmmarAmmarAmmarAmmarA");
        registrationPage.SetLastName("Hussien");
        registrationPage.SetEmail("ammarrrssb3a@gmail.com");
        registrationPage.SetPhoneNumber("01141182989");
        registrationPage.setPassword("P@ssw0rd");
        registrationPage.ClickCheckBox();
        registrationPage.clickRegistrationButton();
            assertTrue(registrationPage.getFirstNameValidation()
                            .contains("Too Long!"),
                    "Alert First Name is incorrect");
    }
}