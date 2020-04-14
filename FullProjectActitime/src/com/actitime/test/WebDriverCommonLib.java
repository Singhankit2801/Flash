package com.actitime.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverCommonLib extends BaseClass {
	/**
	 * @author singh
	 */
	public void WaitForPageLoad()
	{
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	/**
	 * 
	 * @param element
	 * @throws InterruptedException
	 */
	public void WaitForElementInGui(WebElement element) throws InterruptedException
	{
		int count=0;
		while(count<=20)
		{
			try {
				element.isEnabled();
			}
			catch(Exception e)
			{
				Thread.sleep(1000);
				count++;
			}
		}
	}
	
	/**
	 * 
	 * @param element
	 */
	public void WaitForElement(WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	/**
	 * 
	 * @param element
	 * @param text
	 */
	public void DropDownSelection(WebElement element,String text)
	{
		 Select sel=new Select(element);
		 sel.selectByVisibleText(text);
	}
	
	/**
	 * 
	 * @param element
	 * @param index
	 */
	public void DropDownSelection(WebElement element,int index)
	{
		 Select sel=new Select(element);
		 sel.selectByIndex(index);
	}
}
