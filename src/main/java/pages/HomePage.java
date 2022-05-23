package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    public LoginPage clickFormAuthentication() {
        clickXpath("/html/body/div/header/div[1]/div[3]/a[2]");
        return new LoginPage(driver);
    }
    public RegistrationPage ClickRegistration(){
        clickXpath("/html/body/div/header/div[1]/div[3]/a[2]");
        clickXpath("/html/body/div/div/div/div/div/div[2]/div/div/div/form/div[3]/div[2]");
        return  new RegistrationPage(driver);
    }
    public CreateEvent CreateEventButton(){
        clickXpath("/html/body/div/header/div[1]/div[3]/button");
        return new CreateEvent(driver);
    }
    public  void clickXpath(String Xpath){
        driver.findElement(By.xpath(Xpath)).click();
    }
    public String getTitle() {
        return driver.getTitle();
    }
}
