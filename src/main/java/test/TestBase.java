package test;

import com.sun.tools.javac.Main;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import page.CalcPage;
import page.MainPage;

import java.util.concurrent.TimeUnit;

public class TestBase {
    String SITE_URL = "https://www.google.com/";
    WebDriver driver;
    public CalcPage calcPage;
    public MainPage mainPage;

    @BeforeEach
    public void start() {
        System.setProperty("webdriver.chrome.driver","C:\\tools\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(SITE_URL);
        mainPage = PageFactory.initElements(driver, MainPage.class);
        calcPage = PageFactory.initElements(driver, CalcPage.class);
    }

    @AfterEach
    public void finish() {
        driver.quit();
    }
}
