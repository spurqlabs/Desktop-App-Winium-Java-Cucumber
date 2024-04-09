package com.SpurCumber.Utils;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;


@CucumberOptions(features = {"src/test/java/com/SpurCumber/Features"},
        glue = ("com.SpurCumber.Steps"),tags="@winiumApp",
        plugin = { "pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm","pretty", "json:test-output/Cucumber.json","html:STDOUT","html:test-output/Cucumber.html" })
public class TestRunner extends AbstractTestNGCucumberTests {

    @DataProvider
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }
}