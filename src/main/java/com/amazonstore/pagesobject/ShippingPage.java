package com.amazonstore.pagesobject;

import com.amazonstore.actiondriver.Action;
import com.amazonstore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShippingPage extends BaseClass {
    Action action = new Action();
    @FindBy(xpath = "//img[@alt='Image with text describing konga prime and image of a truck ']")
     private WebElement subscribebtn;
    public  ShippingPage() {
        PageFactory.initElements(getDriver(), this);
    }
    public PaymentMethodPage clickonsubbtn(){
        action.click(getDriver(), subscribebtn);
        return new PaymentMethodPage();
    }

}
