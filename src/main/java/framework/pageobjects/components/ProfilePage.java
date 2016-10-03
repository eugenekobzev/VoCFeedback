package framework.pageobjects.components;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by eugen on 16.09.2016.
 */
public class ProfilePage extends PageObject{
    public ProfilePage(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#user-dropdown-menu.dropdown-toggle")));
    }
}
