package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Xpath {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/java/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://de-de.facebook.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[@title='Alle Cookies gestatten']")).click();

        /*driver.findElement(By.xpath("//*[@class='acceptCookie' or contains(@class,'eu-cookie-compliance-secondary-button btn')]")).click();
        driver.findElement(By.xpath("//*[text()='Services']")).click();
        driver.findElement(By.xpath("//*[text()='Automation']")).click();*/
/*

Xpath Syntax:
//TageName[@Attribut='value']
//*[@Atribut='value']
//tageName[contains(@attribut, 'value')]

//*[text()='']
//tageName[contains(text()), 'value']
//*[contains(text()), 'value']
check: browser --> inspect --> console -->$x("Xpath")--> enter
Wenn ich den zweiten element anspriche ("Xpath")[2]

Relative Xpath: wie //TageName[@Attribut='value']
absulut Xpath: von Body bis zu Element --"//body/div/main...../input[2]"
 */


    }
}
