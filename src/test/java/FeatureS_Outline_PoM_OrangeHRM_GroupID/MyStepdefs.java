package FeatureS_Outline_PoM_OrangeHRM_GroupID;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs extends Utils
{
    HomePage homePage = new HomePage();
    HomePageResultPage homePageResultPage = new HomePageResultPage();

    @Given("^user is on home page$")
    public void userIsOnHomePage()
    {
        homePageResultPage.verifyIsOnHomepage();
    }

    @When("^user use \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userUseAnd(String username, String password)
    {
        homePage.enterInvalidLoginInformation(username,password);
    }

    @Then("^user should able to see successful message\"([^\"]*)\"$")
    public void userShouldAbleToSeeSuccessfulMessage(String login_message)
    {
        homePageResultPage.verifyInvalidLogin(login_message);
    }

    @When("^user enters valid credentials$")
    public void userEntersValidCredentials()
    {
        homePage.enterValidLoginInformation();
    }

    @Then("^user should able to login successfully$")
    public void userShouldAbleToLoginSuccessfully()
    {
        homePageResultPage.verifyValidLogin("Dashboard");
    }
}
