package SelectClass;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class SelectFlipkart {
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
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();

        List<WebElement> list = driver.findElements(By.xpath("//div[@class='_1kidPb']//span"));
        for (WebElement ls : list ){
            ls.getText();

            WebElement w1 = driver.findElement(By.xpath("//span[text()='Electronics']"));
            w1.click();
            Thread.sleep(10000);

        }



//         Select select = new Select(dropdown);
////         select.deselectByIndex(1);
////         select.deselectByValue("Option 1");
//
//         select.selectByVisibleText("Option 1");
//         Thread.sleep(10000);
//
////        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10000));
////        wait.until(ExpectedConditions.elementToBeClickable
////                (driver.findElement(By.xpath("//option[text()='Option 1']"))));


    }




















    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}

