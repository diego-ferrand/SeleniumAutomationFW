package automationFramework.pageObjectsHandler;

import automationFramework.pageObjectsHandler.*;
import automationFramework.handlers.PageObjectsHandler;
import com.applitools.eyes.Eyes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import automationFramework.pages.Cart;
import automationFramework.pages.CartPage;
import automationFramework.pages.Header;
import automationFramework.pages.HomePage;
import automationFramework.pages.LoginPage;
import automationFramework.pages.MyAccountPage;
import automationFramework.pages.ProductPage;
import automationFramework.pages.SearchResultPage;

public class OpencartPageObjectsHandler extends PageObjectsHandler {

    private static OpencartPageObjectsHandler instance = null;

    private HomePage homePage;
    private LoginPage loginPage;
    private MyAccountPage myAccountPage;
    private Header header;
    private Cart cart;
    private SearchResultPage searchResultPage;
    private ProductPage productpage;
    private CartPage cartpage;

    protected OpencartPageObjectsHandler(WebDriver driver, Eyes eyes) {
        super(driver, eyes);
    }

    public static OpencartPageObjectsHandler getInstance(WebDriver driver, Eyes eyes) {
        if (instance == null) {
            instance = new OpencartPageObjectsHandler(driver, eyes);
        }
        return instance;
    }

    public HomePage getHomePage() {
        if (homePage == null) {
            homePage = new HomePage(driver, instance);
            PageFactory.initElements(driver, homePage);
            homePage.setEyes(eyes);
        }
        return homePage;
    }
    
    public LoginPage getLoginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage(driver, instance);
            PageFactory.initElements(driver, loginPage);
            loginPage.setEyes(eyes);
        }
        return loginPage;
    }
    
    public MyAccountPage getMyAccountPage() {
        if (myAccountPage == null) {
            myAccountPage = new MyAccountPage(driver, instance);
            PageFactory.initElements(driver, myAccountPage);
            myAccountPage.setEyes(eyes);
        }
        return myAccountPage;
    }
    public ProductPage getProductPage(){
        if (productpage == null) {
            productpage = new ProductPage(driver, instance);
            PageFactory.initElements(driver, productpage);
            productpage.setEyes(eyes);
        }
        return productpage;
    }
    public SearchResultPage getSearchResultPage() {
        if (searchResultPage == null) {
            searchResultPage = new SearchResultPage(driver, instance);
            PageFactory.initElements(driver, searchResultPage);
            searchResultPage.setEyes(eyes);
        }
        return searchResultPage;
    }

    public Header getHeaderPage() {
        if (header == null) {
            header = new Header(driver, instance);
            PageFactory.initElements(driver, header);
        }
        return header;
    }
    
    public CartPage getCartPage() {
        if (cartpage == null) {
            cartpage = new CartPage(driver, instance);
            PageFactory.initElements(driver, cartpage);
        }
        return cartpage;
    }
    public Cart getCart() {
        if (cart == null) {
            cart = new Cart(driver, instance);
            PageFactory.initElements(driver, cart);
        }
        return cart;
    }

    public static void setInstanceNull() {

        instance = null;
    }
}
