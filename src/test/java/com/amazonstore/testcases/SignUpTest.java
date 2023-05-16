package com.amazonstore.testcases;

import com.amazonstore.base.BaseClass;
import com.amazonstore.pagesobject.HomePage;
import com.amazonstore.pagesobject.IndexPage;
import com.amazonstore.pagesobject.LoginPage;
import com.amazonstore.pagesobject.SignUpPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignUpTest  extends BaseClass {
    IndexPage indexPage;
    LoginPage loginPage;
    HomePage homePage;
    SignUpPage signUpPage;
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
    public void accountcreation(){
        indexPage = new IndexPage();
        loginPage=indexPage.ClickOnLoginBtn();
         signUpPage = loginPage.createAccount("yeyeye");
         signUpPage.newAccount("jide","kunle", "yyeueu@mail.com", "08064280322","122445");
    }
}
