package com.amazonstore.testcases;

import com.amazonstore.base.BaseClass;
import com.amazonstore.pagesobject.*;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class end2endTest extends BaseClass {
    IndexPage indexPage;

    SearchResultPage searchResultPage;
    AddToCartPage addToCartPage;
    OrderPage orderPage;
    LoginPage loginPage;
    AddressPage addressPage;
    ShippingPage shippingPage;
    PaymentMethodPage paymentMethodPage;
    TransferPage transferpage;
    PaymentSummaryPage paymentSummaryPage;
    PaymentVerificationPage paymentVerificationPage;
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
    @Test(groups = "Regression")

    public void endToendTest(){
        indexPage = new IndexPage();
        searchResultPage =indexPage.searchProduct("t-shirt");
        addToCartPage =searchResultPage.clickOnProduct();
        addToCartPage.clickQuantity("2");
        addToCartPage.clickOnSize("L");
        orderPage =addToCartPage.clickOnCheckout();
         loginPage = orderPage.continueToCheckout();
          addressPage =loginPage.login1(prop.getProperty("email"), prop.getProperty("password"));
          shippingPage = addressPage.clicksignup();
          paymentMethodPage = shippingPage.clickonsubbtn();
           transferpage = paymentMethodPage.clickonoptions();
           paymentSummaryPage= transferpage.paynow("deji", "bayo");
            paymentVerificationPage = paymentSummaryPage.clickonpayment();
            String result = paymentVerificationPage.errorMessage();
            String expected = "payment not successful";
            Assert.assertEquals(result, expected);


    }
}
