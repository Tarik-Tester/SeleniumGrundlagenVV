package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ID {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/java/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.sogeti.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.switchTo().alert();
        driver.findElement(By.xpath("//*[@class='acceptCookie' or contains(@class,'eu-cookie-compliance-secondary-button btn')]")).click();
        //WebElement S = driver.findElement(By.cssSelector("body > div:nth-child(25) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(2)"));
        //WebElement l = driver.findElement(By.xpath("(//button[normalize-space()='Alle Cookies gestatten'])[1]"));
        //((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",S );
        //S.click();
        driver.findElement(By.xpath("//*[text()='About us']")).click();
        driver.findElement(By.xpath("//*[text()='About Sogeti']")).click();

        //driver.findElement(By.xpath("//*[text()='Search']")).click();
        //driver.findElement(By.xpath("//span[@aria-label='Search']")).click();
        driver.findElement(By.cssSelector("span[aria-label='Search']")).click();



        //driver.findElement(By.partialLinkText(""));
        //driver.findElement(By.linkText(""));
        //driver.findElement(By.className(""));
        //driver.findElement(By.name(""));

        //driver.findElement(By.linkText("Search")).click();
        //driver.findElement(By.xpath("//button[@class='sc-gsDKAQ ja-DsNe' or contains(@class,'sc-jcFjpl eUKJSw']")).click();
        //driver.close();
    }
}