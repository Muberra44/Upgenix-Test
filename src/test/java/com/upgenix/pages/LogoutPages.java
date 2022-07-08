package com.upgenix.pages;

import com.upgenix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPages {

    public LogoutPages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement userNameinTop;


    @FindBy(xpath = "//a[@data-menu='logout']")
    public WebElement logOutButton;

    @FindBy(className = "modal-title")
    public WebElement sessionExpiredMessage;



}
