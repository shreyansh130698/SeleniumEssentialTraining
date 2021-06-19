import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public class RadioButtons {
    public static void main(String[] args) {
        /*In this test we are working with different properties of Radio buttons
            using implicitWaits and explicitWaits        */

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Shreyansh\\Downloads/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/radiobutton");

        WebElement radioBtn1 = driver.findElement(By.id("radio-button-1"));
        radioBtn1.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement radioBtn2 = driver.findElement(By.cssSelector("input[value='option2']"));
        radioBtn2.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement radioBtn3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
        radioBtn3.click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        driver.quit();
    }
}
