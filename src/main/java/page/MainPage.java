package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage{
    public MainPage(WebDriver driver) {
        super(driver);
    }

    final String SITE_URL = "https://www.google.com/";

    @FindBy(xpath = "//input[@name='q']")
    private WebElement search;
    @FindBy(xpath = "//input[@name='btnK']")
    private WebElement press_search;

    public void goToUrl() {
        driver.get(SITE_URL);
    }

    public void enteringWordInGoogleSearch() {
        search.sendKeys("Калькулятор");
    }

    public void pressSearchButtonInGooglePage() {
        waitVisability(By.xpath("//input[@name='btnK']"));
        press_search.click();
    }
}
