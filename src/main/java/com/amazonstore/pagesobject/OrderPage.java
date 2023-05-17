package com.amazonstore.pagesobject;

import com.amazonstore.actiondriver.Action;
import com.amazonstore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage  extends BaseClass {
    Action action = new Action();
    @FindBy(xpath = "//div[contains(@class,'_18e21_1ZDIc')])[3]")
    private WebElement subtotal;
    @FindBy(xpath = "//div[contains(@class,'_18e21_1ZDIc')])[4]") private WebElement totalPrice;

    @FindBy(xpath = "//div[contains(@class,'f082d_safAL')]//a[contains(@class,'_0a08a_3czMG')][normalize-space()='Continue to Checkout'")
    private WebElement continutocheckout;


    public OrderPage () {
        PageFactory.initElements(getDriver(), this);
    }

//     This method is used for getting the unit price of goods while testing e-comerce
    public double getsubtotalPrice() {
        String subtotal1 = subtotal.getText();
//         to replace special charater
       String sub = subtotal1.replaceAll("[^a-zA-Z0-9]","");
       double finalsubtotal = Double.parseDouble(sub);
       return finalsubtotal/100;

    }

    public double gettotalPrice() {
        String totalPrice1 = totalPrice.getText();
//         to replace special charater
        String tot = totalPrice1.replaceAll("[^a-zA-Z0-9]","");
        double finaltotalPrice = Double.parseDouble(tot);
        return finaltotalPrice/100;

    }
    public LoginPage continueToCheckout(){
        action.click(getDriver(),continutocheckout);
        return new LoginPage();
    }


}
