package base;

import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;
    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        //driver = new ChromeDriver(getChromeOptions());
        driver = new ChromeDriver();
       // driver.register(new EventReporter());
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        goHome();
    }
    @BeforeMethod
    public void fullScreen(){
        driver.manage().window().maximize();
    }
    @BeforeMethod
    public void goHome(){
        driver.get("https://demo.passboard.net/");
        homePage = new HomePage(driver);
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
    @AfterMethod
    public void recordFailure (ITestResult result) {
        if(ITestResult.FAILURE == result.getStatus())
        {
            var camera = (TakesScreenshot)driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            try{
                Files.move(screenshot, new File("resources/ScreenShots/"+ result.getName() + ".png"));
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
//    public WindowManager getWindowManager (){
//        return new WindowManager(driver);
//    }
//    private ChromeOptions getChromeOptions(){
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("enable-automation");
//        options.setHeadless(true);
//        return options;
//    }
}
