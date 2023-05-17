package com.amazonstore.pagesobject;

import com.amazonstore.actiondriver.Action;
import com.amazonstore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountVerificationPage extends BaseClass {
    Action action= new Action();
    @FindBy(id = "pin")
     private WebElement pinCode;
    @FindBy(xpath = "//button[normalize-space()='Submit Code']")
    private WebElement codeBtn;

    public AccountVerificationPage(){
        PageFactory.initElements(getDriver(), this);
    }

    public IndexPage enterdigit(String num){
        action.type(pinCode, num);
        action.click(getDriver(), codeBtn);
        return new IndexPage();

    }
}
