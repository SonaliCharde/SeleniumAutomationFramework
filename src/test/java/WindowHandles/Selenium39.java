package WindowHandles;

import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class Selenium39 {
    WebDriver driver;
    @BeforeTest
    public void openBrowser(){
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(options);
    }

    @Test(groups = "QA")
    @Description("TC Description")
    public void testPositive() throws InterruptedException {
        driver.get("https://app.vwo.com/#/analyze/osa/13/heatmaps/1?token=eyJhY2NvdW50X2lkIjo2NjY0MDAsImV4cGVyaW1lbnRfaWQiOjEzLCJjcmVhdGVkX29uIjoxNjcxMjA1MDUwLCJ0eXBlIjoiY2FtcGFpZ24iLCJ2ZXJzaW9uIjoxLCJoYXNoIjoiY2IwNzBiYTc5MDM1MDI2N2QxNTM5MTBhZDE1MGU1YTUiLCJzY29wZSI6IiIsImZybiI6ZmFsc2V9&isHttpsOnly=1");
        driver.manage().window().maximize();
        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Global wait to all the elements which we don't use
        String mainhandle = driver.getWindowHandle();
        System.out.println("Before click - "+mainhandle);

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.cssSelector("[data-qa=\"danawobuqa\"]"))).click().build().perform();
        Thread.sleep(5000);
        actions.clickAndHold().build().perform();

        Set <String> windowhandles = driver.getWindowHandles();
        System.out.println(windowhandles);

        Iterator<String> iterator =windowhandles.iterator();
        while (iterator.hasNext()){
            String childhandle = iterator.next();
            if (!mainhandle.equalsIgnoreCase(childhandle)){
                driver.switchTo().window(childhandle);
                System.out.println(driver.getTitle());
            }
            driver.switchTo().parentFrame();
            Thread.sleep(10000);
        }



    }













    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}

