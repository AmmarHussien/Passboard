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
        registrationPage.clickRegistrationButton();
        if (registrationPage.getFirstName().length() > 0 && registrationPage.getFirstName().length() < 2 ) {
            assertTrue(registrationPage.getFirstNameValidation()
                            .contains("Too Short!"),
                    "Alert text is incorrect");
        }
    }

    @Test
    public void testEmptyFirstName() {
        RegistrationPage registrationPage = homePage.ClickRegistration();
        registrationPage.SetFirstName("");
        registrationPage.clickRegistrationButton();
        if (registrationPage.getFirstName().length() == 0 ) {
            assertTrue(registrationPage.getFirstNameValidation()
                            .contains("First name required"),
                    "Alert text is incorrect");
        }
    }

    @Test
    public void testLongFirstName() {
        RegistrationPage registrationPage = homePage.ClickRegistration();
        registrationPage.SetFirstName("AmmarAmmarAmmarAmmarAmmarAmmarAmmarAmmarAmmarAmmarA");
        registrationPage.clickRegistrationButton();
        if (registrationPage.getFirstName().length() > 50 ) {
            assertTrue(registrationPage.getFirstNameValidation()
                            .contains("Too Long!"),
                    "Alert text is incorrect");
        }
    }
}