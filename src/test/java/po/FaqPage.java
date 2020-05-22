package test.java.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class FaqPage {
    private final WebDriver driver;
    private final WebDriverWait wait;
    private final By qaLinks = By.cssSelector("[name='slider-block-active']");

    public FaqPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(this.driver, 10);
    }

    public List<WebElement> getQuestions() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(qaLinks));
        return driver.findElements(qaLinks);
    }
}
