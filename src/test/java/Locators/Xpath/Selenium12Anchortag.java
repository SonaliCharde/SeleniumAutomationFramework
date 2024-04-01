package Locators.Xpath;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;


public class Selenium12Anchortag {

@Test (groups = "QA")
@Description("Verify Anchor Tags")

    public void testVerifyAnchortags() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com");

    WebElement LinkText = driver.findElement(By.linkText("Start a free trial"));
    WebElement PartialLinkText = driver.findElement(By.partialLinkText("Start a"));

    System.out.println(PartialLinkText.getAttribute("href"));
    PartialLinkText.click();
    driver.navigate().back();
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }

    driver.quit();

    }




}
