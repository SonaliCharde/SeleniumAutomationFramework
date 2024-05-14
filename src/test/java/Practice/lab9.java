package Practice;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class lab9 {
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
    public void facebookLogin() throws InterruptedException {
        // Derive the xpath expression for the elements which are present in FaceBook login or
        //sign up page.

        driver.get("https://www.facebook.com/r.php/");
        driver.manage().window().maximize();

       WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
       firstname.sendKeys("Sonali");
       WebElement Surname = driver.findElement(By.xpath("//input[@name='lastname']"));
       Surname.sendKeys("Sarje");
       WebElement Mobile = driver.findElement(By.xpath("//input[@name='reg_email__']"));
       Mobile.sendKeys("7249455606");
       WebElement NewPassword = driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
       NewPassword.sendKeys("tusharsonali");


       WebElement dayDropdown = driver.findElement(By.xpath("//*[@id=\"day\"]"));
       WebElement monthDropdown = driver.findElement(By.xpath("//*[@id=\"month\"]"));
       WebElement yearDropdown  = driver.findElement(By.xpath("//*[@id=\"year\"]"));

        Select select = new Select(dayDropdown);
        select.selectByVisibleText("4");

        Select select1 = new Select(monthDropdown);
        select1.selectByVisibleText("Jul");

        Select select2 = new Select(yearDropdown);
        select2.selectByVisibleText("1990");

        WebElement genderradiobox = driver.findElement(By.xpath("//*[@type='radio'][1]"));
        genderradiobox.click();

        WebElement Signupbutton = driver.findElement(By.xpath("//*[@type=\"submit\"][1]"));
        Signupbutton.click();


    }
    @AfterTest
    @Description("Closing browser")
    public void closeBrowser(){
        driver.quit();
    }
}


