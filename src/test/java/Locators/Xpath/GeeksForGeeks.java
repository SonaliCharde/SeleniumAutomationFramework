package Locators.Xpath;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class GeeksForGeeks {
    @Test
    @Description("Verify GeeksforGeeks")

    public void VerifyURL(){
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.geeksforgeeks.org/");
        driver.manage().window().maximize();

//        WebElement one =
//                driver.switchTo().window(driver.findElement(By.xpath("//div[class='close-div']"))
//
  }
}
