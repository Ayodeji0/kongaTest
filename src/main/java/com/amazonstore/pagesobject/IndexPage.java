package com.amazonstore.pagesobject;

import com.amazonstore.actiondriver.Action;
import com.amazonstore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage extends BaseClass {
    @FindBy(xpath = "//a[normalize-space()='Login / Signup']")
    WebElement loginBtn;
    @FindBy(xpath = "//a[@class='_6a647_2Et0-']")
    WebElement kongaLogo;
    @FindBy (xpath = "//form[@class='f6ed2_25oVd']//input[@id='jsSearchInput']")
    WebElement searchProductBox;
    @FindBy (xpath = "(//*[name()='svg'][@name='search'])[4]")
    WebElement searchBtn;

    public IndexPage(){
        PageFactory.initElements(driver, this);
    }
    public LoginPage ClickOnLoginBtn() {
        Action.click(driver, loginBtn);
        return new LoginPage();
    }
    public boolean validateLogo() {
       return Action.isDisplayed(driver,kongaLogo);
    }
    public String getTitle() {
        String konga_Store = driver.getTitle();
        return konga_Store;
    }
    public SearchResultPage searchProduct(String productName){
        Action.type(searchProductBox, productName);
        Action.click(driver,searchBtn);
        return new SearchResultPage();
    }
}
