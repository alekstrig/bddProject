package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MainPage extends BasePage{


    @FindBy(xpath = "//input[@type ='email']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@value = 'Subscribe']")
    private WebElement subScribeButton;

    // @FindBy(xpath = "//form[@method = 'post']//p[@class]")
    // private WebElement checkEmailField;

    @FindBy(xpath = "//button[@data-toggle = 'dropdown']")
    private WebElement dropDownLanguages;

    @FindBy(xpath = "//a[contains(@href, 'show')]")
    private List<WebElement> listOfLanguages;

    @FindBy(xpath = "//span[@class = 'hidden-sm-down' and text() = 'Sign in']")
    private WebElement signInButton;

    @FindBy(xpath = "//a/span[@class ='hidden-sm-down']")
    private WebElement accauntName;

    @FindBy(xpath = "//a[contains(@href,'clothes')]")
    private WebElement categoryClothes;


    public MainPage() {
        PageFactory.initElements(getDriver(), this); }

    public void enterEmailField(String email) throws InterruptedException {

        scrollToElementWithJS(emailField);
        emailField.sendKeys(email);
    }

    public void clickOnSubScribeButton() throws InterruptedException {
        waitUntilClickable( subScribeButton, 5)
                .click();

    }

    public boolean  checkInvalidEmail() {

        boolean actualResult = subscribeInput(emailField);
                return false;


    }

    public void clickOnDropDownLanguages() {
        dropDownLanguages.click();

    }

    public boolean getListOfLanguages() {
        List<WebElement> countLanguage = listOfLanguages;

        for (WebElement sizeOfList : countLanguage) {
            if (sizeOfList.getText().equals("Українська")) {
                return true;
            }
        }


        return false;
    }

    public boolean getNumberOfLanguages() {
        List<WebElement> countLanguage = listOfLanguages;

        //for (WebElement sizeOfList : countLanguage) {
        if (countLanguage.size()>= 44) {
            return true;
        }

        return false;
    }


    public SignInPage clickOnSignInButton() {
        signInButton.click();
        return new SignInPage();
    }

    public String getTextFromAccaunt() throws InterruptedException {
        Thread.sleep(3000);
        return accauntName.getText();

    }

    public pages.MainPage howerToClothesCategoty() throws InterruptedException {
        hoverToElement(categoryClothes);
        return this;
    }


  /*  public List<ListOfLanguage> getListOfLanguages() {
        ListOfLanguage language = new ListOfLanguage();
        List<ListOfLanguage> languages = language.getLanguage(listOfLanguages);
        return languages;
    }*/



    /*public int checkListOfLanguages() {
        for (WebElement sizeOfList : countLanguage) {
            if (sizeOfList.getSize()>= 44) {

            }

        }
    }*/



    //List<WebElement> allSmile = driver.findElements(By.xpath("//tbody/*//i[@class ='media-photo fa fa-smile-o fa-3x']"));








}

