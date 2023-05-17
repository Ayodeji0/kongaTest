package com.amazonstore.testcases;

import com.amazonstore.base.BaseClass;
import com.amazonstore.pagesobject.HomePage;
import com.amazonstore.pagesobject.IndexPage;
import com.amazonstore.pagesobject.LoginPage;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginPageTest extends BaseClass {
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
    @Test(groups = {"Sanity", "Smoke"})
     public void loginTest(){
         indexPage = new IndexPage();
         loginPage = indexPage.ClickOnLoginBtn();
         homePage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
          String actualURl = homePage.getCurrUrl();
          String expectedURL = "https://www.konga.com/";
          Assert.assertEquals(actualURl, expectedURL);

    }
}
