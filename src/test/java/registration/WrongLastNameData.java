package registration;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.RegistrationPage;

import static org.testng.Assert.assertTrue;

public class WrongLastNameData extends BaseTests {
    @Test
    public void testEmptyLastNameData() {
        RegistrationPage registrationPage = homePage.ClickRegistration();
        registrationPage.SetLastName("");
        registrationPage.clickRegistrationButton();
        if (registrationPage.getLastName().length() == 0 ) {
            assertTrue(registrationPage.getLastNameValidation()
                            .contains("last name required"),
                    "Alert text is incorrect");
        }
    }
    @Test
    public void testShortLastNameData() {
        RegistrationPage registrationPage = homePage.ClickRegistration();
        registrationPage.SetLastName("a");
        registrationPage.getLastName();
        registrationPage.clickRegistrationButton();
        if (registrationPage.getLastName().length() > 0 && registrationPage.getLastName().length() < 2  ) {
            assertTrue(registrationPage.getLastNameValidation()
                            .contains("Too Short!"),
                    "Alert text is incorrect");
        }
    }
    @Test
    public void testLongLastNameData() {
        RegistrationPage registrationPage = homePage.ClickRegistration();
        registrationPage.SetLastName("AmmarAmmarAmmarAmmarAmmarAmmarAmmarAmmarAmmarAmmarAmmarAmmar");
        registrationPage.getLastName();
        registrationPage.clickRegistrationButton();
        if (registrationPage.getLastName().length() > 50 ) {
            assertTrue(registrationPage.getLastNameValidation()
                            .contains("Too Long!"),
                    "Alert text is incorrect");
        }
    }
}
