package com.amazonstore.pagesobject;

import com.amazonstore.actiondriver.Action;
import com.amazonstore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KongaPrimePage extends BaseClass {

    @FindBy(xpath = "(//img[@alt='Lagos.'])[1]")
    WebElement lagos;

    public  KongaPrimePage() {
        PageFactory.initElements(driver, this);
    }
    public PaymentMethodPage clickonprimebtn(){
        Action.click(driver, lagos );
        return new PaymentMethodPage();
    }
}
