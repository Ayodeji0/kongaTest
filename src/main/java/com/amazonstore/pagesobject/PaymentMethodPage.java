package com.amazonstore.pagesobject;

import com.amazonstore.actiondriver.Action;
import com.amazonstore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentMethodPage extends BaseClass {
    Action action = new Action();

    @FindBy(xpath = "//body")
    private WebElement banktransfer;

    @FindBy(xpath = "//button[@class='dashboard-card__button Card']")
    private WebElement cardoption;
    public PaymentMethodPage() {
        PageFactory.initElements(getDriver(), this);
    }
    public TransferPage clickonoptions(){
        action.click(getDriver(), banktransfer);
        return new TransferPage();
    }

}
