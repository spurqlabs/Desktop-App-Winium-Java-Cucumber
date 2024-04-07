package com.SpurCumber.Steps;

import com.SpurCumber.Pages.DemoWiniumAppPage;
import com.SpurCumber.Utils.ScreenshotHelper;
import com.SpurCumber.Utils.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class DemoWiniumAppSteps extends TestContext {
    private final DemoWiniumAppPage demoWiniumAppPage;

    public DemoWiniumAppSteps() {
        demoWiniumAppPage = new DemoWiniumAppPage(winiumdriver);
    }
    @Given("User launches the microsoft word application")
    public void userLaunchesTheMicrosoftWordApplication() {
        scenario.log("The application is launched successfully!");
        ScreenshotHelper.takeWebScreenshotBase64(winiumdriver);
        ScreenshotHelper.captureScreenshotAllure(winiumdriver, "User launches the microsoft word application");
    }

    @When("User verifies the landing screen is visible with {string} opened document list")
    public void userVerifiesTheLandingScreenIsVisible(String arg0) throws InterruptedException {
        Assert.assertTrue(demoWiniumAppPage.verifyScreen(arg0));
        ScreenshotHelper.takeWebScreenshotBase64(winiumdriver);
        ScreenshotHelper.captureScreenshotAllure(winiumdriver, "User verifies the landing screen is visible with "+arg0+" opened document list");
    }

    @And("User clicks on {string} option to add blank document")
    public void userClicksOnOptionToAddBlankDocument(String arg0) throws InterruptedException {
        demoWiniumAppPage.clickBtnByName(arg0);
        ScreenshotHelper.takeWebScreenshotBase64(winiumdriver);
        ScreenshotHelper.captureScreenshotAllure(winiumdriver, "User clicks on "+arg0+" option to add blank document");
    }

    @Then("User verifies that {string} a new page for opened blank page is visible")
    public void userVerifiesThatANewPageForOpenedBlankPageIsVisible(String arg0) throws InterruptedException {
        Assert.assertTrue(demoWiniumAppPage.verifyScreen(arg0));
        ScreenshotHelper.takeWebScreenshotBase64(winiumdriver);
        ScreenshotHelper.captureScreenshotAllure(winiumdriver, "User verifies that "+arg0+" a new page for opened blank page is visible");
    }
}
