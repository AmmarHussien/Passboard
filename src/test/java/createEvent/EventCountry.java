package createEvent;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.CreateEvent;

import static org.testng.Assert.assertTrue;

public class EventCountry extends BaseTests {
    @Test
    public void TestEventCountry(){
        CreateEvent createEvent = homePage.CreateEventButton();
        createEvent.setEventName("Ali");
        createEvent.clickOnEventType("1");
        createEvent.clickOnCategory("2");
        createEvent.clickOnSubCategory("1");
        createEvent.setDescription("Hello Hello Hello Hello Hello ");
        createEvent.uploadFile("D:\\Testing\\Passboard\\resources\\ScreenShots\\TestCreateEvent.png");
        createEvent.waitImage();
        createEvent.goStageTwo();
        createEvent.setStartDate();
        createEvent.setEndDate();
        createEvent.setLocationEntry("cairo egypt");
        createEvent.setStreetLocation("Hellooooooooooooo");
        createEvent.CreateEvent();
        assertTrue(createEvent.getEventValidation().
                        contains("Please choose a country."),
                "Must Add description");
    }
}
