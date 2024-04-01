package Locators.Xpath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium12 {
    // Locators
    // 1. ID, ClassName, Name, byTag F(n) -> GetText and GetAttribute (Webelements)

    // 2. LinkText & Partial Text
    // 3.Css Selectors
    // 4. Xpath
   @Test (groups = "QA")
            public void testVWOLogin(){
       WebDriver driver = new ChromeDriver();
       driver.get("https://app.vwo.com");

   }
    WebDriver driver;


}
