package com.amazonstore.pagesobject;

import com.amazonstore.actiondriver.Action;
import com.amazonstore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentMethodPage extends BaseClass {

    @FindBy(xpath = "//body")
    WebElement banktransfer;

    @FindBy(xpath = "//button[@class='dashboard-card__button Card']")
    WebElement cardoption;
    public PaymentMethodPage() {
        PageFactory.initElements(driver, this);
    }
    public TransferPage clickonoptions(){
        Action.click(driver, banktransfer);
        return new TransferPage();
    }

}
