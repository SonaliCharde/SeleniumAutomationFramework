package ActionsClass;

import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium37 {
    // Atomic Test Cases
    // TC who don't have any dep.
    // They serve single purpose 0

    WebDriver driver;

    @BeforeTest
    @Description("Initialising driver")
    public void openBrowser(){
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver= new ChromeDriver(options);
    }

    @Test (groups = "QA")
    @Description("TC Description")
    public void testPositive() throws InterruptedException {
        String url = "https://the-internet.herokuapp.com/drag_and_drop";
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(5000);

    //        List<WebElement> elements = driver.findElements(By.xpath("//div[@id='columns']"));
    //        for (WebElement ele : elements){
    //            System.out.println(ele.getText());
        WebElement from = driver.findElement(By.xpath("//div[@id=\"column-a\"]"));
        WebElement to = driver.findElement(By.xpath("//div[@id=\"column-b\"]"));


            Actions actions = new Actions(driver);
            actions.clickAndHold(from).moveToElement(to).release().build().perform();

        Thread.sleep(5000);

        driver.get("https://awesomeqa.com/selenium/upload.html");
        WebElement file_upload = driver.findElement(By.id("fileToUpload"));
        String dir = System.getProperty("user.dir");

        file_upload.sendKeys(dir+"src/test/java/ActionsClass/ToUpload.txt");
        driver.findElement(By.name("submit")).click();

        // Download File
        // Checked by the ChromeOption
        // Problem - Download a file and check in the dir if that is present.
        // ChromeOptions -> dir(Doc)
        // filename.doc ->  /User/pramod/Download/chrome
        // file exist - T

    }












    @AfterTest
    @Description("Closing browser")
    public void closeBrowser(){
        driver.quit();
    }
}
