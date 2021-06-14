package com.codewithazam.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPagePF {
    WebDriver driver;

    public RediffLoginPagePF(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "[id='login1']")
    WebElement username;

    @FindBy(xpath ="//*[@name='passwd']")
    WebElement  password;

    @FindBy(css = "[name='proceed']")
    WebElement go;

    @FindBy(linkText = "rediff.com")
    WebElement home;

    public WebElement emailId(){
       return username;
    }
    public WebElement pass(){
        return password;
    }
    public WebElement submit(){
        return go;
    }
    public WebElement home(){
        return home;
    }
}
