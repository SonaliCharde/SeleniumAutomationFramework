package SeleniumBasics.Options;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Selenium05 {
    public static void main(String[] args) {
        EdgeOptions edgeOptions = new EdgeOptions();
        /*
         * 1. headless
         * 2. start max
         * 3. window
         * 4. add extentions
         * 5. 100 of another options - you can use with it
         *
         * */
        edgeOptions.getBrowserName();
        edgeOptions.addArguments("--start-maximized");
        edgeOptions.addArguments("--window-size=800,600");

        EdgeDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://sdet.live");
        System.out.println(driver.getTitle());

        driver.quit();
    }
}
