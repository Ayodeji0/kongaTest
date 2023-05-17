package com.amazonstore.testcases;

import com.amazonstore.base.BaseClass;
import com.amazonstore.pagesobject.IndexPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class IndexPageTest extends BaseClass {

    IndexPage indexPage;
    @Parameters("browser")
    @BeforeMethod(groups = {"Smoke","Sanity","Regression"})
    public void setup(String browser){
        launchApp(browser);
    }
    @AfterMethod(groups = {"Smoke","Sanity","Regression"})
    public void tearDown(){
        getDriver().quit();
    }
    @Test(groups = "Smoke")
    public void validateLogo() {
        indexPage = new IndexPage();
         boolean result = indexPage.validateLogo();
        Assert.assertTrue(result);
    }
    @Test(groups = "Smoke")
    public void validateTitle() {
        String actTitle = indexPage.getTitle();
        Assert.assertEquals(actTitle, "Buy Phones, Fashion, Electronics in Nigeria_Konga Online Shopping | Konga Online Shopping");

    }
}
