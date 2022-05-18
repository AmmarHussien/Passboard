package registration;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.RegistrationPage;

import static org.testng.Assert.assertTrue;


public class SuccessfulRegistration extends BaseTests {

    @Test
    public  void testSuccessfulRegistration(){

        RegistrationPage registrationPage=  homePage.ClickRegistration();
        registrationPage.SetFirstName("Ammar");
        registrationPage.SetLastName("Hussien");
        registrationPage.SetEmail("ammarrrab3a@gmail.com");
        registrationPage.SetPhoneNumber("01146182989");
        registrationPage.setPassword("P@ssw0rd");
        registrationPage.setCheckBox();
        registrationPage.clickRegistrationButton();
        assertTrue(homePage.getTitle()
                        .contains("Passboard"),
                "Alert text is incorrect");
    }
}
