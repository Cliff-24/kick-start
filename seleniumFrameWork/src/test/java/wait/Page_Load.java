package wait;

import base.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Page_Load extends Hooks {
    @Test
    public void loginPage(){
        driver.get("https://www.amazon.com/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("JBL Speaker");
        driver.findElement(By.id("nav-search-submit-button")).click();
        driver.get("https://www.amazon.com/JBL-Waterproof-Portable-Bluetooth-Speaker/dp/B07QDPXCSH/ref=sr_1_2?crid=RR4CS2X5L3XU&keywords=jbl+speaker&qid=1707033438&sprefix=jb+speak%2Caps%2C385&sr=8-2");
        driver.findElement(By.id("quantity_0"));

    }
}
