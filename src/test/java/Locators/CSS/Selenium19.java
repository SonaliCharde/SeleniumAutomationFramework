package Locators.CSS;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.List;

public class Selenium19 {
    // Atomic Test Cases
    // TC who don't have any dep.
    // They serve single purpose 0

    WebDriver driver;


    @BeforeTest(groups = "QA")
    @Description("TC - Edgeoptions- SetPageLoad Strategy")
    public void openBrowser(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(chromeOptions);
    }

    @Test(groups = "QA")
    @Description("TC Description")
    public void testPositive() throws InterruptedException {
        driver.get("https://www.ebay.com/b/Desktops-All-In-One-Computers/171957/bn_1643067");
        //driver.manage().window().maximize();

        WebElement Searchbox = driver.findElement(By.cssSelector("input#gh-ac"));
        Searchbox.sendKeys("macmini");

        WebElement Searchbutton = driver.findElement(By.id("gh-btn"));
        Searchbox.click();
        Thread.sleep(5000);

        List<WebElement> searcheditems = driver.findElements(By.xpath("//div[@class='item__title']"));
        int i =0;
        for (WebElement titles :searcheditems){
            System.out.println(titles.getText());

        if (i==2) {
            titles.click();
        }
        i++;
        }


        }
    @AfterTest(groups = "QA")
    @Description("TC - Edgeoptions- SetPageLoad Strategy")
    public void closeBrowser(){
        driver.quit();
    }
    }



