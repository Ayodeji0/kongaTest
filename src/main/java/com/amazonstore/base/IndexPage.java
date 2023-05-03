package com.amazonstore.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage extends BaseClass {
    @FindBy(xpath = "//a[normalize-space()='Login / Signup']")
    WebElement loginBtn;
    @FindBy(xpath = "//a[@class='_6a647_2Et0-']//img[@alt='Smiling face of Konga logo.']")
    WebElement kongaLogo;
    @FindBy (xpath = "//form[@class='f6ed2_25oVd']//input[@id='jsSearchInput']")
    WebElement searchProductBox;
    @FindBy (xpath = "(//*[name()='svg'][@name='search'])[4]")
    WebElement searchBtn;

    public IndexPage(){
        PageFactory.initElements(driver, this);
    }
}
