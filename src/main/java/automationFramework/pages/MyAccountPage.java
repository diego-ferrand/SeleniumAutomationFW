/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automationFramework.pages;

import automationFramework.pages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import automationFramework.bases.OpencartBasePage;
import automationFramework.pageObjectsHandler.OpencartPageObjectsHandler;

/**
 *
 * @author JSoarez
 */
public class MyAccountPage extends OpencartBasePage{
       
    public MyAccountPage(WebDriver driver, OpencartPageObjectsHandler handler) {
        super(driver, handler);
        if(!this.isLoaded()){
            throw new IllegalStateException("This is not My Account Page");
        }
    }

    @Override
    public By getPageLoadedLocator() {
        return By.xpath("//title[contains(text(),'My Account')]");
    }
}
