package framework.pageobjects.components;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.IOException;

/**
 * Created by eugen on 16.09.2016.
 */
public class BasePage extends PageObject {
    public BasePage() throws IOException {
        driver.get(propertyOption.getPropValues("feedback"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#div.modal-dialog div.modal-content")));
    }
    public SurveyListPage feedbackLogin(String username, String password) throws IOException {

        driver.findElement(By.xpath("//*[@id=\"field-username\"]")).sendKeys("admin");
        driver.findElement(By.xpath("//*[@id=\"field-password\"]")).sendKeys("admin");
        driver.findElement(By.cssSelector("button.btn-ln.btn-primary")).click();
        return new SurveyListPage();
    }


}
