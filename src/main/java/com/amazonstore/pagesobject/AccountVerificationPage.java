package com.amazonstore.pagesobject;

import com.amazonstore.actiondriver.Action;
import com.amazonstore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountVerificationPage extends BaseClass {
    @FindBy(id = "pin")
    WebElement pinCode;
    @FindBy(xpath = "//button[normalize-space()='Submit Code']")
    WebElement codeBtn;

    public AccountVerificationPage(){
        PageFactory.initElements(driver, this);
    }

    public IndexPage enterdigit(String num){
        Action.type(pinCode, num);
        Action.click(driver, codeBtn);
        return new IndexPage();

    }
}
