package tests;

import framework.pageobjects.components.SSOPage;
import framework.utils.PropertyLoader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.lang.reflect.Method;

/**
 * Created by eugen on 16.09.2016.
 */
public class BaseTest {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected PropertyLoader propertyOption = new PropertyLoader();
    @BeforeClass
    driver.

    @BeforeMethod
    public void beforeBaseMethod(Method method) throws IOException {
        SSOPage loginPage = new SSOPage();
        loginPage.open();

        if (method.getDeclaringClass().equals(LoginTest.class)) {
            return;
        }

        homePage = loginPage.loginAs(PropertyLoader.getInstance().getUsername(), PropertyLoader.getInstance().getPassword());
    }



    @AfterMethod


    @AfterClass
}
