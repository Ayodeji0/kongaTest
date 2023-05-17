package com.amazonstore.pagesobject;

import com.amazonstore.actiondriver.Action;
import com.amazonstore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentVerificationPage  extends BaseClass {
    Action action = new Action();

    @FindBy(xpath = "//span[normalize-space()='OOPS! An Error Occurred']")
    private WebElement errormessage;
    public  PaymentVerificationPage () {
        PageFactory.initElements(getDriver(), this);
    }
    public String errorMessage(){
        String confirmMessage =  errormessage.getText();
         return  confirmMessage;
    }


}
