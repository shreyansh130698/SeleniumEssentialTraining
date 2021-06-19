import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {
    public static void main(String[] args) {
        //In this test we are checking Dropdown button

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Shreyansh\\Downloads/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropdownBtn = driver.findElement(By.id("dropdownMenuButton"));
        dropdownBtn.click();

        WebElement dropdownElement = driver.findElement(By.xpath("/html/body/div/div/div/a[5]"));
        dropdownElement.click();

        driver.quit();
    }
}
