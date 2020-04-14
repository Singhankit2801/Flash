package com.actitime.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	 @FindBy(id="username")
	 private WebElement UNtbx;
	 @FindBy(name="pwd")
	 private WebElement PWtbx;
	 @FindBy(xpath="//div[.='Login ']")
	 private WebElement LgBtn;

	 public LoginPage(WebDriver driver){
	 PageFactory.initElements(driver, this);
	 }
	 
	 //business logic method
	 public void setLogin(String un,String pw) {
	  UNtbx.sendKeys(un);
	  PWtbx.sendKeys(pw);
	  LgBtn.click();
	 }
	}