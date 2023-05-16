package com.amazonstore.testcases;

import com.amazonstore.base.BaseClass;
import com.amazonstore.pagesobject.*;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OrderPageTest extends BaseClass {
    IndexPage indexPage;
    SearchResultPage searchResultPage;
    AddToCartPage addToCartPage;
    OrderPage  orderPage;


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
    public void orderPageTest(){
        indexPage = new IndexPage();
         searchResultPage =indexPage.searchProduct("t-shirt");
         addToCartPage =searchResultPage.clickOnProduct();
         addToCartPage.clickQuantity("2");
         addToCartPage.clickOnSize("L");
         orderPage =addToCartPage.clickOnCheckout();
        Double unitPrice = orderPage.getsubtotalPrice();
        Double totalPrice = orderPage.gettotalPrice();
        Double totalExpectedPrice =(unitPrice*2)+2;
        Assert.assertEquals("totalPrice", "totalExpectedPrice" );


    }
}
