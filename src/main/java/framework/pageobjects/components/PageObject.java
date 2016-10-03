package framework.pageobjects.components;

import framework.utils.DriverManager;
import framework.utils.PropertyLoader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * Created by eugen on 16.09.2016.
 */
public class PageObject{
    PropertyLoader propertyOption = new PropertyLoader();
    protected WebDriver driver = DriverManager.getInstance().getDriver();
    protected WebDriverWait wait = new WebDriverWait(driver, 20, 250);
}