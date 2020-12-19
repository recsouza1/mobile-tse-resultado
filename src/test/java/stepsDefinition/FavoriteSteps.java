package stepsDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.OnBoardingPage;
import util.DriverManager;

public class FavoriteSteps {

    private OnBoardingPage onBoardingPage = new OnBoardingPage(DriverManager.driver);
    private HomePage homePage = new HomePage(DriverManager.driver);

    @Given("I am at a candidate screen")
    public void go_to_candidate_screen() {
        onBoardingPage.completeOnBoarding();
        homePage.goToCandidatePage();
    }

    @Given("There is a candidate as favorite")
    public void there_is_a_candidate_as_favorite() {
        onBoardingPage.completeOnBoarding();
        homePage.favoriteACandidate();
    }

    @When("I favorite a candidate")
    public void favorite_a_candidate() {
        homePage.clickOnFavoriteBtn();
    }

    @When("I go to favorites page")
    public void go_to_favorite_page() {
        homePage.clickOnCloseBtn();
        homePage.goToFavoriteTab();
    }

    @When("I remove the candidate from favorites")
    public void remove_candidate_from_favorite_page() {
        homePage.desfavoritar();
        homePage.clickOnCloseBtn();
    }

    @Then("I see the candidate as favorite")
    public void candidate_as_favorite() {
        Assert.assertTrue("Candidate is not listed in favorites!", homePage.candidateJosiel.isDisplayed());
    }

    @Then("The candidate is no longer displayed on favorites page")
    public void candidate_removed_from_favorite() {
        Assert.assertFalse("Candidate is still listed in favorites!", homePage.candidateJosiel.isDisplayed());
    }
}
