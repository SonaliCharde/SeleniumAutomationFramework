package Locators.Xpath;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium14 {
    @Test(groups = "QA")
    @Description("VerifyVWo login and get the url")
    public void verifyVWOLogin() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com");
        driver.getCurrentUrl();
        System.out.println(driver.getCurrentUrl());

    }
}
