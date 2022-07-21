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

    public static void chooseQuantityOfProduct(int quantity) {
    }

    public static void clickAddProductButtonByPosition(int position) {
    }

    public static int checkQuantityInCart() {
        return 0;
    }
}
