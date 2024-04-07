package com.SpurCumber.Utils;

import io.cucumber.java.Scenario;
import org.openqa.selenium.winium.WiniumDriver;

import java.util.Dictionary;
import java.util.Hashtable;

public class TestContext {
    public static Scenario scenario;
    public static Dictionary<String, String> stringContext = new Hashtable<>();
    public static WiniumDriver winiumdriver;
}
