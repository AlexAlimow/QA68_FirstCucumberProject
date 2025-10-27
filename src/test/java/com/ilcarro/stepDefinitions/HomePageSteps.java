package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.ilcarro.pages.BasePage.driver;

public class HomePageSteps {
    HomePage home;

    @Given("User launches Chrome browser")
    public void launch_Chrome_browser() {
        home = new HomePage(driver);
        home.launchBrowser();
    }

    @When("User opens Home page")
    public void open_Home_page() {
        home.openUrl();
    }

    @Then("User verifies Home page title is displayed")
    public void verify_Home_page_title() {
        new HomePage(driver).isHomePageTitleDisplayed();
    }
}
