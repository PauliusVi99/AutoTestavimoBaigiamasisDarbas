package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Constants;
import utils.Driver;

public class Common {
    public static void openUrl(String url) {
        Driver.getDriver().get(url);
    }

    public static WebElement getElement(By locator) {
        return Driver.getDriver().findElement(locator);
    }

    public static void waitForElementToBeVisible(By locator) {
        WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(), Constants.DURATION_TIMEOUT);
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void waitForElementToBeClickable(By locator) {
        WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(), Constants.DURATION_TIMEOUT);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static void clickElementByAction(By locator) {
        WebElement element = getElement(locator);

        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(element);
        action.click();
        action.perform();
    }

    public static void sendKeysToElement(By locator, String keys) {
        getElement(locator).sendKeys(keys);
    }

    public static String getElementText(By locator) {
        return getElement(locator).getText();
    }

    public static boolean checkElementExistence(By locator) {
        boolean isElementExist;
        try {
            getElement(locator);
            isElementExist = true;
        } catch (NoSuchElementException e) {
            isElementExist = false;
        }
        return isElementExist;
    }

    public static void clickElementByActionCertainNumberOfTimes(By locator, String times) {
        WebElement element = getElement(locator);
        int timesToInteger = Integer.parseInt(times) - 1;
        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(element);
        for (int i = 0; i < timesToInteger; i++) {
            waitForElementToBeClickable(locator);
            action.click();
            action.perform();
        }
    }

    public static String getCurrentUrl() {
        return Driver.getDriver().getCurrentUrl();
    }

    public static void makeFullScreen() {
        Driver.getDriver().manage().window().fullscreen();
    }
}
