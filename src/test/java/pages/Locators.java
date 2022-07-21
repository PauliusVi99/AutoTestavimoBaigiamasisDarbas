package pages;

import org.openqa.selenium.By;

public class Locators {
    public static class Drogas {
        public static class Home {
            public static By formCookiesPopUp = (By.xpath("//*[@id=\"onetrust-group-container\"]"));
            public static By buttonCloseCookiesPopUp = (By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]"));
            public static By inputProductsSearchBar = (By.xpath
                    ("(//input[@class='js-search-container__input js-search-suggestions__input search-suggestions__input'])[1]"
                    ));
            public static By buttonForProductsSearch =
                    By.xpath("(//button[@class='search-container__form-icon btn btn--icon'])[1]");
            public static By fieldInvalidProductSearchMessage = (By.xpath("//h2[@class='text-align']"));
        }
    }
}
