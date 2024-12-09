package Base;

import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestName extends BaseSeleniumPage {
    public TestName() {
        driver.get("http://mts.by/");
    }

    public TestName checkName() {
        String expectedName = "Онлайн пополнение\n" +
                "без комиссии";
        String actualName = driver.findElement(By.xpath("//div[@class='pay__wrapper']/h2")).getText();
        assertEquals(expectedName, actualName);

        return null;
    }

}
