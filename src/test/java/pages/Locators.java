package pages;

import org.openqa.selenium.By;

public class Locators {
    public static class petCity {
        public static class Home {
            public static By formCookiesPopUp = (By.xpath("//h2[text() = 'Informacija apie slapukus']"));
            public static By buttonCloseCookiesPopUp =
                    (By.xpath("//button[@class='Button-button-0-2-1 button layout-default intent-primary']"));
            public static By inputProductsSearchBar = (By.xpath
                    ("//input[@placeholder='Ieškoti visoje parduotuvėje čia...']"
                    ));
            public static By buttonForProductsSearch =
                    By.xpath("//button[@class='icon search__submit']");
            public static By fieldInvalidProductSearchMessage = (By.xpath("//div[@class='message info empty empty-notice']"));
            public static By divProductLayoutBox = (By.xpath("//div[@class='layout-products__container']"));
            public static By linkToE_Parduotuve =
                    By.xpath("//*[@id=\"main-header\"]/div[2]/div[2]/div/div[1]/div/nav/ul/li[1]");
            public static By linkToKates = By.xpath("//*[@id=\"main-header\"]/div[3]/div/div/div/div/div/div/ul/li[2]");
            public static By linkToKaciuTualetai = By.xpath("//*[@id=\"submenu\"]/li[2]/ul/li[2]/a");
        }

        public static class Login {

            public static By inputAccountEmail = By.xpath("//input[@name='login[username]']");
            public static By inputAccountPassword = By.xpath("//input[@name='login[password]']");
            public static By buttonForLogin = By.xpath("/html/body/div[5]/div[5]/div[1]/div/section/div/div/div[1]/div[2]/div/form/ul[2]/li[1]");
            public static By fieldOfMessageForLogin = By.xpath("(//span[text() = 'Prisijungti'])[1]");
        }

        public static class E_Parduotuve {

            public static By spanQuantityOfProductsInCart = By.xpath("(//span[@class='products'])[1]");

            public static By buttonAddOneProductByPosition(String position) {
                return By.xpath(String.format("(//button[text()='Daugiau'])[%s]", position));
            }

            public static By buttonProductsAddByPosition(String position) {
                return By.xpath(String.format("(//button[@class='button button-primary'])[%s]", position));
            }
        }
    }
}
