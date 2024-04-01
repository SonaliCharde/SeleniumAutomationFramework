package Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium11 {

    @Test(groups = "QA")
    @Description("Verify the current URl, title of VWO app")
    public void testVWOLogin() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        // 1. Open the URL .app.vwo.com/#/login](https://app.vwo.com/#/login)

        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(driver.getTitle(), "Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/login");

        WebElement username = driver.findElement(By.xpath("//input[@id='login-username']"));
        username.sendKeys("admin@admin.com");

        WebElement password = driver.findElement(By.id("login-password"));
        password.sendKeys("admin");

        WebElement Loginbutton = driver.findElement(By.id("js-login-btn"));
        Loginbutton.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement Errormsg = driver.findElement(By.id("js-notification-box-msg"));
        String ErrormsgText = Errormsg.getText();
        System.out.println(ErrormsgText);

        Assert.assertEquals(ErrormsgText, "Your email, password, IP address or location did not match");

        driver.quit();

    }


    }


