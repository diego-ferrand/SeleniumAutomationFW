package automationFramework.bases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import automationFramework.pageObjectsHandler.OpencartPageObjectsHandler;
import automationFramework.pages.Cart;
import automationFramework.pages.Header;
import automationFramework.pages.HomePage;

public class OpencartBaseTest extends BaseTest {

    protected OpencartPageObjectsHandler pageObjectsHandler;
    protected HomePage homePage;
    protected Header headerPage;
    protected Cart cart;

    @BeforeMethod
    public void initialize() {
        pageObjectsHandler = OpencartPageObjectsHandler.getInstance(driver, eyes);
        homePage = pageObjectsHandler.getHomePage();
        headerPage = pageObjectsHandler.getHeaderPage();
        cart = pageObjectsHandler.getCart();
    }

    @AfterMethod
    public void dispose() {
        OpencartPageObjectsHandler.setInstanceNull();
    }
}
