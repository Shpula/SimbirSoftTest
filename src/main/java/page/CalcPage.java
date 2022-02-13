package page;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CalcPage extends BasePage{
    public CalcPage(WebDriver driver) {
        super(driver);
    }

    public void calculate_function_first_case() {
        WebElement opening_brace = driver.findElement(By.xpath("//div[text()='(']"));
        WebElement closing_brace = driver.findElement(By.xpath("//div[text()=')']"));
        WebElement num_one = driver.findElement(By.xpath("//div[text()='1']"));
        WebElement num_two = driver.findElement(By.xpath("//div[text()='2']"));
        WebElement num_three = driver.findElement(By.xpath("//div[text()='3']"));
        WebElement num_four = driver.findElement(By.xpath("//div[text()='4']"));
        WebElement num_five = driver.findElement(By.xpath("//div[text()='5']"));
        WebElement num_six = driver.findElement(By.xpath("//div[text()='6']"));
        WebElement num_seven = driver.findElement(By.xpath("//div[text()='7']"));
        WebElement num_eight = driver.findElement(By.xpath("//div[text()='8']"));
        WebElement num_nine = driver.findElement(By.xpath("//div[text()='9']"));
        WebElement num_zero = driver.findElement(By.xpath("//div[text()='0']"));
        WebElement plus = driver.findElement(By.xpath("//div[text()='+']"));
        WebElement multiply = driver.findElement(By.xpath("//div[text()='×']"));
        WebElement minus = driver.findElement(By.xpath("//div[text()='−']"));
        WebElement divide = driver.findElement(By.xpath("//div[text()='÷']"));
        WebElement equally = driver.findElement(By.xpath("//div[text()='=']"));
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
        equally.click();
    }

    public void expected_result_first_case() {
        WebElement result = driver.findElement(By.xpath("//span[@id='cwos']"));
        WebElement function = driver.findElement(By.xpath("//span[@class='vUGUtc']"));
        Assertions.assertEquals("(1 + 2) × 3 - 40 ÷ 5 =", function.getText());
        Assertions.assertEquals("1", result.getText());
    }

    public void calculate_function_second_case() {
        WebElement opening_brace = driver.findElement(By.xpath("//div[text()='(']"));
        WebElement closing_brace = driver.findElement(By.xpath("//div[text()=')']"));
        WebElement num_one = driver.findElement(By.xpath("//div[text()='1']"));
        WebElement num_two = driver.findElement(By.xpath("//div[text()='2']"));
        WebElement num_three = driver.findElement(By.xpath("//div[text()='3']"));
        WebElement num_four = driver.findElement(By.xpath("//div[text()='4']"));
        WebElement num_five = driver.findElement(By.xpath("//div[text()='5']"));
        WebElement num_six = driver.findElement(By.xpath("//div[text()='6']"));
        WebElement num_seven = driver.findElement(By.xpath("//div[text()='7']"));
        WebElement num_eight = driver.findElement(By.xpath("//div[text()='8']"));
        WebElement num_nine = driver.findElement(By.xpath("//div[text()='9']"));
        WebElement num_zero = driver.findElement(By.xpath("//div[text()='0']"));
        WebElement plus = driver.findElement(By.xpath("//div[text()='+']"));
        WebElement multiply = driver.findElement(By.xpath("//div[text()='×']"));
        WebElement minus = driver.findElement(By.xpath("//div[text()='−']"));
        WebElement divide = driver.findElement(By.xpath("//div[text()='÷']"));
        WebElement equally = driver.findElement(By.xpath("//div[text()='=']"));
        num_six.click();
        divide.click();
        num_zero.click();
        equally.click();

    }

    public void expected_result_second_case() {
        WebElement result = driver.findElement(By.xpath("//span[@id='cwos']"));
        WebElement function = driver.findElement(By.xpath("//span[@class='vUGUtc']"));
        Assertions.assertEquals("6 ÷ 0 =", function.getText());
        Assertions.assertEquals("Infinity", result.getText());
    }
}
