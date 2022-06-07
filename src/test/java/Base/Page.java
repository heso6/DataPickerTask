package Base;

import dataPicker.DatePickersPage;
import org.testng.annotations.BeforeMethod;

public class Page extends TestBase {

    public DatePickersPage datePickersPage;

    @BeforeMethod
    public void pagesSetup() {
        datePickersPage = new DatePickersPage(driver);
    }
}