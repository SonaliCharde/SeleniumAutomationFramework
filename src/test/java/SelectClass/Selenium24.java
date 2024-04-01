package SelectClass;

import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Selenium24 {
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
        driver.get("https://the-internet.herokuapp.com/dropdown");
        driver.manage().window().maximize();

        //Select class is used to handle dropdowns
         WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown']"));

         Select select = new Select(dropdown);
//         select.deselectByIndex(1);
//         select.deselectByValue("Option 1");

         select.selectByVisibleText("Option 1");
         Thread.sleep(10000);

//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10000));
//        wait.until(ExpectedConditions.elementToBeClickable
//                (driver.findElement(By.xpath("//option[text()='Option 1']"))));


    }




















    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}

