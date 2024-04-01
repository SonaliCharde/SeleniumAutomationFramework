package Locators.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Amazon {
    WebDriver driver = new EdgeDriver();

    @Test
    public void verifyAmazon(){
        driver.get("https://www.amazon.in/");
        WebElement one = driver.findElement(By.xpath("//h2[text()='Appliances for your home | Up to 55% off']"));
        one.click();
        System.out.println(one.getText());
        Assert.assertEquals(one.getText(),"Appliances for your home | Up to 55% off");

        driver.quit();

    }

}
