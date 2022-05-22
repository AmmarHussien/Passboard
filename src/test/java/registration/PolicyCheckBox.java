package registration;

import base.BaseTests;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.RegistrationPage;

import static org.testng.Assert.assertTrue;

public class PolicyCheckBox extends BaseTests {
    @Test
    public void testCheckBox(){
        RegistrationPage registrationPage = homePage.ClickRegistration();
        registrationPage.SetFirstName("Ammar");
        registrationPage.SetLastName("Hussien");
        registrationPage.SetEmail("ammarrrqsb3a@gmail.com");
        registrationPage.SetPhoneNumber("01141112989");
        registrationPage.setPassword("P@ssw0rd");
        registrationPage.clickRegistrationButton();
        assertTrue(registrationPage.getCheckBoxValidation()
                .contains("Please, accept the terms of service and privacy policy"),
                "Alert CheckBox is not toggle ON");
    }
}
