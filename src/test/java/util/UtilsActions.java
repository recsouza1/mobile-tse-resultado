package util;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class UtilsActions {

    public static boolean waitElementBePresent(MobileElement targetResourceId, int timeLimitInSeconds) {
        try {
            FluentWait wait = new FluentWait(DriverManager.driver).withTimeout(Duration.ofSeconds(timeLimitInSeconds))
                    .pollingEvery(Duration.ofMillis(100))
                    .ignoring(NoSuchElementException.class, StaleElementReferenceException.class)
                    .ignoring(TimeoutException.class);
            wait.until(ExpectedConditions.elementToBeClickable(targetResourceId));
            return true;
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
            return false;
        }
    }

    public void clickOn(MobileElement locator) {
        waitElementBePresent(locator, 5);
        locator.click();
    }
}