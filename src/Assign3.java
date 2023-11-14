import io.github.bonigarcia.wdm.WebDriverManager;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;

public class Assign3 {
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        WebElement element= driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
        element.sendKeys("aerospace wiki");
        element.sendKeys(Keys.ENTER);
        driver.navigate().to("https://demo.guru99.com/test/drag_drop.html");
        Thread.sleep(3000);
        Actions action = new Actions(driver);

WebElement dragElement=driver.findElement(By.xpath("//a[normalize-space()='BANK']"));
WebElement dropBox=driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));
action.moveToElement(dropBox);
        action.dragAndDrop(dragElement, dropBox).build().perform();
        Thread.sleep(3000);
        driver.navigate().to("https://spurquest.com/");
       WebElement footer=driver.findElement(By.xpath("//div[@class='forminator-col']//div[@class='forminator-field']"));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", footer);
        Thread.sleep(500);
        TakesScreenshot takess = ((TakesScreenshot) driver);
        File ssFile = takess.getScreenshotAs(OutputType.FILE);
        File DestFile = new File("src/test/Screenshot/footer.png");
        FileUtils.copyFile(ssFile, DestFile);
        driver.quit();
    }
}
