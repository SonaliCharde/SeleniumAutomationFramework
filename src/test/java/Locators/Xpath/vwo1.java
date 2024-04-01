package Locators.Xpath;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class vwo1 {
    WebDriver driver= new EdgeDriver();

    @Test(groups = "Xpath Locators")
    @Description("Verify app.vwo.com")

    public void test1(){
        //Open URL
       driver.navigate().to("https://app.vwo.com");
       driver.manage().window().maximize();
        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/login");
    }

    @Test(groups = "Xpath Locators")
    @Description("Verify with incorrect credentials")
    public void Test2(){
        WebElement username = driver.findElement(By.xpath("//input[@id='login-username']"));
        username.sendKeys("sonali.charde4790@gmail.com");
        WebElement password = driver.findElement(By.xpath("//input[@name=\"password\"]"));
        password.sendKeys("admin");






    }

}
