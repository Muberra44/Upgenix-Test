package com.upgenix.step_definitions;

import com.upgenix.pages.LoginPages;
import com.upgenix.pages.LogoutPages;
import com.upgenix.utilities.ConfigurationReader;
import com.upgenix.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LogoutStepDefinitions {

    LogoutPages logoutPages = new LogoutPages();
    LoginPages loginPages = new LoginPages();

    @Given("User is on the upgenix home page")
    public void userIsOnTheUpgenixHomePage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPages.emailInputBox.sendKeys(ConfigurationReader.getProperty("username"));
        loginPages.passwordInputBox.sendKeys(ConfigurationReader.getProperty("password"));
        loginPages.logInButton.click();

    }

    @Given("User should be able click log out button and ends up in login page")
    public void user_should_be_able_click_log_out_button_and_ends_up_in_login_page() {
       logoutPages.userNameinTop.click();
       logoutPages.logOutButton.click();
    }



    @Then("User should be able to not go to the home page again by clicking the step back button")
    public void userShouldBeAbleToNotGoToTheHomePageAgainByClickingTheStepBackButton() {

        Driver.getDriver().navigate().back();
    }


    @Then("User should see the alert is {string}")
    public void userShouldSeeTheAlertIs(String arg0) {

        Assert.assertEquals(arg0,logoutPages.sessionExpiredMessage.getText());

    }


}
