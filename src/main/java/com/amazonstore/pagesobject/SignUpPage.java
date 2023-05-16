package com.amazonstore.pagesobject;

import com.amazonstore.actiondriver.Action;
import com.amazonstore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends BaseClass {
    @FindBy(id = "firstname")
    WebElement FnameField;
    @FindBy(id = "lastname") WebElement LnameField;
    @FindBy(id = "email") WebElement mailField;
    @FindBy(id = "phone") WebElement phoneField;
    @FindBy(xpath = "//input[@id='password'])[2]") WebElement passwordField;
    @FindBy(xpath = "//button[normalize-space()='Create an Account']")WebElement createBtn;
    @FindBy(xpath = "//button[normalize-space()='Submit Code']") WebElement loginBtn;

    public SignUpPage() {
        PageFactory.initElements(driver, this);
    }

    public AccountVerificationPage newAccount(String fname, String lname, String mail, String phone, String pwd){
        Action.type(FnameField, fname);
        Action.type(LnameField, lname);
        Action.type(mailField, mail);
        Action.type(phoneField,phone);
        Action.type(passwordField, pwd);
        Action.click(driver,loginBtn);
        return new AccountVerificationPage();

    }
}
