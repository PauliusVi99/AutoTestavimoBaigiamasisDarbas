package pages.drogas;

import pages.Common;
import pages.Locators;

public class Home {
    public static void open(){
pages.Common.openUrl("https://www.drogas.lt/");
    }
    public static void closeCookiesPopUp(){
        Common.waitForElementToBeVisible(Locators.Drogas.Home.formCookiesPopUp);
        Common.clickElementByAction(Locators.Drogas.Home.buttonCloseCookiesPopUp);
    }
}
