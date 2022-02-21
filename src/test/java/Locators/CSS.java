package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CSS {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/java/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://de-de.facebook.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[@title='Alle Cookies gestatten']")).click();

        //     CSS Locator Syntax:
        //     tagName[attribute='value'] /// tagName#ID or #ID  /// tagName.className or .className

        //driver.findElement(By.cssSelector("input[name='email']")).sendKeys("Tarik");
        driver.findElement(By.cssSelector("input#email")).sendKeys("Tarik");
        //driver.findElement(By.cssSelector("input.inputtext")).sendKeys("Tarik");

    }
}
