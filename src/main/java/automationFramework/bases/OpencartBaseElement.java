package automationFramework.bases;

import automationFramework.bases.*;
import automationFramework.pageObjects.BaseElement;
import org.openqa.selenium.WebDriver;
import automationFramework.pageObjectsHandler.OpencartPageObjectsHandler;

public class OpencartBaseElement extends BaseElement{

    protected static OpencartPageObjectsHandler pageObjectsHandler;

    public OpencartBaseElement(WebDriver driver, OpencartPageObjectsHandler handler) {
        super(driver);
        pageObjectsHandler = handler;
    }

    public OpencartPageObjectsHandler getPageObjectsHandler() {
        return pageObjectsHandler;
    }
}
