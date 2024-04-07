package ActionsClass;

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

public class Selenium34 {
    // Atomic Test Cases
    // TC who don't have any dep.
    // They serve single purpose 0

    WebDriver driver ;

    @BeforeTest
    public void openBrowser(){
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new ChromeDriver(options);
    }


    @Test(groups = "QA")
    @Description ("Test case Description")
    public void testPositive() throws InterruptedException {

       String url = "https://www.makemytrip.com/";
       driver.get(url);
       driver.manage().window().maximize();
       Thread.sleep(4000);

        WebElement fromCity = driver.findElement(By.id("id=\"fromCity"));
        Actions actions = new Actions(driver);
        actions.moveToElement(fromCity).click().sendKeys("New Delhi").build().perform();

        //ul.react-autosuggest__suggestions-list > li

        List<WebElement> list_auto_complete = driver.findElements
                (By.xpath("//ul[@class=\"react-autosuggest__suggestions-list\"]"));


        for (WebElement li: list_auto_complete){
            if (li.getText().contains("New Delhi")){
                li.click();
                break;
            }
        }

        Thread.sleep(3000);










    }






























    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }

}
