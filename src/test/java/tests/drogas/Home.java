package tests.drogas;

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
}
