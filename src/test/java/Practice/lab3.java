package Practice;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Scanner;

public class lab3 {
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
    public void Invalidlogin() throws InterruptedException {
        driver.get("https://adactinhotelapp.com/");
        driver.manage().window().maximize();
        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        WebElement loginbtn = driver.findElement(By.id("login"));
        username.sendKeys("Sonali");
        password.sendKeys("password");
        loginbtn.click();
        Thread.sleep(10000);

        WebElement errormsg = driver.findElement
                (By.xpath("//*[@id=\"login_form\"]/table/tbody/tr[5]/td[2]/div/b/text()[1]"));
        WebElement errorlink = driver.findElement(By.linkText("Click here"));


//        Assert.assertSame(errormsg,"Invalid Login details or Your Password might have expired. ");
//        Assert.assertTrue(errorlink.isEnabled());
//
    }
    @AfterTest
    @Description("Closing browser")
    public void closeBrowser(){
        driver.quit();
    }
}


