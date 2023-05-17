package com.amazonstore.pagesobject;

import com.amazonstore.actiondriver.Action;
import com.amazonstore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage extends BaseClass {
    Action action = new Action();
    public SearchResultPage(){
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(xpath = "//img[@class='f5e10_VzEXF _72d4f_1Tx1j lazyloaded']")
    private WebElement ProductResult;

    public boolean isProductAvailable(){
        return action.isDisplayed(getDriver(), ProductResult);
    }
    public AddToCartPage clickOnProduct(){
        action.click(getDriver(),ProductResult);
        return new AddToCartPage();
    }
}



