package createEvent;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.CreateEvent;

import static org.testng.Assert.assertTrue;

public class EventDescription extends BaseTests {
    @Test
    public void TestEmptyDescription(){
        CreateEvent createEvent = homePage.CreateEventButton();
        createEvent.setEventName("Ali");
        createEvent.clickOnEventType("1");
        createEvent.clickOnCategory("2");
        createEvent.clickOnSubCategory("1");
        createEvent.uploadFile("D:\\Testing\\Passboard\\resources\\ScreenShots\\TestCreateEvent.png");
        createEvent.waitImage();
        createEvent.goStageTwo();
        assertTrue(createEvent.getEventValidation().
                        contains("Please add a description."),
                "Must Add description");
    }
    @Test
    public void TestLongDescription(){
        CreateEvent createEvent = homePage.CreateEventButton();
        createEvent.setEventName("Ali");
        createEvent.clickOnEventType("1");
        createEvent.clickOnCategory("2");
        createEvent.clickOnSubCategory("1");
        createEvent.setDescription("Ammar Ammar Ammar Ammar Ammar Ammar Ammar Ammar Ammar Ammar Ammar Ammar Ammar Ammar Ammar Ammar Ammar Ammar Ammar Ammar Ammar Ammar Ammar Ammar Ammar Ammar Ammar Ammar Ammar Ammar A");
        createEvent.uploadFile("D:\\Testing\\Passboard\\resources\\ScreenShots\\TestCreateEvent.png");
        createEvent.waitImage();
        createEvent.goStageTwo();
        assertTrue(createEvent.getEventValidation().
                        contains("Max characters length is 180 characters"),
                "Must Add description");
    }
}
