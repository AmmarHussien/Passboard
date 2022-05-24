package createEvent;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.CreateEvent;

import static org.testng.Assert.assertTrue;

public class EventType extends BaseTests {
    @Test
    void TestEmptyEventType(){
        CreateEvent createEvent = homePage.CreateEventButton();
        createEvent.setEventName("Hello");
        createEvent.clickOnCategory("2");
        createEvent.clickOnSubCategory("1");
        createEvent.setDescription("Hello Hello Hello Hello Hello ");
        createEvent.uploadFile("D:\\Testing\\Passboard\\resources\\ScreenShots\\TestCreateEvent.png");
        createEvent.waitImage();
        createEvent.goStageTwo();
        assertTrue(createEvent.getEventValidation().
                        contains("Event Type is required"),
                "Must Add Event Type");
    }
}
