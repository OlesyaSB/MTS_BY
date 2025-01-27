package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

abstract public class BaseSeleniumTest {
    protected static WebDriver driver;

    @BeforeAll
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        BaseSeleniumPage.setDriver(driver);
    }

    @AfterAll
    public static void tearDown() {
        //driver.close();
        //driver.quit();
    }
}