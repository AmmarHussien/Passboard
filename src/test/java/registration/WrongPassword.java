package registration;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.RegistrationPage;

import static org.testng.Assert.assertTrue;

public class WrongPassword extends BaseTests {
    @Test
    public void TestWrongPassword(){
        RegistrationPage registrationPage=  homePage.ClickRegistration();
        registrationPage.SetFirstName("Ammar");
        registrationPage.SetLastName("Hussien");
        registrationPage.SetEmail("ammarrrssb3a@gmail.com");
        registrationPage.SetPhoneNumber("01141182989");
        registrationPage.setPassword("P@ssword");
        registrationPage.clickRegistrationButton();
        assertTrue(registrationPage.getPasswordValidation()
                .contains("At least 8 character, one uppercase letter, one lowercase letter, number, and a special character")
                ,"Alert Password is incorrect");
    }
    @Test
    public void TestEmptyPassword(){
        RegistrationPage registrationPage=  homePage.ClickRegistration();
        registrationPage.SetFirstName("Ammar");
        registrationPage.SetLastName("Hussien");
        registrationPage.SetEmail("ammarrrssb3a@gmail.com");
        registrationPage.SetPhoneNumber("01141182989");
        registrationPage.setPassword("");
        registrationPage.clickRegistrationButton();
        assertTrue(registrationPage.getPasswordValidation()
                        .contains("Password is required")
                ,"Alert Password is incorrect");
    }
}
