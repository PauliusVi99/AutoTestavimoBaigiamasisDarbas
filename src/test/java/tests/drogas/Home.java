package tests.drogas;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Home extends BaseTest {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        pages.drogas.Home.open();
        pages.drogas.Home.closeCookiesPopUp();
    }
    @Test
    public void testSearchBoxWithInvalidData(){
        String testData = "tokioNera";
        String expectedMessage =
                String.format("Apgailestaujame, tačiau sistema nerado jokių paieškos rezultatų su \"%s\"",testData);
        String actualMessage;

        pages.drogas.Home.enterInvalidProduct(testData);
        pages.drogas.Home.clickSearchButton();
        actualMessage = pages.drogas.Home.readMessage();

        Assert.assertEquals(actualMessage, expectedMessage);

    }
}
