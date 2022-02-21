package DriverStart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class internetExplorerExam {

    public static void main(String[] args) {

        System.setProperty("webdriver.ie.driver","C:\\Users\\tdkhirec\\Desktop\\ChromeDriver\\IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.manage().window().maximize();
        driver.get("https://www.visualvest.de/");
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

    }
}
