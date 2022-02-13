package page;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalcPage extends BasePage{
    public CalcPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[text()='(']")
    private WebElement opening_brace;
    @FindBy(xpath = "//div[text()=')']")
    private WebElement closing_brace;
    @FindBy(xpath = "//div[text()='1']")
    private WebElement num_one;
    @FindBy(xpath = "//div[text()='2']")
    private WebElement num_two;
    @FindBy(xpath = "//div[text()='3']")
    private WebElement num_three;
    @FindBy(xpath = "//div[text()='4']")
    private WebElement num_four;
    @FindBy(xpath = "//div[text()='5']")
    private WebElement num_five;
    @FindBy(xpath = "//div[text()='6']")
    private WebElement num_six;
    @FindBy(xpath = "//div[text()='7']")
    private WebElement num_seven;
    @FindBy(xpath = "//div[text()='8']")
    private WebElement num_eight;
    @FindBy(xpath = "//div[text()='9']")
    private WebElement num_nine;
    @FindBy(xpath = "//div[text()='0']")
    private WebElement num_zero;
    @FindBy(xpath = "//div[text()='+']")
    private WebElement plus;
    @FindBy(xpath = "//div[text()='×']")
    private WebElement multiply;
    @FindBy(xpath = "//div[text()='−']")
    private WebElement minus;
    @FindBy(xpath = "//div[text()='÷']")
    private WebElement divide;
    @FindBy(xpath = "//div[text()='=']")
    private WebElement answer;
    @FindBy(xpath = "//div[text()='sin']")
    private WebElement sin;

    @FindBy(xpath = "//span[@id='cwos']")
    private WebElement result;
    @FindBy(xpath = "//span[@class='vUGUtc']")
    private WebElement function;


    public void calculateExpressionFirstCase() {
        opening_brace.click();
        num_one.click();
        plus.click();
        num_two.click();
        closing_brace.click();
        multiply.click();
        num_three.click();
        minus.click();
        num_four.click();
        num_zero.click();
        divide.click();
        num_five.click();
        answer.click();
    }

    public void checkExpectedResultFirstCase() {
        Assertions.assertEquals("(1 + 2) × 3 - 40 ÷ 5 =", function.getText());
        Assertions.assertEquals("1", result.getText());
    }

    public void calculateExpressionSecondCase() {
        num_six.click();
        divide.click();
        num_zero.click();
        answer.click();
    }

    public void checkExpectedResultSecondCase() {
        Assertions.assertEquals("6 ÷ 0 =", function.getText());
        Assertions.assertEquals("Infinity", result.getText());
    }

    public void calculateExpressionThirdCase() {
        sin.click();
        answer.click();
    }

    public void checkExpectedResultThirdCase() {
        Assertions.assertEquals("sin() =", function.getText());
        Assertions.assertEquals("Error", result.getText());
    }
}
