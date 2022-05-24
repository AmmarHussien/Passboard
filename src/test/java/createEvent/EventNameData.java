package createEvent;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.CreateEvent;

import static org.testng.Assert.assertTrue;

public class EventNameData extends BaseTests {
    @Test
    void TestEmptyEventName(){
        CreateEvent createEvent = homePage.CreateEventButton();
        createEvent.setEventName("");
        createEvent.clickOnEventType("1");
        createEvent.clickOnCategory("2");
        createEvent.clickOnSubCategory("1");
        createEvent.setDescription("Hello Hello Hello Hello Hello ");
        createEvent.uploadFile("D:\\Testing\\Passboard\\resources\\ScreenShots\\TestCreateEvent.png");
        createEvent.goStageTwo();
        assertTrue(createEvent.getEventValidation().
                contains("Please add Event name"),
                "Event Name is Empty");
    }
    @Test
    void TestShortEventName(){
        CreateEvent createEvent = homePage.CreateEventButton();
        createEvent.setEventName("AA");
        createEvent.clickOnEventType("1");
        createEvent.clickOnCategory("2");
        createEvent.clickOnSubCategory("1");
        createEvent.setDescription("Hello Hello Hello Hello Hello ");
        createEvent.uploadFile("D:\\Testing\\Passboard\\resources\\ScreenShots\\TestCreateEvent.png");
        createEvent.goStageTwo();
            assertTrue(createEvent.getEventValidation()
                            .contains("Must be more than 3 characters")
                    , "Event Name Must be More than 3 characters");
    }
    @Test
    void TestLongEventName(){
        CreateEvent createEvent = homePage.CreateEventButton();
        createEvent.setEventName("Ammar Ammar Ammar Ammar Ammar Ammar Ammar Ammar Ammar Ammar Ammar Ammar Ammar Ammar");
        createEvent.clickOnEventType("1");
        createEvent.clickOnCategory("2");
        createEvent.clickOnSubCategory("1");
        createEvent.setDescription("Hello Hello Hello Hello Hello ");
        createEvent.uploadFile("D:\\Testing\\Passboard\\resources\\ScreenShots\\TestCreateEvent.png");
        createEvent.waitImage();
        createEvent.goStageTwo();
            assertTrue(createEvent.getEventValidation()
                            .contains("Max characters length is 75 characters")
                    , "Event Name Must be less than or equal 75 characters");
    }
}
