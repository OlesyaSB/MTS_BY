import Base.NameBlock;
import Tests.BaseSeleniumTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class MTS extends BaseSeleniumTest {
    @Test
    public void checkTicket() {
        String number = "297777777";
        String sum = "200";
        NameBlock nameBlock = new NameBlock();
        nameBlock.fillFields(number, sum);
    }


}
