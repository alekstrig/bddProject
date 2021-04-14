package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends BasePage {



    @FindBy(xpath = "//input[@name ='id_gender' and @value = '1']")
    private WebElement genderMale;

    @FindBy(xpath = "//input[@name ='firstname']")
    private WebElement firstNameField;

    @FindBy(xpath = "//input[@name ='lastname']")
    private WebElement lastNameField;

    @FindBy(xpath = "//input[@class ='form-control' and@name ='email']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@name ='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@name ='birthday']")
    private WebElement birthDayField;

    @FindBy(xpath = "//input[@name ='customer_privacy']")
    private WebElement customerPrivacy;

    @FindBy(xpath = "//input[@name ='psgdpr']")
    private WebElement privacyPolicy;

    @FindBy(xpath = "//footer/button[@type ='submit']")
    private WebElement submitButton;

    @FindBy(xpath = "//li[contains(@class,'alert')]")
    private WebElement invalidFormat;


    public RegisterPage() {
        PageFactory.initElements(getDriver(),this);
    }

    public RegisterPage selectGender() {
        genderMale.click();
        return this;
    }

    public RegisterPage setFirstName(String myFirstName) {
        firstNameField.sendKeys(myFirstName);
        return this;
    }
    public RegisterPage setLastName(String myLastName) {
        lastNameField.sendKeys(myLastName);
        return this;

    }
    public RegisterPage setEmail(String email) {
        emailField.sendKeys(email);
        return this;
    }

    public RegisterPage setPassword(String password) {
        passwordField.sendKeys(password);
        return this;
    }

    public RegisterPage setBirthday(String birthday) {
        birthDayField.sendKeys(birthday);
        return this;
    }

    public RegisterPage setCostumerPrivacy() {
        customerPrivacy.click();
        return this;
    }

    public RegisterPage setPrivacyPolicy() {
        privacyPolicy.click();
        return this;
    }

    public MainPage clickSubmitButton() {
        submitButton.click();
        return new MainPage();
    }

    public String checkColorOfBorder() {
        return firstNameField.getCssValue("outline-color");
    }

    public String checkInvalidFormat() {
        return invalidFormat.getText();
    }

    public RegisterPage clickOnSignInButtonWithInvalid() {
        submitButton.click();
        return this;
    }






}
