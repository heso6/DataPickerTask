package dataPicker;

import basePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;


public class DataPickersPage extends BasePage {


    public DataPickersPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = "#datepicker")
    private WebElement dataPickerInput;

    @FindBy(css = ".ui-icon.ui-icon-circle-triangle-e")
    private WebElement nextMonthButton;

    @FindBy(xpath = "//span[@class='ui-datepicker-month']")
    private WebElement monthValue;

    @FindBy(css = ".ui-datepicker-year")
    private WebElement yearValue;

    //Selektor 31 Sierpnia.
    @FindBy(xpath = "//tbody//tr//td[@data-month='7']//a[.='31']")
    private WebElement lastDayOfAugust;


    public DataPickersPage shouldClickOnDataPickerInput() {
        click(dataPickerInput);
        return this;
    }

    public DataPickersPage shouldSetData(String data) {
        sendKeys(dataPickerInput, data);
        return this;
    }

    public DataPickersPage shouldClickNextMonthButton() {
        click(nextMonthButton);
        return this;
    }

    public String getDataValueFromInput() {
        return dataPickerInput.getAttribute("value");
    }

    public DataPickersPage changeMonthLoopByForLoop() {
        for (int i = 0; i <= 1; i++) {
            shouldClickNextMonthButton();
        }
        return this;
    }

    public String getMonthValue() {
        return monthValue.getText();
    }

    public String getYearValue() {
        return yearValue.getText();
    }

    public DataPickersPage changeMontWhileLoop(String month) {
        while (!(getMonthValue().equals(month))) {
            shouldClickNextMonthButton();
        }
        return this;
    }

    public DataPickersPage changeMontAndYearWhileLoop(String month, String year) {
        while (!(getMonthValue().equals(month) && (getYearValue().equals(year)))) {
            shouldClickNextMonthButton();
        }
        return this;
    }

    public DataPickersPage shouldClickOnTheLastDayOfAugust() {
        click(lastDayOfAugust);
        return this;
    }


}
