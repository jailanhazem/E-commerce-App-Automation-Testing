package org.example.StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.example.Pages.P02_LogIn;

public class D02_LogIn {
        P02_LogIn login=new P02_LogIn();
        @Given("user go to login page")
        public void userGoToLoginPage() {
            login.loginLink.click();
        }
    @When("user enter loginEmail")
    public void userEnterLoginEmail() {
        login.Email.sendKeys("jilanhazem@gmail.com");
    }

        @When("user enter password")
        public void userEnterPassword() {
            login.password.sendKeys("jojo123");
        }
    @And("user select remember me")
    public void userSelectRememberMe() {
        login.rememberMe.click();
    }

    @And("user click on login button")
    public void userClickOnLoginButton() {
        login.loginButton.click();
    }

}
