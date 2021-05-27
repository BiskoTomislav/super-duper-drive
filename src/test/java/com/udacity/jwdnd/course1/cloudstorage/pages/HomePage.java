package com.udacity.jwdnd.course1.cloudstorage.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(css="#username")
    private WebElement usernameField;

    public HomePage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

}
