package com.amazonstore.pagesobject;

import com.amazonstore.actiondriver.Action;
import com.amazonstore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage extends BaseClass {
    public SearchResultPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//img[@class='f5e10_VzEXF _72d4f_1Tx1j lazyloaded']")
    WebElement ProductResult;

    public boolean isProductAvailable(){
        return Action.isDisplayed(driver, ProductResult);
    }
    public AddToCartPage clickOnProduct(){
        Action.click(driver,ProductResult);
        return new AddToCartPage();
    }
}



