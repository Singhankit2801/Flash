package com.actitime.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.demo.HomePage;

	public class BaseClass {
		static{
			System.setProperty("webdriver.chrome.driver", ".\\src\\Driver\\chromedriver.exe");
			System.setProperty("webdriver.gecko.driver", ".\\src\\Driver\\geckodriver.exe");
		 }
	   public WebDriver driver;
	   
	   //Globally Object Creation of FileLib class
	   public FileLib f=new FileLib();
	   @BeforeTest
	   public void OpenBrowser() throws Exception {
	 	String Browser=f.getPropertyFileData("browser");
	 	if(Browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
	 	else if(Browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   }
	   @AfterTest
		public void closeBrowser() {
		  driver.close(); 
		 }
	   
		 @BeforeMethod
	  public void login() throws Exception {
		  String URL = f.getPropertyFileData("url");
		  String UN = f.getPropertyFileData("username");
		  String PW = f.getPropertyFileData("password");
		  driver.get(URL);
		  driver.findElement(By.id("username")).sendKeys(UN);
		  driver.findElement(By.name("pwd")).sendKeys(PW);
		  driver.findElement(By.xpath("//div[.='Login ']")).click();
		 }
		 @AfterMethod
		 public void logout() throws InterruptedException {
			  Thread.sleep(3000);
			HomePage h=new HomePage(driver);
			 h.clickOnLogout();
		 }
	}

