import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BMICalculatorTest {

    @Test

    public void googleSearchShouldReturnResults() {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver");

        ChromeDriver driver = new ChromeDriver();

        driver.get("http://google.com");

        driver.findElement(By.name("q")).sendKeys("test");

        driver.findElement(By.name("btnK")).submit();
    }
}
