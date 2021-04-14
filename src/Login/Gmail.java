package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Gmail {
    public static void main (string [] args)
    {
        System.setProperty("webdriver.chrome.driver", "C\\User\\nziok\\downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https:accounts.google.com");
        findElement(By.id("identifier")).sendKeys("nziokateddy@gmail.com");
        findElement(By.xpath('//*[@id="identifierNext"]/div/button/div[2]')).click();
        findElement(By.id("name")).sendKeys("password");
        findElement(By.xpath('//*[@id="passwordNext"]/div/button/div[2]')).click();
    }
}
