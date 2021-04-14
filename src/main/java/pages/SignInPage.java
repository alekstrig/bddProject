package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends BasePage {

    @FindBy(xpath = "//a[contains(text(),'No account?')]")
    private WebElement registerButton;


   public SignInPage() {
       PageFactory.initElements(getDriver(),this);
   }

    public RegisterPage clickOnRegisterButton() {
       registerButton.click();
       return new RegisterPage();
    }
}
