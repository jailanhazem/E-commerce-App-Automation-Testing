package org.example.StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P01_Register;
import org.testng.asserts.SoftAssert;

public class D01_RegisterSteps {
    P01_Register register=new P01_Register();
    @Given("user go to register page")
    public void user_go_to_register_page() {

        register.registerLink.click();
    }

    @When("user select gender type")
    public void userSelectGenderType() {

        register.femaleGender.click();
    }

    @And("user enter first name")
    public void userEnterFirstName() {
        register.firstName.sendKeys("Jailan");

    }

    @And("user enter last name")
    public void userEnterLastName() {
        register.lastName.sendKeys("Hazem");

    }

    @And("user enter Email")
    public void userEnterEmail() {
        register.Email.sendKeys("jilanhazem@gmail.com");

    }

    @And("user enter password and confirm password")
    public void userEnterPasswordAndConfirmPassword() {
        register.password.sendKeys("jojo123");
        register.confPassword.sendKeys("jojo123");

    }

    @And("user click on register button")
    public void userClickOnRegisterButton() {
        register.regButton.click();
    }

    @Then("account is created successfully")
    public void accountIsCreatedSuccessfully() {
        SoftAssert soft=new SoftAssert();
        soft.assertTrue(register.result.getText().contains("Your registration completed\n"));
        soft.assertAll();
    }


}
