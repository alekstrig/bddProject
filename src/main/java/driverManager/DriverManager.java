package driverManager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

public class DriverManager {

  public static void createDriver() throws InterruptedException {

    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demo.prestashop.com/");
    waitLoadingStarts(driver);
    waitLoadingEnds(driver);
    driver.switchTo().frame("framelive");
    BasePage.setDriver(driver);
  }

  private static void waitLoadingStarts(WebDriver driver) {

    try {
      WebElement waitStartLoading = new WebDriverWait(driver, 10)
              .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='loadingMessage']")));

    } catch (NoSuchElementException e) {
      System.out.println("No any adv appears");
    }
  }
  private static void waitLoadingEnds(WebDriver driver) {
    try {

      Boolean waitEndsLoading = new WebDriverWait(driver, 10)
              .until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@id='loadingMessage']")));


    } catch (NoSuchElementException e) {
      System.out.println("No any adv appears");
    }


  }

  public static void quiteDriver() throws InterruptedException {
    Thread.sleep(3000);
    BasePage.getDriver().quit();
  }

}
