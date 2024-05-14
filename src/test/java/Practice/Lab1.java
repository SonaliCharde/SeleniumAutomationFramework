package Practice;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Lab1 {
WebDriver driver;

    @BeforeTest
    @Description("Opening browser")
    public void openBrowser(){
    ChromeOptions options = new ChromeOptions();
    options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
    options.addArguments("--guest");
    driver = new ChromeDriver(options);
}

    @Test(groups = "QA")
    @Description("TC Description")
    public void launchURL() throws InterruptedException {
    driver.get("https://www.facebook.com/");
       String url = driver.getCurrentUrl();
       Assert.assertEquals(url,"https://www.facebook.com/");
       Thread.sleep(2000);
}

    @AfterTest
    @Description("Closing browser")
    public void closeBrowser(){
    driver.quit();
}
}
