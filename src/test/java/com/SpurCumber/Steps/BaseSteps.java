package com.SpurCumber.Steps;
import com.SpurCumber.Utils.TestContext;
import com.SpurCumber.Utils.WiniumUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.io.IOException;

public class BaseSteps extends TestContext {
    @Before("@winiumApp")
    public void InitializeWiniumApp(Scenario scenario1) throws IOException, InterruptedException {
        scenario = scenario1;
        WiniumUtil.WiniumServerInit();
        Thread.sleep(3000);
        winiumdriver = WiniumUtil.WiniumIniit();
    }

    @After("@winiumApp")
    public void TearDownWiniumApp() {
        WiniumUtil.stopWiniumDriver();
        WiniumUtil.WiniumTearDown();
    }
}
