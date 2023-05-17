package com.amazonstore.pagesobject;

import com.amazonstore.actiondriver.Action;
import com.amazonstore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {
    Action action = new Action();
    @FindBy(xpath = "//div[contains(@class,'_40d77_2fZbm')]")
    private WebElement dealText;


    public HomePage(){
        PageFactory.initElements(getDriver(), this);
    }

    public boolean validateSearch() {
        return action.isDisplayed(getDriver(), dealText);
    }
     public String getCurrUrl(){
         String homepageURL = getDriver().getCurrentUrl();
         return homepageURL;
     }
}
