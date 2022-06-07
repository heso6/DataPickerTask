package Base;

import dataPicker.DataPickersPage;
import org.testng.annotations.BeforeMethod;

public class Page extends TestBase {

    public DataPickersPage dataPickersPage;

    @BeforeMethod
    public void pagesSetup() {
        dataPickersPage = new DataPickersPage(driver);
    }
}