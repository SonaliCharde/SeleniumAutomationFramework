package ActionsClass;

import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selenium32 {
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

       String url = "https://awesomeqa.com/practice.html";
       driver.get(url);
       driver.manage().window().maximize();

        // THETESTINGACADEMY
        // Shift Keydown -> thetestingacademy + Shift KeyUp

        WebElement firstname = driver.findElement(By.name("firstname"));

        Actions actions = new Actions(driver);
        actions.keyDown(Keys.SHIFT)
                .sendKeys(firstname,"thetestingacademy")
                .keyUp(Keys.SHIFT).build().perform();

        WebElement link = driver.findElement
                (By.xpath("//a[contains(text(),\"Click here to Download File\")]"));
        actions.contextClick().build().perform();














    }






























    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }

}
