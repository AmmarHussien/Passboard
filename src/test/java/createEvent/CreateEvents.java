package createEvent;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.CreateEvent;
import pages.LoginPage;

public class CreateEvents extends BaseTests {
    @Test
    public void TestCreateEvent(){
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUserName("ammarrab3a@yahoo.com");
        loginPage.setPassword("P@ssw0rd");
        loginPage.clickLoginButton();
        loginPage.waiting();
        CreateEvent createEvent = homePage.CreateEventButton();
        createEvent.setEventName("Ali");
        createEvent.clickOnEventType("1");
        createEvent.clickOnCategory("2");
        createEvent.clickOnSubCategory("1");
        createEvent.setDescription("Hello Hello Hello Hello Hello ");
        createEvent.uploadFile("D:\\Testing\\Passboard\\resources\\ScreenShots\\TestCreateEvent.png");
        createEvent.goStageTwo();
        createEvent.setStartDate();
        createEvent.setEndDate();
        createEvent.chooseCountry("5");
        createEvent.setLocationEntry("cairo egypt");
        createEvent.setStreetLocation("Hellooooooooooooo");
        createEvent.CreateEvent("Ali");
    }
}
