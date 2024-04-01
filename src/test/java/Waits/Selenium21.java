package Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Selenium21 {
    // Atomic Test Cases
    // TC who don't have any dep.
    // They serve single purpose 0
    WebDriver driver;
    @BeforeTest
    public void openBrowser(){
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(options);
    }

    @Test
    public void testwaits()  {
        driver.get("https://app.vwo.com");
        driver.manage().window().maximize();

        //Implicit waits
        //// Global wait to all the elements which we don't use
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


            driver.findElement(By.id("login-username")).sendKeys("93npu2yyb0@esiix.com");
            driver.findElement(By.id("login-password")).sendKeys("Wingify@123");
            driver.findElement(By.id("js-login-btn")).click();

            WebElement errmsg = driver.findElement(By.id("js-notification-box-msg"));
            //errmsg.getText();

            //Explicitwaits
            //Waits based on conditions
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
       // wait.until(ExpectedConditions.presenceOfElementLocated(By.id("js-notification-box-msg")));
        wait.until(ExpectedConditions.textToBePresentInElement(errmsg,"Your email, password, IP address or location did not match"));

        System.out.println(errmsg.getText());




    }
















    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}


