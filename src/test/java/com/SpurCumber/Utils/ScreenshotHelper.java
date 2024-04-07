package com.SpurCumber.Utils;

import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.winium.WiniumDriver;

import java.io.ByteArrayInputStream;

public class ScreenshotHelper {
    public static void captureScreenshotAllure(WiniumDriver driver, String screenshotName) {
        try {
            TakesScreenshot ts = (TakesScreenshot) driver;
            byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
            Allure.addAttachment(screenshotName, new ByteArrayInputStream(screenshot));
            System.out.println("Screenshot taken: " + screenshotName);
        } catch (Exception e) {
            System.out.println("Exception while taking screenshot: " + e.getMessage());
        }
    }

    public static  byte[] takeWebScreenshotBase64(WiniumDriver driver) {
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        return (byte[])takesScreenshot.getScreenshotAs(OutputType.BYTES);
    }
}

