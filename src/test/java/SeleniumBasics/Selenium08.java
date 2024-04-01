package SeleniumBasics;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Selenium08 {
    public static void main(String[] args) {
        EdgeDriver edgeDriver = new EdgeDriver(); // Dynamic Dispatch -> Runtime Polymorphism
        edgeDriver.get("https://sdet.live");

        System.out.println(edgeDriver.getTitle());
        System.out.println(edgeDriver.getCurrentUrl());

        //   driver.close(); // Close the Current Browser Window - not the full browser
        // Closed the window, Session id != null, Error - Invalid session Id

        edgeDriver.quit();
        // Close all the /sessions/windows and stop the browser
        // driver.quit(); // Closed All the window and Session = null, Error - Session ID is null

    }
}
