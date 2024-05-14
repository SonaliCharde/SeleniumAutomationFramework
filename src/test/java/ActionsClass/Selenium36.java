package ActionsClass;

import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium36 {
    // Atomic Test Cases
    // TC who don't have any dep.
    // They serve single purpose 0

    WebDriver driver;

    @BeforeTest
    @Description("Initialising driver")
    public void openBrowser(){
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver= new ChromeDriver(options);
    }

    @Test (groups = "QA")
    @Description("TC Description")
    public void testPositive() throws InterruptedException {
        String url = "https://www.makemytrip.com/";
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(5000);

        //List<WebElement> heatmaps = driver.findElements(By.cssSelector("[data-qa=\"yedexafobi\"]"));


        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).click().build().perform();
        

        Thread.sleep(5000);

    }












    @AfterTest
    @Description("Closing browser")
    public void closeBrowser(){
        driver.quit();
    }
}
