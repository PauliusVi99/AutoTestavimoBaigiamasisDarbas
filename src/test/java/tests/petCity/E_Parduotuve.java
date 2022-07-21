package tests.petCity;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class E_Parduotuve extends BaseTest {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        pages.petCity.E_Parduotuve.open();
        pages.petCity.E_Parduotuve.closeCookiesPopUp();
    }
    @Test
    public void testAddProductToCart(int quantity, int position){
        int expectedQuantity = quantity;
        int actualQuantity;
        pages.petCity.E_Parduotuve.chooseQuantityOfProduct(quantity);
        pages.petCity.E_Parduotuve.clickAddProductButtonByPosition(position);
        actualQuantity = pages.petCity.E_Parduotuve.checkQuantityInCart();

        Assert.assertTrue(actualQuantity == expectedQuantity);

    }
}
