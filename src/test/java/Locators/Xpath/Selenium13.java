package Locators.Xpath;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import java.util.List;

public class Selenium13 {
    @Test(groups = "QA")
    @Description("Print all the anchor Tags on this vwo.com")
    public void testPrintAllAnchortags(){
        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com");
        // Question - Print all the anchor Tags on this vwo.com
        // a tags and print the getText

        List<WebElement> AllAnchorTags = driver.findElements(By.tagName("a"));
//        AllAnchorTags.getFirst();
//        AllAnchorTags.getLast();
        AllAnchorTags.get(4);
        System.out.println(AllAnchorTags);
        for (WebElement l :AllAnchorTags){
            System.out.println(l.getText());
        }
        driver.close();
    }
}
