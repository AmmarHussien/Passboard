package createEvent;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.CreateEvent;

import static org.testng.Assert.assertTrue;

public class EventDate extends BaseTests {
    @Test
    public void TestStartEventDate(){
        CreateEvent createEvent = homePage.CreateEventButton();
        createEvent.setEventName("Ali");
        createEvent.clickOnEventType("1");
        createEvent.clickOnCategory("2");
        createEvent.clickOnSubCategory("1");
        createEvent.setDescription("Hello Hello Hello Hello Hello ");
        createEvent.uploadFile("D:\\Testing\\Passboard\\resources\\ScreenShots\\TestCreateEvent.png");
        createEvent.waitImage();
        createEvent.goStageTwo();
        createEvent.setEndDate();
        createEvent.chooseCountry("5");
        createEvent.setLocationEntry("cairo egypt");
        createEvent.setStreetLocation("Hellooooooooooooo");
        createEvent.CreateEvent();
        assertTrue(createEvent.getEventValidation().
                        contains("Please select a start time."),
                "Must Add description");
    }
    @Test
    public void TestEndEventDate(){
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
        createEvent.chooseCountry("5");
        createEvent.setLocationEntry("cairo egypt");
        createEvent.setStreetLocation("Hellooooooooooooo");
        createEvent.CreateEvent();
        assertTrue(createEvent.getEventValidation().
                        contains("Please add end date"),
                "Must Add description");
    }
}
