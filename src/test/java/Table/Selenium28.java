package Table;

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
import java.util.List;

public class Selenium28 {
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
        String url = "https://awesomeqa.com/webtable1.html";
        driver.get(url);
        driver.manage().window().maximize();

        WebElement table = driver.findElement(By.xpath("//table[@summary='Sample Table']/tbody"));
        List<WebElement> rows_table = driver.findElements(By.id("tr"));
        System.out.println(rows_table.size());

        for (int i=1; i<=rows_table.size(); i++){
            List<WebElement> column_table = driver.findElements(By.id("td"));
            for (WebElement ct :column_table){
                System.out.println(ct.getText());
            }
        }



    }




















    @AfterTest(groups = "QA")
    @Description("TC Description")
    public void closeBrowser(){
        driver.quit();
    }


}
