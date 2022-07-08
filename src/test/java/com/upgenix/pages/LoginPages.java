package com.upgenix.pages;

import com.upgenix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPages {

    public LoginPages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "login")
    public WebElement emailInputBox;

    @FindBy(id = "password")
    public WebElement passwordInputBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement logInButton;


    @FindBy(xpath = "//p")
    public WebElement wrongLoginPassword;

    @FindBy(xpath = "//a[.='Reset Password']")
    public WebElement resetPassword;


    @FindBy(xpath = "//input[@type='password']")
    public WebElement bulletPasswordSign;



}
