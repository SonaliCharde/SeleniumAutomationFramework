package Checkboxes;

import io.qameta.allure.Description;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.List;

import java.time.Duration;

public class Selenium26 {
    WebDriver driver;

    @BeforeTest(groups = "QA")
    @Description("TC Description")
    public void openBrowser(){
        driver = new EdgeDriver();
    }

    @Test(groups = "QA")
    @Description("Test Case Description")
    public void testPositive() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        driver.manage().window().maximize();

        List<WebElement> checkbox   = driver.findElements(By.id("checkboxes"));
        WebElement ch1 = checkbox.get(0);
        ch1.click();
        Thread.sleep(5000);





    }




















    @AfterTest(groups = "QA")
    @Description("TC Description")
    public void closeBrowser(){
        driver.quit();
    }


}
