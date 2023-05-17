package com.amazonstore.pagesobject;

import com.amazonstore.actiondriver.Action;
import com.amazonstore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransferPage  extends BaseClass {

    Action action = new Action();

    public TransferPage () {
        PageFactory.initElements(getDriver(), this);
    }
    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement firstname;
    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement lastname;
    @FindBy(xpath = "//button[@id='validateTransferForm']") private WebElement paynowbtn;

    public PaymentSummaryPage paynow(String fname, String Lname){
        action.type(firstname, fname);
        action.type(lastname, Lname);
        action.click(getDriver(), paynowbtn);
        return new PaymentSummaryPage();
    }
}
