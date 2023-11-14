import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Nov1 {
    public static void main(String[] args) throws Exception {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        Actions action= new Actions(driver);
        action.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        action.sendKeys(Keys.PAGE_UP).perform();
        Thread.sleep(3000);
        WebElement textBox=driver.findElement(By.id("textbox"));
action.moveToElement(textBox).click().keyDown(Keys.SHIFT).sendKeys("text in uppercase").keyDown(Keys.SHIFT).build().perform();
action.moveToElement(textBox).click().keyDown(Keys.SHIFT).sendKeys("text in uppercase").keyDown(Keys.SHIFT).build().perform();



    }}
