package framework.blocks;

import framework.pageobjects.components.SurveyListPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by eugen on 16.09.2016.
 */
public class Header extends SurveyListPage {
    public Header() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("nav.collapse.navbar-collapse.bs-navbar-collapse")));
    }

    public boolean isSurveysLinkPresent() {
        return !driver.findElements(By.linkText("Surveys")).isEmpty();
    }

    public boolean isImportLinkPresent() {
        return !driver.findElements(By.linkText("Import")).isEmpty();
    }

    public boolean isExportLinkPresent() {
        return !driver.findElements(By.linkText("Export")).isEmpty();
    }
    public boolean isSettingsLinkPresent(){
        return !driver.findElements(By.linkText("Global settings")).isEmpty();
    }
    public boolean isCustomerssLinkPresent(){
        return !driver.findElements(By.linkText("Customers")).isEmpty();
    }
}
