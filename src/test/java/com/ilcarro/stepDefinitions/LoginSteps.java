package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.HomePage;
import com.ilcarro.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ilcarro.pages.BasePage.driver;

public class LoginSteps {

    @And("User clicks on Log in link")
    public void click_on_Login_link() {
        new HomePage(driver).clickOnLoginLink();
    }

    @And("User enters correct data")
    public void enter_correct_data() {
        new LoginPage(driver).enterData("gorlum007user@gmail.com", "TestTest007!");
    }

    @And("User clicks on Yalla button")
    public void click_on_Yalla_Button() {
        new LoginPage(driver).clickOnYalla();
    }

    @Then("User verifies Success message text")
    public void verify_Success_message_text() {
        new LoginPage(driver).isMessageTextDisplayed("Logged in success");
    }

    @And("User quites browser")
    public void quite_browser() {
        new HomePage(driver).quiteBrowser();
    }

    @And("User enters correct email and wrong password")
    public void enters_wrong_password(DataTable table) {
        new LoginPage(driver).enterWrongData(table);
    }

    @Then("User verifies Error message text")
    public void verify_Error() {
        new LoginPage(driver).isMessageTextDisplayed("Login or Password incorrect");
    }
}
