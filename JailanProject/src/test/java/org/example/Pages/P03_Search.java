package org.example.Pages;

import org.example.StepDef.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P03_Search {
    public P03_Search() {
        PageFactory.initElements(Hooks.driver , this );
    }
    @FindBy(xpath = "/html/body/div[6]/div[1]/div[2]/div[2]/form/input")
    public WebElement searchBox;

    @FindBy(xpath = "/html/body/div[6]/div[1]/div[2]/div[2]/form/button")
    public WebElement searchBtn;

}
