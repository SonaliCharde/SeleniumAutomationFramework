package Practice;

import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class lab4 {
    //Write a Script to inspect Adactin hotel login using id/name

    WebDriver driver;

    @BeforeTest
    @Description("Opening browser")
    public void openBrowser() {
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(options);
    }

    @Test(groups = "QA")
    @Description("TC Description")
    public void ScriptOne() throws InterruptedException {
//        Write a script for the following:
// Open the browser
// Delete all cookies
// Set size of the window
// Set position of the window
// Maximize the window

        Thread.sleep(2000);
        // Delete all cookies
       driver.manage().deleteAllCookies();

        // Set size of the window
        Dimension dimension = new Dimension(500,500);
        driver.manage().window().setSize(dimension);
        Thread.sleep(2000);

        // Set position of the window
        Point point = new Point(250,250);
        driver.manage().window().setPosition(point);
        Thread.sleep(2000);

        // Maximize the window
        driver.manage().window().maximize();
        Thread.sleep(2000);








    }
    @AfterTest
    @Description("Closing browser")
    public void closeBrowser(){
        driver.quit();
    }
}


