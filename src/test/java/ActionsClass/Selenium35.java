package ActionsClass;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.List;

public class Selenium35 {
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
        String url = "https://app.vwo.com/#/test/ab/13/heatmaps/1?token=eyJhY2NvdW50X2lkIjo2NjY0MDAsImV4cGVyaW1lbnRfaWQiOjEzLCJjcmVhdGVkX29uIjoxNjcxMjA1MDUwLCJ0eXBlIjoiY2FtcGFpZ24iLCJ2ZXJzaW9uIjoxLCJoYXNoIjoiY2IwNzBiYTc5MDM1MDI2N2QxNTM5MTBhZDE1MGU1YTUiLCJzY29wZSI6IiIsImZybiI6ZmFsc2V9&isHttpsOnly=1";
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(5000);

        List<WebElement> heatmaps = driver.findElements(By.cssSelector("[data-qa=\"yedexafobi\"]"));


        Actions actions = new Actions(driver);
        actions.moveToElement(heatmaps.get(1)).click().build().perform();


        Thread.sleep(5000);

    }












    @AfterTest
    @Description("Closing browser")
    public void closeBrowser(){
        driver.quit();
    }
}
