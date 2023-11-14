import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static org.openqa.selenium.WebDriver.*;


public class Prac {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/alerts");

        WebElement button = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
        button.click();
        Thread.sleep(6000);
        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement alertButton = driver.findElement(By.xpath("//button[@id='alertButton']"));
        alertButton.click();
        Thread.sleep(3000);
        Alert alert1 = driver.switchTo().alert();
        alert1.accept();

        WebElement alertButton1 = driver.findElement(By.xpath("//button[@id='confirmButton']"));
        alertButton1.click();
        Thread.sleep(3000);
        Alert alert2 = driver.switchTo().alert();
        alert2.accept();

        WebElement alertButton2 = driver.findElement(By.xpath("//button[@id='promtButton']"));
        alertButton2.click();
        Thread.sleep(3000);
        Alert alert3 = driver.switchTo().alert();
        alert3.accept();
driver.navigate().to("https://www.google.com/");

WebElement element= driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
element.sendKeys("aerospace wiki");
element.sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//h3[normalize-space()='Aerospace']")).click();

JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250);");
        js.executeScript("window.scrollBy(0, 500);");
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0, -500);");

        Thread.sleep(500);
        driver.close();
        driver.quit();
    }
}
