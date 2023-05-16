package com.amazonstore.actiondriver;

import com.amazonstore.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Action extends BaseClass  {
    public static boolean isDisplayed(WebDriver driver, WebElement dealText) {
        return true;
    }

    public static void JSClick(WebDriver driver, WebElement ele) {
    }

//    @Override
    public void scrollByVisibilityOfElement(WebDriver driver, WebElement ele) {

    }

//    @Override
    public static void click(WebDriver driver, WebElement ele) {

    }

//    @Override
//    public static boolean isDisplayed(WebDriver ldriver, WebElement ele) {
//        return false;
//    }

//    @Override
    public static boolean type(WebElement ele, String text) {
        return false;
    }

//    @Override
    public boolean findElement(WebDriver ldriver, WebElement ele) {
        return false;
    }

//    @Override
    public boolean isSelected(WebDriver ldriver, WebElement ele) {
        return false;
    }

//    @Override
    public boolean isEnabled(WebDriver ldriver, WebElement ele) {
        return false;
    }

//    @Override
    public boolean selectBySendkeys(String value, WebElement ele) {
        return false;
    }

//    @Override
    public boolean selectByIndex(WebElement element, int index) {
        return false;
    }

//    @Override
    public boolean selectByValue(WebElement element, String value) {
        return false;
    }

//    @Override
    public boolean selectByVisibleText(String visibletext, WebElement ele) {
        return false;
    }
}
