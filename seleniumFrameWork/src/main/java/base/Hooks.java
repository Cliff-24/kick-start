package base;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Hooks {

    public WebDriver driver;

@BeforeTest
    public  void setup() throws IOException {
        Properties properties = new Properties();
        FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/properties/config.properties");
        properties.load(file);

        String browserType = properties.getProperty("browser");

        switch (browserType){
            case "chrome":
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/java/drivers/chromedriver.exe");

                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments(("start-maximized"));
                chromeOptions.addArguments("--incognito");
                chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
                 driver = new ChromeDriver(chromeOptions);
                break;

            case "firefox":
                System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/src/main/java/drivers/geckodriver.exe");

                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.addArguments(("start-maximized"));
                firefoxOptions.addArguments("--incognito");
               firefoxOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
                 driver = new FirefoxDriver();
                break;

            case "edge":
                System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "/src/main/java/drivers/msedgedriver.exe");

                EdgeOptions edgeOptions = new  EdgeOptions();
                edgeOptions .addArguments(("start-maximized"));
                edgeOptions .addArguments("--incognito");
                 driver = new EdgeDriver();

        }

    driver.manage().window().maximize();

    }
public void actionsOnHover(){
    WebElement ele = driver.findElement(By.xpath("<xpath>"));

//Creating object of an Actions class
    Actions action = new Actions(driver);


}
    @AfterTest
    public void tearDown(){
    driver.quit();
    }

}
