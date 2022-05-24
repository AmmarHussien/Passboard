package createEvent;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.CreateEvent;

import static org.testng.Assert.assertTrue;

public class EventImage extends BaseTests {
    @Test
    public void testEmptyImage() {
        CreateEvent createEvent = homePage.CreateEventButton();
        createEvent.setEventName("Ali");
        createEvent.clickOnEventType("1");
        createEvent.clickOnCategory("2");
        createEvent.clickOnSubCategory("1");
        createEvent.setDescription("Hello Hello Hello Hello Hello ");
        createEvent.goStageTwo();
        assertTrue(createEvent.getUploadFileValidation().
                        contains("cover image is required"),
                "Must Add cover image");
    }
}
