package com.amazonstore.pagesobject;

import com.amazonstore.actiondriver.Action;
import com.amazonstore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPage extends BaseClass {
    @FindBy(xpath = "//button[@class='_0a08a_3czMG _8e9fa_19oZn']")
    WebElement signupbtn;

    public AddressPage () {
        PageFactory.initElements(driver, this);
    }

    public ShippingPage clicksignup(){
        Action.click(driver, signupbtn);
        return new  ShippingPage();
    }
}
