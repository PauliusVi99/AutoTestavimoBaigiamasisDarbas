package tests.petCity;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Login extends BaseTest {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        pages.petCity.Login.open();
        pages.petCity.Login.closeCookiesPopUp();
    }
    @Test
    public void testLoginWithValidData() {
        String accountEmail = "witkus65@gmail.com";
        String accountPassword = "gJz7CLJXmCXftyL";
        boolean isUserGuest;


        pages.petCity.Login.enterValidEmail(accountEmail);
        pages.petCity.Login.enterValidPassword(accountPassword);
        pages.petCity.Login.clickLoginButton();
        isUserGuest = pages.petCity.Login.checkElementExistence();

        Assert.assertFalse(isUserGuest);




    }
    }
