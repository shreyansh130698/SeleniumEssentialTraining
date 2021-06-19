import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.assertEquals;

public class Form {
    public static void main(String[] args) {
        //In this test we are filling a form and checking that final text is same as expected tect

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Shreyansh\\Downloads/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        driver.findElement(By.id("first-name")).sendKeys("Shreyansh");
        driver.findElement(By.id("last-name")).sendKeys("Srivastava");
        driver.findElement(By.id("job-title")).sendKeys("QA Engineer");
        driver.findElement(By.cssSelector("input[value='radio-button-3']")).click();
        driver.findElement(By.id("checkbox-1")).click();
        driver.findElement(By.id("select-menu")).click();
        driver.findElement(By.xpath("//*[@id=\"select-menu\"]/option[2]")).click();
        driver.findElement(By.id("datepicker")).sendKeys("06/13/1998");
        driver.findElement(By.id("datepicker")).sendKeys("Keys.RETURN");

        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();

        WebDriverWait wait = new WebDriverWait(driver, 10);                                 //Adding Waits
        WebElement alert = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert")));    //Waiting for WebElement to display

        String alertText = alert.getText();                 //Fetching alert the text

        assertEquals("The form was successfully submitted!", alertText);        //comparing the alert text with expected text

        driver.quit();
    }
}
