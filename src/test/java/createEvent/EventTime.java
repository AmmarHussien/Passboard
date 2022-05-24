package createEvent;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.CreateEvent;

public class EventTime extends BaseTests {
    @Test
    public void TestTime(){
        CreateEvent createEvent = homePage.CreateEventButton();
        createEvent.setEventName("Ali");
        createEvent.clickOnEventType("1");
        createEvent.clickOnCategory("2");
        createEvent.clickOnSubCategory("1");
        createEvent.setDescription("Hello Hello Hello Hello Hello ");
        createEvent.uploadFile("D:\\Testing\\Passboard\\resources\\ScreenShots\\TestCreateEvent.png");
        createEvent.waitImage();
        createEvent.goStageTwo();
        createEvent.setStartTime();
    }
}
