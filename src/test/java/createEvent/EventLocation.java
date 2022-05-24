package createEvent;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.CreateEvent;

import static org.testng.Assert.assertTrue;

public class EventLocation extends BaseTests {
    @Test
    public void TestEventLocation(){
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
        createEvent.chooseCountry("5");
        createEvent.setStreetLocation("Hellooooooooooooo");
        createEvent.CreateEvent();
        assertTrue(createEvent.getEventValidation().
                        contains("Please select Location From the Map"),
                "Must Add description");
    }
}
