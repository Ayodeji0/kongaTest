package com.amazonstore.pagesobject;

import com.amazonstore.actiondriver.Action;
import com.amazonstore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage extends BaseClass {
    @FindBy(xpath = "(//div[normalize-space()='XXL']")
    WebElement size;
    @FindBy(xpath = "(//button[@name='increment'][normalize-space()='+'])[2]")
    WebElement quantity;

    @FindBy(xpath = "(//button[contains(@type,'submit')][normalize-space()='Buy Now'])[2]")
    WebElement buybtn;

    @FindBy(xpath = "//h1[@class='_26fa9_oe_eV']") WebElement shopping;

    @FindBy(css = "div[class='e97e8_3Yoxb'] a:nth-child(1)") WebElement checkout;

    public AddToCartPage(){
        PageFactory.initElements(driver, this);
    }

    public void clickOnSize(String l) {
        Action.click(driver, size);
    }

    public void clickQuantity(String number) {
        Action.click(driver, quantity);
    }
    public void clickOnBtn() {
        Action.click(driver, buybtn);
    }
    public boolean validate() {
       return Action.isDisplayed(driver, shopping);
    }
    public OrderPage clickOnCheckout(){
        Action.JSClick(driver, checkout);
        return new OrderPage();
    }
}
