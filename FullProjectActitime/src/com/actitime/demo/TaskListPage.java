package com.actitime.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	@FindBy (xpath="//div[.='Add New']")
	 private WebElement AddNewCustomDD;

	 @FindBy(xpath="//div[.='+ New Customer']")
	 private WebElement NewCustomerMenu;

	 @FindBy (xpath="//input[@placeholder='Enter Customer Name' and @class]")
	 private WebElement EnterCustomerNameTbx;

	 @FindBy(xpath="//div[.='- Select Customer -' and @class='emptySelection']")
	 private WebElement SelectCustomerDD;

	 @FindBy (xpath="//div[.='Our company' and @class='itemRow cpItemRow ']")
	 private WebElement Ourcompanyoption;

	 @FindBy(xpath="//div[.='Create Customer' ]")
	 private WebElement CreateCustomerBtn;
	
	 @FindBy(xpath="div[@class='titleEditButtonContainer']/div[@class='title']")
	 private WebElement ActualText;

	public TaskListPage(WebDriver driver){
		 PageFactory.initElements(driver, this);
		}
	 

	public WebElement getAddNewCustomDD() {
		return AddNewCustomDD;
	}

	public WebElement getNewCustomerMenu() {
		return NewCustomerMenu;
	}

	public WebElement getEnterCustomerNameTbx() {
		return EnterCustomerNameTbx;
	}

	public WebElement getSelectCustomerDD() {
		return SelectCustomerDD;
	}

	public WebElement getOurcompanyoption() {
		return Ourcompanyoption;
	}

	public WebElement getCreateCustomerBtn() {
		return CreateCustomerBtn;
	}
	 public WebElement getActualText() {
			return ActualText;
		}
}
