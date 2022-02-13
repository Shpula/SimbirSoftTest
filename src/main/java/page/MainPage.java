package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends BasePage{
    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void goTo() {
        driver.get("https://www.google.com/");
    }

    public void entering_word() {
        WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
        search.sendKeys("Калькулятор");
    }

    public void press_search_button() {
        waitVisability(By.xpath("//input[@name='btnK']"));
        WebElement press_search = driver.findElement(By.xpath("//input[@name='btnK']"));
        press_search.click();
    }
}
