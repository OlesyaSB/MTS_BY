package Base;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MoreInfo extends BaseSeleniumPage {
    public MoreInfo() {
        driver.get("http://mts.by/");
    }

    public MoreInfo checkUrl() {
        WebElement moreInfoLink = driver.findElement(By.xpath("//*[@id='pay-section']/div/div/div[2]/section/div/a"));
        moreInfoLink.click();
        String expectedUrl = "/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";
        String actualUrl = driver.getCurrentUrl();
        assertEquals(actualUrl, expectedUrl);
        return null;
    }
}
