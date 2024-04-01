package Locators.CSS;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Selenium20 {
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
    public void testLogin() throws InterruptedException {
        driver.get("https://wf-ecomm-pwa-git-feat-enhanced-search-wellness-forever.vercel.app/");
        driver.manage().window().maximize();
        WebElement useCurrentlocationelement =
                driver.findElement(By.xpath("//button[contains(text(),'Use Current Location')]"));
        useCurrentlocationelement.click();
        Thread.sleep(3000);
        System.out.println(driver.getTitle());
        driver.quit();
    }
















    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
