package com.amazonstore.pagesobject;

import com.amazonstore.actiondriver.Action;
import com.amazonstore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {
    @FindBy(xpath = "//div[contains(@class,'_40d77_2fZbm')]")
    WebElement dealText;


    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    public boolean validateSearch() {
        return Action.isDisplayed(driver, dealText);
    }
     public String getCurrUrl(){
         String homepageURL = driver.getCurrentUrl();
         return homepageURL;
     }
}
