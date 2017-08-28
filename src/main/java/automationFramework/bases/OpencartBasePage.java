package automationFramework.bases;

import automationFramework.bases.*;
import automationFramework.pageObjects.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import automationFramework.pageObjectsHandler.OpencartPageObjectsHandler;
import automationFramework.pages.Cart;
import automationFramework.pages.Header;
import automationFramework.pages.HomePage;
import automationFramework.pages.LoginPage;
import automationFramework.pages.SearchResultPage;

public abstract class OpencartBasePage extends BasePage {

    protected static OpencartPageObjectsHandler pageObjectsHandler;
    protected Header header;
    protected Cart cart;

    public OpencartBasePage(WebDriver driver, OpencartPageObjectsHandler handler) {
        super(driver);
        OpencartBasePage.pageObjectsHandler = handler;
        header = getPageObjectsHandler().getHeaderPage();
        cart = getPageObjectsHandler().getCart();
    }

    public OpencartPageObjectsHandler getPageObjectsHandler() {
        return pageObjectsHandler;
    }
    public void setPageObjectsHandler(OpencartPageObjectsHandler pageObjectsHandler) {
        this.pageObjectsHandler = pageObjectsHandler;
    }

    public HomePage goToHome(){
        return header.goToHome();
    }
    
    public LoginPage goToLogin(){
        return header.goToLogin();
    }

    public SearchResultPage search(String item){
        return header.search(item);
    }

    public abstract By getPageLoadedLocator();
}
