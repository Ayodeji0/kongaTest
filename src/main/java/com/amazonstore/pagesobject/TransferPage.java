package com.amazonstore.pagesobject;

import com.amazonstore.actiondriver.Action;
import com.amazonstore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransferPage  extends BaseClass {



    public TransferPage () {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@id='first-name']")
    WebElement firstname;
    @FindBy(xpath = "//input[@id='last-name']")
    WebElement lastname;
    @FindBy(xpath = "//button[@id='validateTransferForm']") WebElement paynowbtn;

    public PaymentSummaryPage paynow(String fname, String Lname){
        Action.type(firstname, fname);
        Action.type(lastname, Lname);
        Action.click(driver, paynowbtn);
        return new PaymentSummaryPage();
    }
}
