package RelativeLocators;

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

import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class Selenium40 {
    // Atomic Test Cases
    // TC who don't have any dep.
    // They serve single purpose 0
    WebDriver driver;

    @BeforeTest
    @Description("Opening browser")
    public void openBrowser(){
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new ChromeDriver(options);
    }
    @Test (groups = "QA")
    @Description("TC Description")
    public void testPositive() throws InterruptedException {
        String url = "https://awesomeqa.com/practice.html";
        driver.get(url);
        driver.manage().window().maximize();

        WebElement span_element = driver.findElement(By.xpath("//span[normalize-space()='Years of Experience']"));
        driver.findElement(with(By.id("exp-3")).toRightOf(span_element)).click();

//        List<WebElement> list = driver.findElements(By.cssSelector("div.control-group"));
//        for (WebElement li:list){
//            System.out.println(li.getText());
//        }
        Thread.sleep(5000);


    }
























    @AfterTest
    @Description("Closing browser")
    public void closeBrowser(){
        driver.quit();
    }
}
