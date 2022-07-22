package tests.petCity;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Home extends BaseTest {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        pages.petCity.Home.open();
        pages.petCity.Home.closeCookiesPopUp();
    }
    @Test
    public void testSearchBoxWithInvalidData(){
        String testData = "tokioNera";
        String expectedMessage ="Negalime rasti prekių atitinkančių jūsų pasirinkimą.";
        String actualMessage;

        pages.petCity.Home.enterProductName(testData);
        pages.petCity.Home.clickSearchButton();
        actualMessage = pages.petCity.Home.readMessage();

        Assert.assertEquals(actualMessage, expectedMessage);
    }
    @Test
    public void testSearchBoxWithValidData(){
        String testData = "Encore Mackerel";
        boolean isElementExist;
        pages.petCity.Home.enterProductName(testData);
        pages.petCity.Home.clickSearchButton();
         isElementExist = pages.petCity.Home.checkElementExistence();

         Assert.assertTrue(isElementExist);
    }
    @Test
    public void testSelectProductCategoryFromDropdownMenu(){
        String expectedurl = "https://www.petcity.lt/e-parduotuve/kates/kraikas-ir-tualetai/tualetai";
        String actualUrl;
        pages.petCity.Home.chooseCategoryInShop();
        actualUrl = pages.petCity.Home.checkCurrentUrl();

        Assert.assertEquals(actualUrl,expectedurl);
    }
}
