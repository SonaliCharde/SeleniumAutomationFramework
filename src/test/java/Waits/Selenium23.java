package Waits;

import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class Selenium23 {
    WebDriver driver;
    @BeforeTest
    public void openBrowser(){
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(options);
    }

    @Test(groups = "QA")
    @Description("TC Description")
    public void testPositive(){
        driver.get("https://app.vwo.com");
        driver.manage().window().maximize();
        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Global wait to all the elements which we don't use

        WebElement username = driver.findElement(By.cssSelector("input#login-username"));
        WebElement password = driver.findElement(By.cssSelector("input#login-password"));
        username.sendKeys("contact+atb5x@thetestingacademy.com");
        password.sendKeys("ATBx@1234");
        WebElement loginbutton = driver.findElement(By.cssSelector("button#js-login-btn"));
        loginbutton.click();

        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

        WebElement loggedinUsername =
                wait.until(driver -> driver.findElement(By.cssSelector("[data-qa='lufexuloga']")));
        System.out.println("Logged in user details are "+ loggedinUsername.getText());



    }
    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}

