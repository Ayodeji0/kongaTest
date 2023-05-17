package com.amazonstore.pagesobject;

import com.amazonstore.actiondriver.Action;
import com.amazonstore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentSummaryPage  extends BaseClass {
    Action action = new Action();

    @FindBy (xpath = "//button[@class='button fuchsia-pink-outline getTransferStatus']")
    private WebElement transfermade;
    @FindBy (xpath = "//span[@id='reselect-payment-method']")
    private WebElement reselectpayment;

    public PaymentSummaryPage  () {
        PageFactory.initElements(getDriver(), this);
    }

    public PaymentVerificationPage clickonpayment(){
        action.click(getDriver(), transfermade);
        return new PaymentVerificationPage();
    }

}
