import BasePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;


public class DataPickersPage extends BasePage {


    public DataPickersPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = "#datepicker")
    private WebElement dataPickerInput;


    public void shouldClickInDataPickerInput() {
        click(dataPickerInput);
    }

    public void shouldSetData(String data) {
        sendKeys(dataPickerInput,data);
    }

}
