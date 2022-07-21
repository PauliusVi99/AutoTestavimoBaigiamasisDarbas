package pages.drogas;

import org.openqa.selenium.By;
import pages.Common;
import pages.Locators;

public class Home {
    public static void open() {
        pages.Common.openUrl("https://www.drogas.lt/");
    }

    public static void closeCookiesPopUp() {
        Common.waitForElementToBeVisible(Locators.Drogas.Home.formCookiesPopUp);
        Common.clickElementByAction(Locators.Drogas.Home.buttonCloseCookiesPopUp);
    }

    public static void enterInvalidProduct(String testData) {
        Common.sendKeysToElement(Locators.Drogas.Home.inputProductsSearchBar, testData);
    }

    public static void clickSearchButton() {
        Common.clickElementByAction(Locators.Drogas.Home.buttonForProductsSearch);
    }

    public static String readMessage() {
        return Common.getElementText(Locators.Drogas.Home.fieldInvalidProductSearchMessage);
    }
}
