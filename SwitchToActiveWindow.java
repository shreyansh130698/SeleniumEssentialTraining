import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args)throws Exception {
        /*In this test we are switching between the tabs
            We can switch tabs by using- driver.switchTo().window(WindowName);        */

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Shreyansh\\Downloads/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement newTabBtn = driver.findElement(By.id("new-tab-button"));
        newTabBtn.click();
       // Thread.sleep(2000);

        String originalHandle = driver.getWindowHandle();   // Gets the original tab (first tab/main tab)

        for(String handle1: driver.getWindowHandles()){     //fetch the active tabs
            driver.switchTo().window(handle1);              //switches to second tab
        }
        //Thread.sleep(2000);
        driver.switchTo().window(originalHandle);

        driver.quit();
    }
}
