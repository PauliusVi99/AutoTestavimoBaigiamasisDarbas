package pages.petCity;

import pages.Common;
import pages.Locators;
import utils.Constants;
import utils.Driver;

public class Home {
    public static void open() {
        pages.Common.openUrl("https://www.petcity.lt/");
    }

    public static void closeCookiesPopUp() {
        Common.waitForElementToBeVisible(Locators.petCity.Home.formCookiesPopUp);
        Common.clickElementByAction(Locators.petCity.Home.buttonCloseCookiesPopUp);
    }

    public static void enterProductName(String testData) {
        Common.sendKeysToElement(Locators.petCity.Home.inputProductsSearchBar, testData);
    }

    public static void clickSearchButton() {
        Common.clickElementByAction(Locators.petCity.Home.buttonForProductsSearch);
    }

    public static String readMessage() {
        return Common.getElementText(Locators.petCity.Home.fieldInvalidProductSearchMessage);
    }

    public static boolean checkElementExistence(){
        return Common.checkElementExistence(Locators.petCity.Home.divProductLayoutBox);
    }

    public static void chooseCategoryInShop() {
        Common.clickElementByAction(Locators.petCity.Home.linkToE_Parduotuve);
        Common.clickElementByAction(Locators.petCity.Home.linkToKates);
        Common.clickElementByAction(Locators.petCity.Home.linkToKaciuTualetai);
    }

    public static String checkCurrentUrl() {
        return Common.getCurrentUrl();
    }
}
