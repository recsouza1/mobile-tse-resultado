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
}