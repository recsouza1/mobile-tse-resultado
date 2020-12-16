package stepsDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.DriverManager;
import pages.OnBoardingPage;
import pages.HomePage;

public class OnBoardingSteps {

    private OnBoardingPage onBoardingPage;
    private HomePage homePage;

    @Given("I launch the App for the first time")
    public void launchApp() {
        onBoardingPage = new OnBoardingPage(DriverManager.getDriver());
        homePage = new HomePage(DriverManager.getDriver());
    }

    @When("I complete the setup")
    public void completeSetup() {
        onBoardingPage.completeSetup();
    }

    @Then("I reach the home page")
    public void homePageReached() {
        assert homePage.selectPlaceStr.isDisplayed();
    }
}