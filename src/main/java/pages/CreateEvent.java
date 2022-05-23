package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CreateEvent {
    private WebDriver driver;
    private By eventName = By.name("eventName");
    private By eventType = By.xpath("/html/body/div[2]/div[3]/div/div/div[2]/div/div[2]/div/div/div[1]/div[2]/div/div/div/form/div/div[2]/div/div/div");
    private By category = By.xpath("/html/body/div[2]/div[3]/div/div/div[2]/div/div[2]/div/div/div[1]/div[2]/div/div/div/form/div/div[3]/div/div/div");
    private By subCategory = By.xpath("/html/body/div[2]/div[3]/div/div/div[2]/div/div[2]/div/div/div[1]/div[2]/div/div/div/form/div/div[4]/div/div/div");
    private By uploadImageButton = By.xpath("/html/body/div[2]/div[3]/div/div/div[2]/div/div[1]/div/div/div");
    private By uploadImage = By.xpath("/html/body/div[2]/div[3]/div/div/div[2]/div/div[1]/div/div/input");
    private By loading = By.xpath("/html/body/div[2]/div[3]/div/div/div[2]/div/div[1]/div/span");
    private By description = By.xpath("/html/body/div[2]/div[3]/div/div/div[2]/div/div[2]/div/div/div[1]/div[2]/div/div/div/form/div/div[5]/div/div/textarea");
    private By stageTwo = By.xpath("/html/body/div[2]/div[3]/div/div/div[2]/div/div[3]/div/div[2]/div/button");
    private By startDate = By.xpath("/html/body/div[2]/div[3]/div/div/div[2]/div/div[2]/div/div/div[1]/div[2]/div/div/div/form/div/div[1]/div[1]/div");
    private By selectStartDate = By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[2]/div/div[2]/div/div[2]/div/div[3]/div[4]");
    private By selectEndDate = By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[2]/div/div[2]/div/div[2]/div/div[4]/div[4]");
    private By endDate = By.xpath("/html/body/div[2]/div[3]/div/div/div[2]/div/div[2]/div/div/div[1]/div[2]/div/div/div/form/div/div[2]/div[1]/div");
    private By goNextTap = By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[2]/div/div[1]/div[2]/button[2]");
    private By okButton = By.xpath("/html/body/div[3]/div[3]/div/div[2]/button[2]");
    private By CountryButton = By.xpath("/html/body/div[2]/div[3]/div/div/div[2]/div/div[2]/div/div/div[1]/div[2]/div/div/div/form/div/div[4]/div/div/div");
    private By locationEntry = By.xpath("/html/body/div[2]/div[3]/div/div/div[2]/div/div[1]/div/div[1]/div/div/div/input");
    private By streetLocation = By.xpath("/html/body/div[2]/div[3]/div/div/div[2]/div/div[2]/div/div/div[1]/div[2]/div/div/div/form/div/div[7]/div/input");
    private By createEvent = By.xpath("/html/body/div[2]/div[3]/div/div/div[2]/div/div[3]/div/div[2]/div/button");
    public CreateEvent(WebDriver driver){
        this.driver = driver;
    }

    public void setEventName(String EventName) {
        driver.findElement(eventName).sendKeys(EventName);
    }
    public void clickOnEventType(String i){
        driver.findElement(eventType).click();
        By selectEventType = By.xpath("/html/body/div[3]/div[3]/ul/li["+i+"]");
        driver.findElement(selectEventType).click();
    }
    public void clickOnCategory(String i){
        driver.findElement(category).click();
        By selectCategoryType = By.xpath("/html/body/div[3]/div[3]/ul/li["+i+"]");
        driver.findElement(selectCategoryType).click();
    }
    public void clickOnSubCategory(String i){
        driver.findElement(subCategory).click();
        By selectSubCategoryType = By.xpath("/html/body/div[3]/div[3]/ul/li["+i+"]");
        driver.findElement(selectSubCategoryType).click();
    }
    /**
     * Provides path of file to the form then clicks upload button
     * @param absolutePathOfFile The complete path of the file to upload
     */
    public void uploadFile (String absolutePathOfFile){
        driver.findElement(uploadImage).sendKeys(absolutePathOfFile);
    }
    public void setDescription(String Description) {
        driver.findElement(description).sendKeys(Description);
    }
    public void goStageTwo(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loading)));
        driver.findElement(stageTwo).click();
    }
    public void setStartDate() {
        driver.findElement(startDate).click();
        driver.findElement(goNextTap).click();
        driver.findElement(selectStartDate).click();
        driver.findElement(okButton).click();
    }
    public void setEndDate() {
        driver.findElement(endDate).click();
        driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[2]/div/div[1]/div[2]/button[2]")).click(); //goNext
        driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[2]/div/div[1]/div[2]/button[2]")).click(); //goNext
        driver.findElement(selectEndDate).click();
        driver.findElement(okButton).click();
    }
    public void chooseCountry(String i){
        driver.findElement(CountryButton).click();
        driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li["+i+"]")).click();
    }
    public void setLocationEntry(String location){
        driver.findElement(locationEntry).sendKeys(location);
        driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div[2]/div/div[1]/div/div[1]/div/ul/p[1]")).click();
    }
    public void setStreetLocation(String street) {
        driver.findElement(streetLocation).sendKeys(street);
    }
    public void CreateEvent(String eventName){
        driver.findElement(createEvent).click();
        FluentWait wait = new FluentWait( driver )
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchFieldException.class);
        wait.until(ExpectedConditions.titleIs(eventName+ " | Passboard"));
    }
}
