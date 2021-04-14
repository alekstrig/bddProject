package steps;

import org.junit.Assert;
import pages.MainPage;

public class MainPageSteps {

    MainPage mainPage = new MainPage();

    public void checkSubscribeWithInvalidEmail(String email) throws InterruptedException {
        mainPage.enterEmailField(email);
    }
    public void subscribeButtonClick() throws InterruptedException {
        mainPage.clickOnSubScribeButton();
    }

    public void verify() throws InterruptedException {
        mainPage.checkInvalidEmail();

    }





}
