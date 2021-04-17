package steps;


import pages.MainPage;

public class MainPageSteps {

    MainPage mainPage = new MainPage();

    public void checkSubscribeWithInvalidEmail(String email) throws InterruptedException {
        mainPage.enterEmailField(email);
    }
    public void subscribeButtonClick() throws InterruptedException {
        mainPage.clickOnSubScribeButton();
    }

    public boolean verify() throws InterruptedException {
        mainPage.checkInvalidEmail();
        return true;
    }





}
