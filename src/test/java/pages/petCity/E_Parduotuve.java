package pages.petCity;

import pages.Common;
import pages.Locators;

public class E_Parduotuve {
    public static void open() {
        pages.Common.openUrl("https://www.petcity.lt/e-parduotuve");
    }

    public static void closeCookiesPopUp() {
        Common.waitForElementToBeVisible(Locators.petCity.Home.formCookiesPopUp);
        Common.clickElementByAction(Locators.petCity.Home.buttonCloseCookiesPopUp);
    }

    public static void chooseQuantityOfProduct(String position, String quantity) {
        Common.clickElementByActionCertainNumberOfTimes(Locators.petCity.E_Parduotuve.buttonAddOneProductByPosition(position), quantity);
    }

    public static void clickAddProductButtonByPosition(String position) {
        Common.waitForElementToBeVisible(Locators.petCity.E_Parduotuve.buttonProductsAddByPosition(position));
        Common.clickElementByAction(Locators.petCity.E_Parduotuve.buttonProductsAddByPosition(position));
    }

    public static String checkQuantityInCart() {
        return Common.getElementText(Locators.petCity.E_Parduotuve.spanQuantityOfProductsInCart);
    }
}
