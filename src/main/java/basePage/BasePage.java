package basePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        actions = new Actions(driver);
    }

    public WebDriver driver;
    public WebDriverWait wait;
    public Actions actions;


    public void sendKeys(WebElement element, String text) {
        System.out.println("Typing: " + text);
        element.sendKeys(text);
    }

    public void click(WebElement element) {
        System.out.println("Clicking: " + element.getText());
        element.click();
    }


}
