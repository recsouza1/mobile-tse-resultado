package pages;

import org.openqa.selenium.support.ui.WebDriverWait;
import util.DriverManager;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage {

    private AppiumDriver<MobileElement> driver;
    private WebDriverWait wait;

    public HomePage(AppiumDriver<MobileElement> appiumDriver) {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Selecione uma localidade acima\")")
    public MobileElement selecioneLocalStr;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Resultados\")")
    public MobileElement resultadosTabBtn;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Totalização\")")
    public MobileElement totalizacaoTabBtn;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Favoritos\")")
    public MobileElement favoritosTabBtn;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Informações\")")
    public MobileElement informacoesTabBtn;

    public void selectTabBtn(MobileElement locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.view.View")));
        locator.click();
    }

    public boolean isSelectedTabBtn(MobileElement locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.view.View")));
        return locator.isSelected();
    }
}