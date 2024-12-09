package Tests;

import org.junit.jupiter.api.Test;

public class TestNameTests extends BaseSeleniumTest{
    @Test
    public void chekingName() {
        TestName testName = new TestName();
        testName.checkName();
    }
}
