package DriverStart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class chromeDriverExample {

    public static void main(String[] args){

        //System.setProperty("webdriver.chrome.driver","C:\\Users\\tdkhirec\\Desktop\\ChromeDriver\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver","src/test/java/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.visualvest.de/");
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

    }
}
