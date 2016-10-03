package framework.pageobjects.blocks;

import framework.pageobjects.components.PageObject;
import framework.pageobjects.components.SurveyListPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.IOException;
import java.lang.reflect.Method;

/**
 * Created by eugen on 22.09.2016.
 */
public class SurveyPaginator extends SurveyListPage {

    public SurveyPaginator() throws IOException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//pagination-template/div[1]"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//pagination-template/div[2]"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//pagination-template/div[3]"));
    }

    public PageObject nextPage() throws IOException {
        if (!driver.findElements(By.xpath(XPATH_PAGINATION_CONTROL)).isEmpty()&!driver.findElements(By.xpath("//pagination-template/div[2]/ul/li[9]/a")).isEmpty()){
        return this;}
        else {WebElement nextPageButton = driver.findElement(By.xpath("//pagination-template/div[2]/ul/li[9]/a"));
        nextPageButton.click();
        return new SurveyListPage();}

    }
    public PageObject previousPage() throws IOException {
        if (!driver.findElements(By.xpath(XPATH_PAGINATION_CONTROL)).isEmpty()&!driver.findElements(By.xpath("//pagination-template/div[2]/ul/li[2]/a")).isEmpty()){
            return this;}
        else {WebElement nextPageButton = driver.findElement(By.xpath("//pagination-template/div[2]/ul/li[2]/a"));
            nextPageButton.click();
            return new SurveyListPage();}

    }
    public PageObject firstPage(){

    }

    public PageObject lastPage(){

    }

}
