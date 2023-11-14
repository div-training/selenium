import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;


public class Novorg {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
                driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(3000);
        TakesScreenshot takess = ((TakesScreenshot) driver);
        File ssFile = takess.getScreenshotAs(OutputType.FILE);
        File DestFile = new File("src/test/Screenshot/Loginscreen.png");
        FileUtils.copyFile(ssFile, DestFile);

    // WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(3));
    // webDriverWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("username"))));
        driver.findElement(By.name("username")).sendKeys("Admin");
    //driver.findElement(By.name("password")).click();
        driver.findElement(By.name("password")).sendKeys("admin123");
driver.findElement(By.xpath("//button[@type='submit']")).click();
Thread.sleep(3000);
    String dashboard = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).getText();
        Assert.assertEquals(dashboard,"Dashboard");
        driver.findElement(By.xpath("//li[1]//a[1]//span[1]")).click();
        Thread.sleep(3000);
driver.findElement(By.xpath("//span[normalize-space()='Job']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//a[normalize-space()='Job Titles']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active']")).sendKeys("Jr.SDET");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@type='submit']")).click();
WebElement alertButton= driver.findElement(By.xpath("//button[@name=\"alertbox\"]"));
alertButton.click();
        Thread.sleep(3000);
        Alert alert=driver.switchTo().alert();
        alert.accept();


}
}