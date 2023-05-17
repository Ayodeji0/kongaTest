package com.amazonstore.pagesobject;

import com.amazonstore.actiondriver.Action;
import com.amazonstore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KongaPrimePage extends BaseClass {
    Action action = new Action();

    @FindBy(xpath = "(//img[@alt='Lagos.'])[1]")
    private WebElement lagos;

    public  KongaPrimePage() {
        PageFactory.initElements(getDriver(), this);
    }
    public PaymentMethodPage clickonprimebtn(){
        action.click(getDriver(), lagos );
        return new PaymentMethodPage();
    }
}
