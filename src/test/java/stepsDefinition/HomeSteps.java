package stepsDefinition;

import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.DriverManager;
import pages.OnBoardingPage;
import pages.HomePage;

public class HomeSteps {

    private OnBoardingPage onBoardingPage = new OnBoardingPage(DriverManager.getDriver());
    private HomePage homePage = new HomePage(DriverManager.getDriver());

    @Given("I am at home screen")
    public void go_to_home_screen() {
        onBoardingPage.completeOnBoarding();
    }

    @When("I select {string}")
    public void i_select_tab_icon_btn(String locator) {
        if (locator.equals("resultadosTabBtn")) {
            homePage.selectTabBtn(homePage.resultadosTabBtn);
        } else if (locator.equals("totalizacaoTabBtn")) {
            homePage.selectTabBtn(homePage.totalizacaoTabBtn);
        } else if (locator.equals("favoritosTabBtn")) {
            homePage.selectTabBtn(homePage.favoritosTabBtn);
        } else if (locator.equals("favoritosTabBtn")) {
            homePage.selectTabBtn(homePage.informacoesTabBtn);
        }
    }

    @Then("The {string} should be selected")
    public void homePageReached(String locator) {
        if (locator.equals("resultadosTabBtn")) {
            assert homePage.isSelectedTabBtn(homePage.resultadosTabBtn);
        } else if (locator.equals("totalizacaoTabBtn")) {
            assert homePage.isSelectedTabBtn(homePage.totalizacaoTabBtn);
        } else if (locator.equals("favoritosTabBtn")) {
            assert homePage.isSelectedTabBtn(homePage.favoritosTabBtn);
        } else if (locator.equals("favoritosTabBtn")) {
            assert homePage.isSelectedTabBtn(homePage.informacoesTabBtn);
        }
    }
}