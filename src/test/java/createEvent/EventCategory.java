package createEvent;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.CreateEvent;

import static org.testng.Assert.assertTrue;

public class EventCategory extends BaseTests {
    @Test
    void TestEmptyEventCategory(){
        CreateEvent createEvent = homePage.CreateEventButton();
        createEvent.setEventName("Ali");
        createEvent.clickOnEventType("1");
        createEvent.setDescription("Hello Hello Hello Hello Hello ");
        createEvent.uploadFile("D:\\Testing\\Passboard\\resources\\ScreenShots\\TestCreateEvent.png");
        createEvent.waitImage();
        createEvent.goStageTwo();
        assertTrue(createEvent.getEventValidation().
                        contains("Event Category is required"),
                "Must Add Event Category");
    }
    @Test
    void TestEmptyEventSubCategory(){
        CreateEvent createEvent = homePage.CreateEventButton();
        createEvent.setEventName("Ali");
        createEvent.clickOnEventType("1");
        createEvent.clickOnCategory("2");
        createEvent.setDescription("Hello Hello Hello Hello Hello ");
        createEvent.uploadFile("D:\\Testing\\Passboard\\resources\\ScreenShots\\TestCreateEvent.png");
        createEvent.waitImage();
        createEvent.goStageTwo();
        assertTrue(createEvent.getEventValidation().
                        contains("Event SubCategory is required"),
                "Must Add Event SubCategory");
    }
}
