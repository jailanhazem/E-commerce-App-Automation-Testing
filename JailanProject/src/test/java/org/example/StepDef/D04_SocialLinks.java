package org.example.StepDef;

import com.github.dockerjava.api.model.Links;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.Pages.P04_SocialLinks;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;

public class D04_SocialLinks {
    P04_SocialLinks links=new P04_SocialLinks();

    @Given("user can open facebook")
    public void user_can_open_facebook() throws InterruptedException {
        links.FB.click();
        Thread.sleep(2000);

    }

    @Then("User get result")
    public void userGetResult() throws InterruptedException {
        Thread.sleep(2000);
        Hooks.driver.getWindowHandles();
        ArrayList<String> Tabs= new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(Tabs.get(1));
        SoftAssert soft =new SoftAssert();
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://web.facebook.com/nopCommerce?_rdc=1&_rdr"));
        soft.assertAll();
        Hooks.driver.close();
        Hooks.driver.switchTo().window(Tabs.get(0));
    }
}
