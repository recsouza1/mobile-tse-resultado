package stepsDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import util.DriverManager;
import pages.OnBoardingPage;
import pages.HomePage;

public class HomeSteps {

    private OnBoardingPage onBoardingPage = new OnBoardingPage(DriverManager.driver);
    private HomePage homePage = new HomePage(DriverManager.driver);

    @Given("I am at home screen")
    public void go_to_home_screen() {
        onBoardingPage.completeOnBoarding();
    }

    @When("I select {string}")
    public void i_select_tab_icon_btn(String option) {
        homePage.selectTabBtn(option);
    }

    @Then("The {string} should be selected")
    public void homePageReached(String option) {
        Assert.assertTrue("Icon is not selected!", homePage.isSelectedTabBtn(option));
    }
}