package com.upgenix.step_definitions;

import com.upgenix.pages.LoginPages;
import com.upgenix.utilities.BrowserUtils;
import com.upgenix.utilities.ConfigurationReader;
import com.upgenix.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class LoginStepDefinitions {

    LoginPages loginPages = new LoginPages();

    @Given("User is on the upgenix login page")
    public void user_is_on_the_upgenix_login_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }


    @When("User enter valid {string} and valid {string}")
    public void user_enter_valid_and_valid(String username, String password) {

        loginPages.emailInputBox.sendKeys(username);
        loginPages.passwordInputBox.sendKeys(password);


    }


    @When("User click to login button")
    public void user_click_to_login_button() {

        loginPages.logInButton.click();

    }


    @Then("User should see the title is {string}")
    public void user_should_see_the_title_is(String pageTitle) {

        BrowserUtils.waitFor(5);
        Assert.assertTrue(Driver.getDriver().getTitle().contains(pageTitle));

    }



    @When("User enter {string} and {string}")
    public void user_enter_and(String username1, String password2) {

        loginPages.emailInputBox.sendKeys(username1);
        loginPages.passwordInputBox.sendKeys(password2);

    }


    @Then("User should see {string} displayed")
    public void userShouldSeeDisplayed(String string) {

        BrowserUtils.waitFor(5);
        Assert.assertEquals(string,loginPages.wrongLoginPassword.getText());

        System.out.println("loginPages.wrongLoginPassword.getText() = " + loginPages.wrongLoginPassword.getText());

    }


    @When("User enter valid {string}")
    public void userEnterValid(String password2) {

        loginPages.passwordInputBox.sendKeys(password2);

    }

    @Then("User should see {string} message displayed")
    public void userShouldSeeMessageDisplayed(String arg0) {

        BrowserUtils.waitFor(5);
        String message1 = loginPages.emailInputBox.getAttribute("validationMessage");
        String message2 = loginPages.passwordInputBox.getAttribute("validationMessage");
        Assert.assertTrue(message1.equals(arg0)||message2.equals(arg0));



    }


    @When("User click {string} link")
    public void userClickLink(String arg1) {

        loginPages.resetPassword.click();
    }


    @When("User enter password {string}")
    public void userEnterPassword(String password3) {

        loginPages.passwordInputBox.sendKeys(password3);
    }

    @When("User enter password ,should see the password in bullet signs by default")
    public void userEnterPasswordShouldSeeThePasswordInBulletSignsByDefault() {

        Assert.assertTrue(loginPages.bulletPasswordSign.isDisplayed());

    }



    @When("User enter valid {string} and {string} press Enter Key")
    public void userEnterValidAndPressEnterKey(String username2, String password2) {

        loginPages.emailInputBox.sendKeys(username2,Keys.ENTER);
        loginPages.passwordInputBox.sendKeys(password2,Keys.ENTER);

    }




}
