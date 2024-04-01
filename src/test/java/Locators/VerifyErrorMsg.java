package Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyErrorMsg {

    @Test(groups = "QA")
    @Description("Verify error message")
    public void testErrorMsg(){
        //        **Project #1 - TC ( Negaative) - Invalid username, pass - Error message**
//
//        1. Open the URL .app.vwo.com/#/login](https://app.vwo.com/#/login)
//        2. **Find the Email id** and enter the email as admin@admin.com
//        3. **Find the pass inputbox** and enter passwrod as admin.
//        4. Find and Click on the submit button
//        5. Verify that the error message is shown "Your email, password, IP address or location did not match"
//

        WebDriver driver1 = new EdgeDriver();
        driver1.get("https://app.vwo.com");
//          1) Username
//        <input type="email"
//        class="text-input W(100%)"
//        name="username"
//        id="login-username"
//        data-qa="hocewoqisi">
        WebElement username = driver1.findElement(By.id("login-username"));
        username.sendKeys("admin@admin.com");

        // 2) Password
//        <input type="password"
//        class="text-input W(100%)"
//        name="password"
//        id="login-password"
//        data-qa="jobodapuxe">
        WebElement password = driver1.findElement(By.name("password"));
        password.sendKeys("admin");

        // 3) SignIn button
//        <button type="submit"
//        id="js-login-btn"
//        class="btn btn--positive btn--inverted W(100%) H(48px) Fz(16px)"
//        onclick="login.login(event)"
//        data-qa="sibequkica">
//        <span class="icon loader hidden"
//        data-qa="zuyezasugu"></span>
//        <span data-qa="ezazsuguuy"> Sign in </span>
//        </button>
        driver1.findElement(By.id("js-login-btn")).click();
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            throw new RuntimeException();
        }


        // 4) Error Message
//      class="notification-box-description"
//      id="js-notification-box-msg"
//      data-qa="rixawilomi">
//              Your email, password, IP address or location did not match
//
        WebElement errorMsg = driver1.findElement(By.className("notification-box-description"));
       String testerrormsg = errorMsg.getText();


        Assert.assertEquals(testerrormsg,"Your email, password, IP address or location did not match");

        driver1.quit();



    }

}
