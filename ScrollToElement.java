import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class ScrollToElement {
    public static void main(String[] args) {

        //In this test we are working on scrolling functionality by using Actions
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Shreyansh\\Downloads/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");

        WebElement name = driver.findElement(By.id("name"));
        Actions actions = new Actions(driver);
        actions.moveToElement(name);
        name .sendKeys("Shreyansh Srivastava");

        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("13/06/1998");

        driver.quit();
    }
}
//