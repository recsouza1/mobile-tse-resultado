package pages;

import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import util.UtilsActions;

public class HomePage extends UtilsActions {

    private AppiumDriver<MobileElement> driver;
    private WebDriverWait wait;

    public HomePage(AppiumDriver<MobileElement> appiumDriver) {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Selecione uma localidade acima\")")
    public MobileElement selecioneLocalStr;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Resultados\")")
//    @AndroidFindBy(id = "tab-button-resultados")
    public MobileElement resultadosTabBtn;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Totalização\")")
    public MobileElement totalizacaoTabBtn;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Favoritos\")")
    public MobileElement favoritosTabBtn;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Informações\")")
    public MobileElement informacoesTabBtn;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Comece a explorar\")")
    public MobileElement comeceExplorarTabBtn;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"O app Resultados\")")
    public MobileElement descricaoAppStr;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Eleições 2020\")")
    public MobileElement topSelectStr;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"20/12/2020\")")
    public MobileElement searchResult;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"JOSIEL\")")
    public MobileElement candidateJosiel;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Favoritar\")")
    public MobileElement favoritarBtn;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Favorito\")")
    public MobileElement desfavoritarBtn;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Fechar\")")
    public MobileElement closeButton;

    public void selectTabBtn(String option) {
        if (option.equals("resultadosTabBtn")) {
            clickOn(resultadosTabBtn);
        } else if (option.equals("totalizacaoTabBtn")) {
           clickOn(totalizacaoTabBtn);
        } else if (option.equals("favoritosTabBtn")) {
            clickOn(favoritosTabBtn);
        } else if (option.equals("informacoesTabBtn")) {
            clickOn(informacoesTabBtn);
        }
    }

    public boolean isSelectedTabBtn(String option) {
        boolean result = false;

        if (option.equals("resultadosTabBtn")) {
            result = selecioneLocalStr.isDisplayed();
        } else if (option.equals("totalizacaoTabBtn")) {
            result = selecioneLocalStr.isDisplayed();
        } else if (option.equals("favoritosTabBtn")) {
            result = comeceExplorarTabBtn.isDisplayed();
        } else if (option.equals("informacoesTabBtn")) {
            result = descricaoAppStr.isDisplayed();
        }
        return result;
    }

    public void goToCandidatePage() {
        clickOn(topSelectStr);
        clickOn(searchResult);
        clickOn(candidateJosiel);
    }

    public void clickOnFavoriteBtn() {
        clickOn(favoritarBtn);
    }

    public void desfavoritar() {
        clickOn(candidateJosiel);
        clickOn(desfavoritarBtn);
    }

    public void clickOnCloseBtn() {
        clickOn(closeButton);
    }

    public void goToFavoriteTab() {
        clickOn(favoritosTabBtn);
    }

    public void goToTotalTab() {
        clickOn(totalizacaoTabBtn);
    }

    public void favoriteACandidate() {
        goToCandidatePage();
        clickOnFavoriteBtn();
    }
}