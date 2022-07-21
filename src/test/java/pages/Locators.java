package pages;

import org.openqa.selenium.By;

public class Locators   {
    public static class Drogas{
        public static class Home {
            public static By formCookiesPopUp =(By.xpath("//*[@id=\"onetrust-group-container\"]"));
            public static By buttonCloseCookiesPopUp = (By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]"));
        }
    }
}
