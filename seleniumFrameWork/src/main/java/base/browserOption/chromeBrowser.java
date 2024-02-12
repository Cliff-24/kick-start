package base.browserOption;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class chromeBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/java/drivers/chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments(("start-maximized"));
        chromeOptions.addArguments("--incognito");

        WebDriver driver = new ChromeDriver();








    }
}
