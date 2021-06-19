import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlert {
    public static void main(String[] args)throws Exception {
        //In thi test we are checking Alert functionality by using   driver.switchTo().alert();

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Shreyansh\\Downloads/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement alertBtn = driver.findElement(By.id("alert-button"));
        alertBtn.click();
        //Thread.sleep(2000);

        Alert alert = driver.switchTo().alert();        //Switches action to Alert pop-up
        alert.accept();                                 //Clicks OK on Alert pop-up

        driver.quit();
    }
}
