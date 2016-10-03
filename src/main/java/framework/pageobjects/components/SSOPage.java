package framework.pageobjects.components;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.IOException;

/**
 * Created by eugen on 16.09.2016.
 */
public class SSOPage extends PageObject{
    public SSOPage() throws IOException {
         driver.get(propertyOption.getPropValues("SSO"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"id_username\"]")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"id_password\"]")));
    }
    public ProfilePage ssoLogin(String username, String password) {
        driver.findElement(By.xpath("//*[@id=\"id_username\"]")).sendKeys(username);
        driver.findElement(By.xpath("//*[@id=\"id_password\"]")).sendKeys(password);
        return new ProfilePage();
}

}
