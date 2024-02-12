package base.browserOption;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class fireFoxBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/src/main/java/drivers/geckodriver.exe");

        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.addArguments(("start-maximized"));
        firefoxOptions.addArguments("--incognito");

        WebDriver driver = new FirefoxDriver();



    }
}
