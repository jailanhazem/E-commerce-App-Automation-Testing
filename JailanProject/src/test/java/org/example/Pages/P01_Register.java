package org.example.Pages;

import org.example.StepDef.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P01_Register {
    public P01_Register() {
        PageFactory.initElements(Hooks.driver , this );

    }
    @FindBy(xpath ="/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")
    public WebElement registerLink;

    @FindBy(xpath ="/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[1]/div/span[2]/input")
    public WebElement femaleGender;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[2]/input")
    public WebElement firstName;

    @FindBy(xpath="/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[3]/input")
    public  WebElement lastName;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[5]/input")
    public WebElement Email;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[4]/div[2]/div[1]/input")
    public WebElement password;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[4]/div[2]/div[2]/input")
    public WebElement confPassword;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[5]/button")
    public WebElement regButton;

    @FindBy(xpath ="/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]")
    public WebElement result;

}



