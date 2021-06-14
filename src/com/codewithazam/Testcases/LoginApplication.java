package com.codewithazam.Testcases;

import com.codewithazam.objectrepository.RediffHomePagePF;
import com.codewithazam.objectrepository.RediffLoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginApplication {

    @Test
    public void Login(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        RediffLoginPage login = new RediffLoginPage(driver);
        login.emailId().sendKeys("hello");
        login.pass().sendKeys("hello");
        login.submit().click();
        login.home().click();
        RediffHomePagePF home = new RediffHomePagePF(driver);
        home.search().sendKeys("rediff");
        home.sub().click();

    }
}
