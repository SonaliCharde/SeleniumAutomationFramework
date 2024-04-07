package SVGElements;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium30 {
    WebDriver driver;

    @BeforeTest(groups = "QA")
    @Description("TC Description")
    public void openBrowser(){
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(options);
    }

    @Test(groups = "QA")
    @Description("Test Case Description")
    public void testPositive() throws InterruptedException {
        String url = "https://www.flipkart.com/";
        driver.get(url);
        driver.manage().window().maximize();
        driver.findElement(By.name("q")).sendKeys("macmini");

        ////*[name()='svg']/*[name()='g'][7]/*[name()='g']/*[name()='g']/*[name()='path'] -> 36 States
        // Click on THE Tripura?

        List<WebElement> states = driver.findElements(By.xpath(
                                "//*[name()='svg']/*[name()='g'][7]/*[name()='g']/*[name()='g']" +
                                        "/*[name()='path']"));




    }




















    @AfterTest(groups = "QA")
    @Description("TC Description")
    public void closeBrowser(){
        driver.quit();
    }


}
