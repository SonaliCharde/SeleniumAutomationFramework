package Scroll_JavaScriptExecutor;

import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selenium31 {
    // Atomic Test Cases
    // TC who don't have any dep.
    // They serve single purpose 0

    WebDriver driver ;

    @BeforeTest
    public void openBrowser(){
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new ChromeDriver(options);
    }


    @Test(groups = "QA")
    @Description ("Test case Description")
    public void testPositive() throws InterruptedException {

        String url = "https://selectorshub.com/xpath-practice-page/";
        driver.get(url);
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        //Javascript Code -  document.querySelector("div#userName").shadowRoot.querySelector("div").shadowRoot.querySelector("input#pizza")

        WebElement divscrollTo = driver.findElement(By.xpath("//div[@id='userName']"));
        js.executeScript("arguments[0].scrollIntoView(true);",divscrollTo);

        Thread.sleep(3000);

        WebElement inputPizza = (WebElement) js.executeScript("return document.querySelector(\"div#userName\")." +
                "shadowRoot.querySelector(\"div\").shadowRoot.querySelector(\"input#pizza\")");
        inputPizza.sendKeys("Farmhouse");

        Thread.sleep(13000);














    }






























    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }

}
