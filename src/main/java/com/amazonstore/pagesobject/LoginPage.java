package com.amazonstore.pagesobject;

import com.amazonstore.actiondriver.Action;
import com.amazonstore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage extends BaseClass {
    Action action = new Action();
    @FindBy(id = "username")
    private WebElement email;
    @FindBy(id = "password")
    private WebElement password;
    @FindBy(xpath = "//button[normalize-space()='Login']")
    private WebElement loginBtn;
    @FindBy(xpath = "//a[contains(text(),'Don’t have an account? Sign Up')]")
    private WebElement signUpLink;

    public LoginPage() {
        PageFactory.initElements(getDriver(), this);
    }
    public HomePage login(String mail, String pswd) {
        action.type(email, mail);
        action.type(password, pswd);
        action.click(getDriver(), loginBtn);
        return new HomePage();

    }

    public AddressPage login1(String mail, String pswd) {
        action.type(email, mail);
        action.type(password, pswd);
        action.click(getDriver(), loginBtn);
        return new AddressPage();

    }
    public SignUpPage createAccount(String yeyeye){
        action.click(getDriver(), signUpLink);
        return new SignUpPage();
    }

}
