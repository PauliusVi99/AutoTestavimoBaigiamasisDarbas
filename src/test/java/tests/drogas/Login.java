package tests.drogas;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Login extends BaseTest {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        pages.drogas.Login.open();
        pages.drogas.Login.closeCookiesPopUp();
    }
    @Test
    public void testLoginWithValidData() {
        String accountEmail = "witkus65@gmail.com";
        String accountPassword = "gJz7CLJXmCXftyL";
        String expectedUrl = "https://www.drogas.lt/my-account";
        String actualUrl;

        pages.drogas.Login.enterValidEmail();
        pages.drogas.Login.enterValidPassword();
        pages.drogas.Login.clickLoginButton();
        actualUrl = pages.drogas.Login.getCurrentPage();

        Assert.assertEquals(actualUrl, expectedUrl);




    }
    }
