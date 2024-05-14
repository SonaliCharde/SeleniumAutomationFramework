package Practice;

import io.qameta.allure.Description;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class lab5 {
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
//        NAVIGATION COMMANDS
//        1. Navigate().to()
//        2. Refresh()
//        3. Back()
//        4. Forword()


        driver.manage().window().maximize();

        // Delete all cookies
       driver.manage().deleteAllCookies();

        driver.navigate().to("https://www.google.com/");
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();









    }
    @AfterTest
    @Description("Closing browser")
    public void closeBrowser(){
        driver.quit();
    }
}


