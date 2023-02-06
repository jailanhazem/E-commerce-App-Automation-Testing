package org.example.Pages;

import org.example.StepDef.D04_SocialLinks;
import org.example.StepDef.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P04_SocialLinks {
    public P04_SocialLinks() {
        PageFactory.initElements(Hooks.driver,this);
    }
    @FindBy(xpath = "/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[1]/a")
    public WebElement FB;
}
