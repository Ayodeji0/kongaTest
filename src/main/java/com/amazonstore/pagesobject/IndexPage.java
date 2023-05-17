package com.amazonstore.pagesobject;

import com.amazonstore.actiondriver.Action;
import com.amazonstore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage extends BaseClass {
    Action action = new Action();
    @FindBy(xpath = "//a[normalize-space()='Login / Signup']")
   private WebElement loginBtn;
    @FindBy(xpath = "//a[@class='_6a647_2Et0-']")
    private WebElement kongaLogo;
    @FindBy (xpath = "//form[@class='f6ed2_25oVd']//input[@id='jsSearchInput']")
    private WebElement searchProductBox;
    @FindBy (xpath = "(//*[name()='svg'][@name='search'])[4]")
    private WebElement searchBtn;

    public IndexPage(){
        PageFactory.initElements(getDriver(), this);
    }
    public LoginPage ClickOnLoginBtn() {
        action.click(getDriver(), loginBtn);
        return new LoginPage();
    }
    public boolean validateLogo() {
       return action.isDisplayed(getDriver(),kongaLogo);
    }
    public String getTitle() {
        String konga_Store = getDriver().getTitle();
        return konga_Store;
    }
    public SearchResultPage searchProduct(String productName){
        action.type(searchProductBox, productName);
        action.click(getDriver(),searchBtn);
        return new SearchResultPage();
    }
}
