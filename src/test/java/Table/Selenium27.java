package Table;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.Dimension;

import java.util.List;

public class Selenium27 {
    WebDriver driver;

    @BeforeTest(groups = "QA")
    @Description("TC Description")
    public void openBrowser(){
        driver = new ChromeDriver();
    }

    @Test(groups = "QA")
    @Description("Test Case Description")
    public void testPositive() throws InterruptedException {
        String url = "https://awesomeqa.com/webtable.html";
        driver.get(url);
        driver.manage().window().maximize();

        // table[@id="customers"]/tbody/tr[5]/td[2] - Helen Bennett
        // /following-sibling::td - Country


        // Print all the data in the table and if name Halen = country she belongs too


        // xpath ->  //table[@id="customers"]/tbody/tr[5]/td[2]

        //xpath - //table[@id="customers"]/tbody/tr[
        // i
        // ]/td[
        // j
        // ]
        String firstpart = "//table[@id=\"customers\"]/tbody/tr[";
        String secondpart = "]/td[";
        String thirdpart = "]";

        int row =
                driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
        int column =
                By.xpath("//table[@id=\"customers\"]/tbody/tr[2]/td").findElements(driver).size();

        for (int i =2; i<=row; i++){
            for (int j=1; j<=column; j++){
                String dynamicXpath = firstpart+i+secondpart+j+thirdpart;
                String data = driver.findElement(By.xpath(dynamicXpath)).getText();
                System.out.println(data);
                if (data.contains("Helen Bennett")){
                    String country_path = dynamicXpath+"/following-sibling::td[1]";
                    String country_text= driver.findElement(By.xpath(country_path)).getText();
                    System.out.println("------------------------");
                    System.out.println("Helen is in -"+country_text);
                }
            }
        }



    }




















    @AfterTest(groups = "QA")
    @Description("TC Description")
    public void closeBrowser(){
        driver.quit();
    }


}
