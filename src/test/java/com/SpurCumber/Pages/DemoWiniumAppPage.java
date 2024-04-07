package com.SpurCumber.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.winium.WiniumDriver;

public class DemoWiniumAppPage {

    private final WiniumDriver winiumdriver;

    public DemoWiniumAppPage(WiniumDriver _winiumdriver) {
        this.winiumdriver = _winiumdriver;
    }

    public Boolean verifyScreen(String locator) throws InterruptedException {
        WebElement Screen = winiumdriver.findElementByName(locator);
        return Screen.isDisplayed();
    }

    public void clickBtnByName(String locator) throws InterruptedException {
        WebElement element = winiumdriver.findElementByName(locator);
        Thread.sleep(3000);
        element.click();
    }
}

