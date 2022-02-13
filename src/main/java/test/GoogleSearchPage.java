package test;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;

public class GoogleSearchPage extends TestBase {

    @Test
    public void calc_first_case () {
        mainPage.goTo();
        mainPage.entering_word();
        mainPage.press_search_button();
        calcPage.calculate_function_first_case();
        calcPage.expected_result_first_case();
    }

    @Test
    public void calc_second_case () {
        mainPage.goTo();
        mainPage.entering_word();
        mainPage.press_search_button();
        calcPage.calculate_function_second_case();
        calcPage.expected_result_second_case();
    }

}
