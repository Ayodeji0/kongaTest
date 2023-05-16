package com.amazonstore.pagesobject;

import com.amazonstore.actiondriver.Action;
import com.amazonstore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage extends BaseClass {
    @FindBy(id = "username")
    WebElement email;
    @FindBy(id = "password")
    WebElement password;
    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement loginBtn;
    @FindBy(xpath = "//a[contains(text(),'Don’t have an account? Sign Up')]")
    WebElement signUpLink;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }
    public HomePage login(String mail, String pswd) {
        Action.type(email, mail);
        Action.type(password, pswd);
        Action.click(driver, loginBtn);
        return new HomePage();

    }

    public AddressPage login1(String mail, String pswd) {
        Action.type(email, mail);
        Action.type(password, pswd);
        Action.click(driver, loginBtn);
        return new AddressPage();

    }
    public SignUpPage createAccount(String yeyeye){
        Action.click(driver, signUpLink);
        return new SignUpPage();
    }

}
