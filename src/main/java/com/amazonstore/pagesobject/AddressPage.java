package com.amazonstore.pagesobject;

import com.amazonstore.actiondriver.Action;
import com.amazonstore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPage extends BaseClass {
    Action action= new Action();
    @FindBy(xpath = "//button[@class='_0a08a_3czMG _8e9fa_19oZn']")
     private WebElement signupbtn;

    public AddressPage () {
        PageFactory.initElements(getDriver(), this);
    }

    public ShippingPage clicksignup(){
        action.click(getDriver(), signupbtn);

        return new  ShippingPage();
    }
}
