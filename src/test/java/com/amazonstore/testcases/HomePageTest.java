package com.amazonstore.testcases;

import com.amazonstore.base.BaseClass;
import com.amazonstore.pagesobject.HomePage;
import com.amazonstore.pagesobject.IndexPage;
import com.amazonstore.pagesobject.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HomePageTest extends BaseClass {
    IndexPage indexPage;
    LoginPage loginPage;
    HomePage homePage;
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
    @Test(groups = {"Smoke","Regression"})
    public void wishListTest(){
        indexPage = new IndexPage();
        loginPage=indexPage.ClickOnLoginBtn();
         homePage =loginPage.login(prop.getProperty("email"), prop.getProperty("password") );
          boolean result =homePage.validateSearch();
        Assert.assertTrue(result);

    }
}
