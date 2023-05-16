package com.amazonstore.testcases;

import com.amazonstore.base.BaseClass;
import com.amazonstore.pagesobject.IndexPage;
import com.amazonstore.pagesobject.SearchResultPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchResultPageTest extends BaseClass {
    IndexPage indexPage;
    SearchResultPage searchResultPage;
    @BeforeMethod
    public void setup()
    {
        launchApp();

    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
       public void clickOnProduct(){
        indexPage = new IndexPage();
         searchResultPage =indexPage.searchProduct("t-shirt");
        boolean result  = searchResultPage.isProductAvailable();
        Assert.assertTrue(result);
    }
}
