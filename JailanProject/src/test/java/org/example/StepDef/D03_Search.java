package org.example.StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_Search;
import org.testng.asserts.SoftAssert;

public class D03_Search {
    P03_Search search= new P03_Search();
    @Given("user enter item name")
    public void user_enter_item_name() {

        search.searchBox.sendKeys("htc");
    }

    @When("user click on search button")
    public void userClickOnSearchButton() {
        search.searchBtn.click();

    }

    @Then("user check result")
    public void userCheckResult() {
        SoftAssert soft=new SoftAssert();
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q=htc"));
        soft.assertAll();
    }
}
