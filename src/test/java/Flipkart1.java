import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class Flipkart1 {
    WebDriver driver;

    @BeforeTest(groups = "QA")
    @Description("TC Description")
    public void openBrowser(){
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(options);
    }

    @Test(groups = "QA")
    @Description("Test Case Description")
    public void testPositive() throws InterruptedException {
        String url = "https://www.flipkart.com/";
        driver.get(url);
        driver.manage().window().maximize();

        WebElement one = driver.findElement(By.xpath("//*[text()='Electronics']"));
        one.click();
        WebElement two = driver.findElement(By.xpath("//*[local-name()='svg']"));

        Actions actions = new Actions(driver);
        //actions.moveToElement(two).moveToElement()

//        List<WebElement> electronics_list = driver.findElements(By.xpath("//*[local-name()='svg']"));
//        for (WebElement li : electronics_list){
//            String list = li.getText();
//            System.out.println(list);
//        }



    }




















    @AfterTest(groups = "QA")
    @Description("TC Description")
    public void closeBrowser(){
        driver.quit();
    }


}
