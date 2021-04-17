package pages;

import lombok.Getter;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



@Getter
public abstract class BasePage {

    protected  static WebDriver driver;

    public static void setDriver (WebDriver webDriver) {driver = webDriver;}

    public static WebDriver getDriver () {return driver;}



    public void scrollToElementWithJS(WebElement element) throws InterruptedException {
        JavascriptExecutor executor = ((JavascriptExecutor) driver);
        executor.executeScript("arguments[0].scrollIntoView(true);", element);

    }
    protected boolean subscribeInput (WebElement element) {
    JavascriptExecutor js = (JavascriptExecutor)getDriver();
        return (Boolean)js.executeScript("return arguments[0].checkValidity();", element);
    }

    public WebElement waitUntilVisible(WebElement element, int time) {
        return new WebDriverWait(driver, time)
                .until(ExpectedConditions.visibilityOf(element));
    }

    public WebElement waitUntilClickable(WebElement element, int time) {
        return new WebDriverWait(driver, time)
                .until(ExpectedConditions.elementToBeClickable(element));
    }

    protected void hoverToElement (WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
    }






}
