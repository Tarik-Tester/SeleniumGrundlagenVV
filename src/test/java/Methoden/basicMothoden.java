package Methoden;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class basicMothoden {

    public static void main(String[] args){

        //System.setProperty("webdriver.chrome.driver","C:\\Users\\tdkhirec\\Desktop\\ChromeDriver\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver","src/test/java/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

        String ActualUrl = driver.getCurrentUrl();
        if(ActualUrl.contentEquals("https://www.google.com/")){
            System.out.print("Pass");
        }else{
            System.out.print("Fail");
        }
        String AktualTitle = driver.getTitle();
        System.out.print(AktualTitle);
        String ExpectedTitel = "Google";
        Assert.assertEquals(AktualTitle, ExpectedTitel);

        System.out.print(driver.getPageSource());


    }

}
