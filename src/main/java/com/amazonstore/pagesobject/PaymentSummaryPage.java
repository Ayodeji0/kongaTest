package com.amazonstore.pagesobject;

import com.amazonstore.actiondriver.Action;
import com.amazonstore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentSummaryPage  extends BaseClass {

    @FindBy (xpath = "//button[@class='button fuchsia-pink-outline getTransferStatus']")
    WebElement transfermade;
    @FindBy (xpath = "//span[@id='reselect-payment-method']")
    WebElement reselectpayment;

    public PaymentSummaryPage  () {
        PageFactory.initElements(driver, this);
    }

    public PaymentVerificationPage clickonpayment(){
        Action.click(driver, transfermade);
        return new PaymentVerificationPage();
    }

}
