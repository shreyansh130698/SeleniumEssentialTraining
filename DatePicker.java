import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
    public static void main(String[] args) {
        //In this test we are working with Date Pickers

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Shreyansh\\Downloads/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");

        WebElement datepicker = driver.findElement(By.id("datepicker"));
        datepicker.sendKeys("06/13/2050");
        datepicker.sendKeys(Keys.RETURN);               // Clicks Enter button

        driver.quit();
    }
}
