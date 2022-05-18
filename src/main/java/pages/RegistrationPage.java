package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {

    private WebDriver driver;
    private By firstName = By.name("firstName");
    private By lastName = By.name("lastName");
    private By email = By.name("email");
    private By phoneNumber = By.name("phone");
    private By password = By.name("password");
    private By checkBox = By.name("checkBox");
    private By registrationButton = By.xpath("/html/body/div/div/div/div/div/div[2]/div/div/div/form/div/div[6]/button[1]");
    private By firstNameValidation = By.xpath("/html/body/div/div/div/div/div/div[2]/div/div/div/form/div/div[1]/div[1]/p");
    private By lastNameValidation = By.xpath("/html/body/div/div/div/div/div/div[2]/div/div/div/form/div/div[1]/div[2]/p");
    public RegistrationPage(WebDriver driver){
        this.driver = driver;
    }
    public void SetFirstName(String firstNames) {
        driver.findElement(firstName).sendKeys(firstNames);
    }
    public String getFirstName() {
       return driver.findElement(firstName).getText();
    }
    public void SetLastName(String lastNames) {
        driver.findElement(lastName).sendKeys(lastNames);
    }
    public String getLastName() {
        return driver.findElement(lastName).getText();
    }
    public void SetEmail(String emails) {
        driver.findElement(email).sendKeys(emails);
    }
    public void SetPhoneNumber(String phoneNumbers) {
        driver.findElement(phoneNumber).sendKeys(phoneNumbers);
    }
    public void setPassword(String passwords) {
        driver.findElement(password).sendKeys(passwords);
    }
    public void setCheckBox(){
        driver.findElement(checkBox).click();
    }
    public void clickRegistrationButton(){
        driver.findElement(registrationButton).click();
    }
    public String getFirstNameValidation(){
        return driver.findElement(firstNameValidation).getText();
    }
    public String getLastNameValidation(){
        return driver.findElement(lastNameValidation).getText();
    }
}
