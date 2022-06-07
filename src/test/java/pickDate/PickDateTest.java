package pickDate;

import Base.Page;
import org.assertj.core.api.Assertions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PickDateTest extends Page {


    @Test
    public void shouldSetDataBySendKeys() {

        dataPickersPage
                .shouldSetData("08/31/2022")
                .getDataValueFromInput();
        Assert.assertEquals(dataPickersPage.getDataValueFromInput(), "08/31/2022");
        System.out.println(dataPickersPage.getDataValueFromInput());

    }


    @Test
    public void shouldPickDataByForLoopTableDataPicker() {

        dataPickersPage
                .shouldClickOnDataPickerInput()
                .changeMonthLoopByForLoop()
                .shouldClickOnTheLastDayOfAugust();
        Assertions.assertThat(dataPickersPage.getDataValueFromInput()).isEqualTo("08/31/2022");
        System.out.println(dataPickersPage.getDataValueFromInput());
    }


    @Test
    public void shouldPickDataByWhileLoopTableDataPicker() {

        dataPickersPage
                .shouldClickOnDataPickerInput()
                .changeMontWhileLoop("August")
                .shouldClickOnTheLastDayOfAugust();

        Assertions.assertThat(dataPickersPage.getDataValueFromInput()).isEqualTo("08/31/2022");
        System.out.println(dataPickersPage.getDataValueFromInput());
    }

    @Test
    public void shouldPickDataAndYearByWhileLoopTableDataPicker() {

        dataPickersPage
                .shouldClickOnDataPickerInput()
                .changeMontAndYearWhileLoop("August", "2022")
                .shouldClickOnTheLastDayOfAugust();

        Assertions.assertThat(dataPickersPage.getDataValueFromInput()).isEqualTo("08/31/2022");
        System.out.println(dataPickersPage.getDataValueFromInput());
    }
}
