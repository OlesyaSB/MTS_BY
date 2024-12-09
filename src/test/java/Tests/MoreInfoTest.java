package Tests;

import Base.MoreInfo;
import org.junit.jupiter.api.Test;

public class MoreInfoTest extends BaseSeleniumTest {
    @Test
    public void checkMoreInfo() {
        MoreInfo moreInfo = new MoreInfo();
        moreInfo.checkUrl();
    }
}
