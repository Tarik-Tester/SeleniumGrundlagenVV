package DriverStart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class fireFoxDriverEx {

    public static void main(String[] args){

        System.setProperty("webdriver.gecko.driver","src/test/java/drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.visualvest.de/");
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

    }
}
