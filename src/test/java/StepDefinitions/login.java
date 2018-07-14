package StepDefinitions;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import sun.security.jca.ProviderList;

import java.util.AbstractMap;

public class login {


    @When("^I click on login$")
    public void iClickOnLogin() throws Throwable {
    }

    @Given("^I navigate to the dev.giftrt.com$")
    public void iNavigateToTheDevGiftrtCom() throws Throwable {

        System.setProperty("webdriver.gecko.driver","c://workspace//libs//geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        // Open ToolsQA web site
        String appUrl = "http://www.giftrt.com";
        driver.get(appUrl);
    }

    @And("^I entered the username$")
    public void iEnteredTheUsername(String username) throws Throwable {


    }

    @And("^I entered the password$")
    public void iEnteredThePassword(String Password) throws Throwable {


    }

    @And("^i click on the login button$")
    public void iClickOnTheLoginButton() throws Throwable {

    }

    @Then("^I should be logged in$")
    public void iShouldBeLoggedIn() throws Throwable {

    }

    @And("^I entered invalid user name$")
    public void iEnteredInvalidUserName() throws Throwable {

    }

    @And("^I enter my password$")
    public void iEnterMyPassword() throws Throwable {

    }

    @Then("^I am not logged in$")
    public void iAmNotLoggedIn() throws Throwable {

    }

    @And("^I enter invalid password$")
    public void iEnterInvalidPassword() throws Throwable {

    }

    @And("^I entered my user name as \"([^\"]*)\"$")
    public void iEnteredMyUserNameAs(String arg0) throws Throwable {

    }

    @And("^I enter my password as \"([^\"]*)\"$")
    public void iEnterMyPasswordAs(String arg0) throws Throwable {

    }

    @Then("^I am logged in$")
    public void iAmLoggedIn() throws Throwable {

    }

    @And("^I log out$")
    public void iLogOut() throws Throwable {

    }
}
