package com.amazonstore.testcases;

import com.amazonstore.base.BaseClass;
import com.amazonstore.pagesobject.IndexPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IndexPageTest extends BaseClass {

    IndexPage indexPage;
    @BeforeMethod
    public void setup(){
        launchApp();
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
    @Test
    public void validateLogo() {
        indexPage = new IndexPage();
         boolean result = indexPage.validateLogo();
        Assert.assertTrue(result);
    }
    @Test
    public void validateTitle() {
        String actTitle = indexPage.getTitle();
        Assert.assertEquals(actTitle, "Buy Phones, Fashion, Electronics in Nigeria_Konga Online Shopping | Konga Online Shopping");

    }
}
