package ActionsClass;

import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selenium33 {
    // Atomic Test Cases
    // TC who don't have any dep.
    // They serve single purpose 0

    WebDriver driver ;

    @BeforeTest
    public void openBrowser(){
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new ChromeDriver(options);
    }


    @Test(groups = "QA")
    @Description ("Test case Description")
    public void testPositive() throws InterruptedException {

       String url = "https://www.spicejet.com/";
       driver.get(url);
       driver.manage().window().maximize();

        // THETESTINGACADEMY
        // Shift Keydown -> thetestingacademy + Shift KeyUp

        WebElement source = driver.findElement(By.xpath("//div[@data-testid=\"search-source-code\"]"));

        Actions actions = new Actions(driver);
        actions.moveToElement(source).click().build().perform();

       Thread.sleep(13000);














    }






























    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }

}
