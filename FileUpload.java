import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
    public static void main(String[] args) {
        //In this test we will work with FileUpload

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Shreyansh\\Downloads/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/fileupload");

        WebElement fileuploadBtn = driver.findElement(By.id("file-upload-field"));
        fileuploadBtn.sendKeys("amazon.png");

        driver.quit();
    }
}
