package Base;

import data.DataPickersPage;
import org.testng.annotations.BeforeMethod;

public class PageBase extends TestBase {

    public DataPickersPage dataPickersPage;


    @BeforeMethod
    public void pagesSetup() {
        dataPickersPage = new DataPickersPage(driver);
    }
}