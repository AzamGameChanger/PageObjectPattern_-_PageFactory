package com.codewithazam.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {
    WebDriver driver;

    public RediffLoginPage(WebDriver driver){
        this.driver = driver;
    }
    By username = By.cssSelector("[id='login1']");
    By password = By.xpath("//*[@name='passwd']");
    By go = By.cssSelector("[name='proceed']");
    By home = By.linkText("rediff.com");

    public WebElement emailId(){
       return driver.findElement(username);
    }
    public WebElement pass(){
        return driver.findElement(password);
    }
    public WebElement submit(){
        return driver.findElement(go);
    }
    public WebElement home(){
        return driver.findElement(home);
    }
}
