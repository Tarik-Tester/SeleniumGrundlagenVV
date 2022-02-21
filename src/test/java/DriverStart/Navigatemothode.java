package DriverStart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Navigatemothode {

    public static void main(String[] args){

        //System.setProperty("webdriver.chrome.driver","C:\\Users\\tdkhirec\\Desktop\\ChromeDriver\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver","src/test/java/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        driver.navigate().to("https://amazon.de");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
        System.out.print(driver.getWindowHandle());
        driver.close();// it will close the current page that you opend
        //driver.quit();// it will close all the pages 

    }
}
