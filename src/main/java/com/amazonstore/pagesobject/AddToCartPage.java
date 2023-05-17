package com.amazonstore.pagesobject;

import com.amazonstore.actiondriver.Action;
import com.amazonstore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage extends BaseClass {
    Action action = new Action();
    @FindBy(xpath = "(//div[normalize-space()='XXL']")
    private WebElement size;
    @FindBy(xpath = "(//button[@name='increment'][normalize-space()='+'])[2]")
     private WebElement quantity;

    @FindBy(xpath = "(//button[contains(@type,'submit')][normalize-space()='Buy Now'])[2]")
    private WebElement buybtn;

    @FindBy(xpath = "//h1[@class='_26fa9_oe_eV']") private WebElement shopping;

    @FindBy(css = "div[class='e97e8_3Yoxb'] a:nth-child(1)") private WebElement checkout;

    public AddToCartPage(){
        PageFactory.initElements(getDriver(), this);
    }

    public void clickOnSize(String l) {
        action.click(getDriver(), size);
    }

    public void clickQuantity(String number) {
        action.click(getDriver(), quantity);
    }
    public void clickOnBtn() {
        action.click(getDriver(), buybtn);
    }
    public boolean validate() {
       return action.isDisplayed(getDriver(), shopping);
    }
    public OrderPage clickOnCheckout(){
        action.JSClick(getDriver(), checkout);
        return new OrderPage();
    }
}
