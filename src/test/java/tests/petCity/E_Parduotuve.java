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
    public void testAddProductToCart(){
        String expectedQuantity = "11";
        String actualQuantity;
        pages.petCity.E_Parduotuve.chooseQuantityOfProduct(1,"1");
        pages.petCity.E_Parduotuve.clickAddProductButtonByPosition("1");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actualQuantity = pages.petCity.E_Parduotuve.checkQuantityInCart();

        //Assert.assertTrue(actualQuantity.equals(expectedQuantity));
        Assert.assertEquals(actualQuantity,expectedQuantity);

    }
}
