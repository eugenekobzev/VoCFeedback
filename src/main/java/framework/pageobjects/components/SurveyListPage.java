package framework.pageobjects.components;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.IOException;

/**
 * Created by eugen on 16.09.2016.
 */
public class SurveyListPage extends BasePage {

    public static final String XPATH_PAGES_COUNT = "//pagination-template/div[1]";
    public static final String XPATH_PAGINATION_CONTROL = "//pagination-template/div[2]";
    public static final String XPATH_DIRECT_PAGE_NAVIGATION = "//pagination-template/div[3]";

    public SurveyListPage() throws IOException {
        super();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#div.panel.panel-default.surveys-list.ng-scope")));
    }
    public boolean isUnitSelectorPresent(){
        return !driver.findElements(By.xpath("//select")).isEmpty();
    }
    public boolean isSearchPresent(){
        return !driver.findElements(By.xpath("//input[contains(@placeholder,'Search')]")).isEmpty();
    }
    public boolean isRowsPerPageIsPresent(){
        return !driver.findElements(By.cssSelector("#button.btn.btn-default.dropdown-toggle.ng-binding")).isEmpty();
    }
    public boolean isAddSurveyGroupButtonPresent(){
        return !driver.findElements(By.xpath("//button[contains(@text, 'Add Survey')]")).isEmpty();
    }
    public boolean isPageNumberPresent() {
        return !driver.findElements(By.xpath(XPATH_PAGES_COUNT)).isEmpty();
    }
    public boolean isPaginatorPresent(){
        return !driver.findElements(By.xpath(XPATH_PAGINATION_CONTROL)).isEmpty();
    }
    public boolean isPageNavigatorPresent(){
        return !driver.findElements(By.xpath(XPATH_DIRECT_PAGE_NAVIGATION)).isEmpty();

    }




}
