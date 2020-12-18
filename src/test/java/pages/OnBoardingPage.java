package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.DriverManager;
import util.UtilsActions;

public class OnBoardingPage extends UtilsActions {

    private AppiumDriver<MobileElement> driver;
    private WebDriverWait wait;

    public OnBoardingPage(AppiumDriver<MobileElement> appiumDriver) {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
        this.driver = appiumDriver;
        wait = DriverManager.getWait();
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Próximo\")")
    public MobileElement proximoBtn;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Entendi\")")
    public MobileElement entendiBtn;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.Button\")")
    public MobileElement liAceitoBtn;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Agora não\")")
    public MobileElement agoraNaoBtn;

    public void scrollToEnd() {
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).flingToEnd(10)"));
    }

    public void completeOnBoarding() {
        clickOn(proximoBtn);
        clickOn(entendiBtn);
        scrollToEnd();
        clickOn(liAceitoBtn);
        clickOn(agoraNaoBtn);
    }
}