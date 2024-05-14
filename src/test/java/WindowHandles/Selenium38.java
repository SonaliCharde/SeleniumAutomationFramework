package WindowHandles;

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

import java.util.Arrays;
import java.util.Set;

public class Selenium38 {
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
        String url = "https://the-internet.herokuapp.com/windows";
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(5000);

        String mainhandle = driver.getWindowHandle();
        System.out.println("Before click "+mainhandle);

        WebElement link =driver.findElement(By.linkText("Click Here"));
        link.click();

        Set<String> windowHandles = driver.getWindowHandles();
        // All the Windows Tab have a unique name

        for (String wh :windowHandles){
            driver.switchTo().window(wh);
            System.out.println(wh);
            if (driver.getPageSource().contains("New Window")){
                System.out.println("Passed");
            }
        }
        driver.switchTo().parentFrame();
        Thread.sleep(2000);


    }












    @AfterTest
    @Description("Closing browser")
    public void closeBrowser(){
        driver.quit();
    }
}
