package com.amazonstore.pagesobject;

import com.amazonstore.actiondriver.Action;
import com.amazonstore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends BaseClass {
    Action action = new Action();
    @FindBy(id = "firstname")
    private WebElement FnameField;
    @FindBy(id = "lastname") private WebElement LnameField;
    @FindBy(id = "email") private WebElement mailField;
    @FindBy(id = "phone") private WebElement phoneField;
    @FindBy(xpath = "//input[@id='password'])[2]") private WebElement passwordField;
    @FindBy(xpath = "//button[normalize-space()='Create an Account']")private WebElement createBtn;
    @FindBy(xpath = "//button[normalize-space()='Submit Code']") private WebElement loginBtn;

    public SignUpPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public AccountVerificationPage newAccount(String fname, String lname, String mail, String phone, String pwd){
        action.type(FnameField, fname);
        action.type(LnameField, lname);
        action.type(mailField, mail);
        action.type(phoneField,phone);
        action.type(passwordField, pwd);
        action.click(getDriver(),loginBtn);
        return new AccountVerificationPage();

    }
}
