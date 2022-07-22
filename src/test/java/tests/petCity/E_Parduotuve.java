package tests.petCity;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tests.BaseTest;

public class E_Parduotuve extends BaseTest {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        pages.petCity.E_Parduotuve.open();
        pages.petCity.E_Parduotuve.closeCookiesPopUp();
        pages.petCity.E_Parduotuve.makeFullScreen();
    }

    @DataProvider(name = "addProductToCart", parallel = true)
    public Object[][] addProductToCartDataProvider() {
        return new Object[][]{
                {"1", "5"},
                {"2", "1"},
                {"3", "3"},
        };
    }

    @Test(dataProvider = "addProductToCart", threadPoolSize = 3)
    public void testAddProductToCart(String position, String quantity) {
        String expectedQuantity = quantity;
        String actualQuantity;

        pages.petCity.E_Parduotuve.chooseQuantityOfProduct(position, quantity);
        pages.petCity.E_Parduotuve.clickAddProductButtonByPosition(position);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actualQuantity = pages.petCity.E_Parduotuve.checkQuantityInCart();

        Assert.assertEquals(actualQuantity, expectedQuantity);
    }
}
