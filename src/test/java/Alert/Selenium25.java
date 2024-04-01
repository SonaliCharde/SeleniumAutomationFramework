package Alert;

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

import java.time.Duration;

public class Selenium25 {
    WebDriver driver;

    @BeforeTest(groups = "QA")
    @Description("TC Description")
    public void openBrowser(){
        driver = new EdgeDriver();
    }

    @Test(groups = "QA")
    @Description("Test Case Description")
    public void testPositive(){
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        ////button[@onclick='jsAlert()']
        // //button[text()='Click for JS Alert']

        WebElement element = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        element.click();

        // AWS, Machine, Docker, Alert will load very slow - limited RAM
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Pramod");
        alert.accept();
//        alert.dismiss();
        //alert.getText();

        String result = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(result,"You entered: Pramod");



    }




















    @AfterTest(groups = "QA")
    @Description("TC Description")
    public void closeBrowser(){
        driver.quit();
    }


}
