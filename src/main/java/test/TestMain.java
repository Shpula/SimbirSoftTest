package test;

import org.junit.jupiter.api.Test;

public class TestMain extends TestBase {

    @Test
    public void firstCase () { //checking operations with integers
        mainPage.goToUrl();
        mainPage.enteringWordInGoogleSearch();
        mainPage.pressSearchButtonInGooglePage();
        calcPage.calculateExpressionFirstCase();
        calcPage.checkExpectedResultFirstCase();
    }

    @Test
    public void secondCase () { //Checking division by zero
        mainPage.goToUrl();
        mainPage.enteringWordInGoogleSearch();
        mainPage.pressSearchButtonInGooglePage();
        calcPage.calculateExpressionSecondCase();
        calcPage.checkExpectedResultSecondCase();
    }

    @Test
    public void thirdCase () { //Checking for an error in the absence of a value
        mainPage.goToUrl();
        mainPage.enteringWordInGoogleSearch();
        mainPage.pressSearchButtonInGooglePage();
        calcPage.calculateExpressionThirdCase();
        calcPage.checkExpectedResultThirdCase();
    }

}
