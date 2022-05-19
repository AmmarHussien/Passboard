package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class LoginPage {

    private WebDriver driver;

    private By userNameField = By.xpath("/html/body/div/div/div/div/div/div[2]/div/div/div/form/div[1]/div[1]/div/input");
    private By passwordField = By.xpath("/html/body/div/div/div/div/div/div[2]/div/div/div/form/div[1]/div[2]/div/input");
    private By loginButton = By.cssSelector("#__next > div > div > div > div > div.MuiGrid-root.MuiGrid-item.MuiGrid-grid-xs-12.MuiGrid-grid-md-6.css-ojcw1z-MuiGrid-root > div > div > div > form > button");
    private By statuesAlert = By.xpath("/html/body/div/div/div/div/div/div[2]/div/div/div/form/div[1]/div[1]/div[2]");
    private By EmailAlert = By.xpath("/html/body/div/div/div/div/div/div[2]/div/div/div/form/div[1]/div[1]/p");
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    public void setUserName( String userName) {
        driver.findElement(userNameField).sendKeys(userName);
    }
    public void setPassword( String password) {
        driver.findElement(passwordField).sendKeys(password);
    }
    public void clickLoginButton() {
        driver.findElement(loginButton).click();
        FluentWait wait = new FluentWait( driver )
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchFieldException.class);
        wait.until(ExpectedConditions.titleIs("Passboard"));
    }
    public String getAlertText(){
        return driver.findElement(statuesAlert).getText();
    }
    public String getEmailAlert(){
        return driver.findElement(EmailAlert).getText();
    }
}
