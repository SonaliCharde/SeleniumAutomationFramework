package Locators;

import io.qameta.allure.Description;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium15 {

    @Test(groups = "QA")
    @Description("Verify the current URl, title of https://katalon-demo-cura.herokuapp.com/")
    public void testVerifyherokuapp() throws InterruptedException {

//        EdgeOptions options = new EdgeOptions();
//        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        WebDriver driver = new EdgeDriver();
        driver.navigate().to("https://katalon-demo-cura.herokuapp.com");
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/");

        //Click on make Appointment button

        //<a id="btn-make-appointment" - //a[@id='btn-make-appointment']
        // href="./profile.php#login"  -//a[@href='./profile.php#login']
        // class="btn btn-dark btn-lg"> - //a[@class="btn btn-dark btn-lg"]
        // Make Appointment</a>         - By.Linktext("Make Appointment"))

        WebElement Appointmentbutton = driver.findElement(By.id("btn-make-appointment"));
        //Appointmentbutton.click();
        Appointmentbutton.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/profile.php#login");


//        WebElement gettext =
//                driver.findElement(By.xpath("//p[contains(text(),'Please login to make appointment.')]"));
//        System.out.println(gettext);
//        WebElement gettext1 =
//                driver.findElement(By.xpath("//h2[contains(text(),'Login')]"));
//        System.out.println(gettext1);

        List<WebElement> usernameelement = driver.findElements(By.xpath("//input[@placeholder='Password']"));
        usernameelement.get(1).sendKeys("John Doe");


//    WebElement username = driver.findElement(By.xpath("//input[@id='txt-username']"));
//    username.sendKeys("John Doe");

    WebElement password = driver.findElement(By.xpath("//input[@id='txt-password']"));
    password.sendKeys("ThisIsNotAPassword");
    WebElement Loginbutton = driver.findElement(By.xpath("//button[@id='btn-login']"));
    Loginbutton.click();

        driver.quit();




    }
}
