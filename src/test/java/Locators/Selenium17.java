package Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selenium17 {
    // Atomic Test Cases
    // TC who don't have any dependency.
    // They serve single purpose  like open and close browser

    WebDriver driver;
    @BeforeTest
    public void openBrowser(){
        // Create Session via the API and Session ID is generated
        driver = new ChromeDriver();
    }

    @Test(groups = "QA")
    @Description("Test Case Description")
    public void testHerokuLogin_positive()throws InterruptedException{
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();
    }

    @Test(groups = "QA")
    @Description("Test Case Description")
    public void testHerokuLogin_Negative() throws InterruptedException{
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();
    }

    @AfterTest(groups = "QA")
    @Description("Closing of browser")
    public void closeBrowser(){
        driver.quit();
    }

}
