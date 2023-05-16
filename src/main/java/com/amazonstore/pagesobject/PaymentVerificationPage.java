package com.amazonstore.pagesobject;

import com.amazonstore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentVerificationPage  extends BaseClass {

    @FindBy(xpath = "//span[normalize-space()='OOPS! An Error Occurred']")
    WebElement errormessage;
    public  PaymentVerificationPage () {
        PageFactory.initElements(driver, this);
    }
    public String errorMessage(){
        String confirmMessage =  errormessage.getText();
         return  confirmMessage;
    }


}
