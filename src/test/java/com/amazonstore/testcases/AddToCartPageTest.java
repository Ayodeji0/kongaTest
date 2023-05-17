package com.amazonstore.testcases;

import com.amazonstore.base.BaseClass;
import com.amazonstore.pagesobject.AddToCartPage;
import com.amazonstore.pagesobject.IndexPage;
import com.amazonstore.pagesobject.SearchResultPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AddToCartPageTest extends BaseClass {

    IndexPage indexPage;
    SearchResultPage searchResultPage;
    AddToCartPage addToCartPage;
    @Parameters("browser")
    @BeforeMethod(groups = {"Smoke","Sanity","Regression"})
    public void setup(String browser)
    {
        launchApp(browser);

    }
    @AfterMethod(groups = {"Smoke","Sanity","Regression"})
    public void tearDown(){
        getDriver().quit();
    }
    @Test (groups = "Sanity")
    public void addToCartTest(){
        indexPage = new IndexPage();
        searchResultPage = indexPage.searchProduct("t-shirt");
         addToCartPage =searchResultPage.clickOnProduct();
         addToCartPage.clickQuantity("2");
         addToCartPage.clickOnSize("L");
         addToCartPage.clickOnBtn();
         boolean result = addToCartPage.validate();
        Assert.assertTrue(result);

    }
}
