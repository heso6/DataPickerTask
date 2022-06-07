package dataPicker;

import basePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;


public class DatePickersPage extends BasePage {


    public DatePickersPage(WebDriver driver) {
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


    public DatePickersPage shouldClickOnDataPickerInput() {
        click(dataPickerInput);
        return this;
    }

    public DatePickersPage shouldSetData(String data) {
        sendKeys(dataPickerInput, data);
        return this;
    }

    public DatePickersPage shouldClickNextMonthButton() {
        click(nextMonthButton);
        return this;
    }

    public String getDataValueFromInput() {
        return dataPickerInput.getAttribute("value");
    }

    public DatePickersPage changeMonthLoopByForLoop() {
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

    public DatePickersPage changeMontWhileLoop(String month) {
        while (!(getMonthValue().equals(month))) {
            shouldClickNextMonthButton();
        }
        return this;
    }

    public DatePickersPage changeMontAndYearWhileLoop(String month, String year) {
        while (!(getMonthValue().equals(month) && (getYearValue().equals(year)))) {
            shouldClickNextMonthButton();
        }
        return this;
    }

    public DatePickersPage shouldClickOnTheLastDayOfAugust() {
        click(lastDayOfAugust);
        return this;
    }


}
