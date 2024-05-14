package Practice;

import io.qameta.allure.Description;
import org.junit.After;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Scanner;

public class Lab2 {
    //Write a Script to open and close the browser based on user input

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
    public void UserinputOpenclose() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Browser name");
        String browser = sc.nextLine();
        WebDriver driver = null;
        if (browser.equals("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equals("Edge")) {
            driver = new EdgeDriver();
        } else if (browser.equals("Firefox")) {
            driver = new FirefoxDriver();
        } else {
            driver = new InternetExplorerDriver();
        }
    }
    @AfterTest
    @Description("Closing browser")
    public void closeBrowser(){
        driver.quit();
    }
}
