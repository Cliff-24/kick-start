package base.browserOption;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class edgeBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "/src/main/java/drivers/msedgedriver.exe");

        EdgeOptions edgeOptions = new  EdgeOptions();
        edgeOptions .addArguments(("start-maximized"));
        edgeOptions .addArguments("--incognito");

        WebDriver driver = new EdgeDriver();













        //driver.findElement(By.id("twotabsearchtextbox")).sendKeys("JBL SPeaker");
      //  driver.findElement(By.id("nav-search-submit-button")).click();


    }
}
