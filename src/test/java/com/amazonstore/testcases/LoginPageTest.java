package com.amazonstore.testcases;

import com.amazonstore.base.BaseClass;
import com.amazonstore.pagesobject.HomePage;
import com.amazonstore.pagesobject.IndexPage;
import com.amazonstore.pagesobject.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass {
    IndexPage indexPage;
    LoginPage loginPage;
    HomePage homePage;
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
     public void loginTest(){
         indexPage = new IndexPage();
         loginPage = indexPage.ClickOnLoginBtn();
         homePage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
          String actualURl = homePage.getCurrUrl();
          String expectedURL = "https://www.konga.com/";
          Assert.assertEquals(actualURl, expectedURL);

    }
}
