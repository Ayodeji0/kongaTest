package com.amazonstore.pagesobject;

import com.amazonstore.actiondriver.Action;
import com.amazonstore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShippingPage extends BaseClass {
    @FindBy(xpath = "//img[@alt='Image with text describing konga prime and image of a truck ']")
    WebElement subscribebtn;
    public  ShippingPage() {
        PageFactory.initElements(driver, this);
    }
    public PaymentMethodPage clickonsubbtn(){
        Action.click(driver, subscribebtn);
        return new PaymentMethodPage();
    }

}
