package pickDate;

import Base.Page;
import org.assertj.core.api.Assertions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PickDateTest extends Page {


    @Test
    public void shouldSetDateBySendKeys() {

        datePickersPage
                .shouldSetData("08/31/2022")
                .getDataValueFromInput();
        Assert.assertEquals(datePickersPage.getDataValueFromInput(), "08/31/2022");
        System.out.println(datePickersPage.getDataValueFromInput());

    }


    @Test
    public void shouldPickDateByForLoop() {

        datePickersPage
                .shouldClickOnDataPickerInput()
                .changeMonthLoopByForLoop()
                .shouldClickOnTheLastDayOfAugust();
        Assertions.assertThat(datePickersPage.getDataValueFromInput()).isEqualTo("08/31/2022");
        System.out.println(datePickersPage.getDataValueFromInput());
    }


    @Test
    public void shouldPickDateByWhileLoop() {

        datePickersPage
                .shouldClickOnDataPickerInput()
                .changeMontWhileLoop("August")
                .shouldClickOnTheLastDayOfAugust();

        Assertions.assertThat(datePickersPage.getDataValueFromInput()).isEqualTo("08/31/2022");
        System.out.println(datePickersPage.getDataValueFromInput());
    }

    @Test
    public void shouldPickDateAndYearByWhileLoop() {

        datePickersPage
                .shouldClickOnDataPickerInput()
                .changeMontAndYearWhileLoop("August", "2022")
                .shouldClickOnTheLastDayOfAugust();

        Assertions.assertThat(datePickersPage.getDataValueFromInput()).isEqualTo("08/31/2022");
        System.out.println(datePickersPage.getDataValueFromInput());
    }
}
