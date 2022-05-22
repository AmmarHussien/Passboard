package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

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
    private By emailValidation = By.xpath("/html/body/div/div/div/div/div/div[2]/div/div/div/form/div/div[2]/p");
    private By phoneNumberValidation = By.xpath("/html/body/div/div/div/div/div/div[2]/div/div/div/form/div/div[3]/p");
    private By passwordValidation = By.xpath("/html/body/div/div/div/div/div/div[2]/div/div/div/form/div/div[4]/p");
    private By checkBoxValidation = By.xpath("/html/body/div/div/div/div/div/div[2]/div/div/div/form/div/div[5]/p");
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
    public String getPhoneNumber(){
        return driver.findElement(phoneNumber).getText();
    }
    public void setPassword(String passwords) {
        driver.findElement(password).sendKeys(passwords);
    }
    public void ClickCheckBox(){
        driver.findElement(checkBox).click();
    }
    public void clickRegistrationButton(){
        driver.findElement(registrationButton).click();
    }
    public void WaitingHomePage(){
        FluentWait wait = new FluentWait( driver )
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchFieldException.class);
        wait.until(ExpectedConditions.titleIs("Passboard"));
    }
    public String getFirstNameValidation(){
        return driver.findElement(firstNameValidation).getText();
    }
    public String getLastNameValidation(){
        return driver.findElement(lastNameValidation).getText();
    }
    public String getEmailValidation(){
        return driver.findElement(emailValidation).getText();
    }
    public String getPhoneNumberValidation(){
        return driver.findElement(phoneNumberValidation).getText();
    }
    public String getPasswordValidation(){
        return driver.findElement(passwordValidation).getText();
    }
    public String getCheckBoxValidation(){
        return driver.findElement(checkBoxValidation).getText();
    }
}
