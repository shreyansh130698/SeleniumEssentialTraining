import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Autocomplete {
    public static void main(String[] args) {

        //In this test we are testing Autocomplete functionality by entering data to Address field and rest of the fields will be auto-populated.
        //We are also checking explicit wait
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Shreyansh\\Downloads/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        //autocomplete.click();
        autocomplete.sendKeys("National P.G. College Academic Block, Rana Pratap Marg, Hazratganj, Lucknow, Uttar Pradesh, India");
        WebDriverWait wait = new WebDriverWait(driver, 10);

       // WebElement autocompleteResult = driver.findElement(By.className("pac-item"));
        WebElement autocompleteResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("pac-item")));
        autocompleteResult.click();

        driver.quit();
    }
}
