package Practice;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class lab8 {
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
    public void Login() throws InterruptedException {
//        Link Text

        driver.get("https://adactin.com/HotelApp/index.php");
        driver.manage().window().maximize();

        WebElement forgotpassword = driver.findElement(By.partialLinkText("Forgot"));
        forgotpassword.click();











    }
    @AfterTest
    @Description("Closing browser")
    public void closeBrowser(){
        driver.quit();
    }
}


