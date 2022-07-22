package pages.petCity;

import pages.Common;
import pages.Locators;

public class Login {

    public static void open() {
        Common.openUrl("https://www.petcity.lt/customer/account/login/referer/aHR0cHM6Ly93d3cucGV0Y2l0eS5sdC9lLXBhcmR1b3R1dmU_Z2NsaWQ9RUFJYUlRb2JDaE1Jc2ZHbTNyT0stUUlWVHVxeUNoMEtPZ0daRUFBWUFTQUFFZ0tJX2ZEX0J3RQ/");
    }

    public static void closeCookiesPopUp() {
        Common.waitForElementToBeVisible(Locators.petCity.Home.formCookiesPopUp);
        Common.clickElementByAction(Locators.petCity.Home.buttonCloseCookiesPopUp);
    }

    public static void enterValidEmail(String testData) {
        Common.clickElementByAction(Locators.petCity.Login.inputAccountEmail);
        Common.sendKeysToElement(Locators.petCity.Login.inputAccountEmail, testData);
    }

    public static void enterValidPassword(String testData) {
        Common.sendKeysToElement(Locators.petCity.Login.inputAccountPassword, testData);
    }

    public static void clickLoginButton() {
        Common.waitForElementToBeVisible(Locators.petCity.Login.buttonForLogin);
        Common.clickElementByAction(Locators.petCity.Login.buttonForLogin);
    }

    public static boolean checkElementExistence() {
        return Common.checkElementExistence(Locators.petCity.Login.fieldOfMessageForLogin);
    }
}
