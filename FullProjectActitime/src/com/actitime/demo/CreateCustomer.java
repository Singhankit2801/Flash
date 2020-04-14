package com.actitime.demo;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.actitime.test.BaseClass;
		
@Listeners(com.actitime.test.ListenerImplementation.class)
public class CreateCustomer extends BaseClass {
	@Test
	public void testCreateCustomer() throws Exception  {
	 //before this
	 HomePage h=new HomePage(driver);
	 h.clickOnTaskTab();
	 TaskListPage t=new TaskListPage(driver);
	 t.getAddNewCustomDD().click();
	 t.getNewCustomerMenu().click();
	 String Etext = f.getExcelData("./Data/DDTExcel.xlsx","Sheet1", 1, 2);
	 t.getEnterCustomerNameTbx().sendKeys(Etext);
	t.getSelectCustomerDD().click();
	t.getOurcompanyoption().click();
	t.getCreateCustomerBtn().click();
	
	String AText = t.getActualText().getText();
	Assert.assertEquals(AText, Etext);
	
	
	//why u using extends why not object creation of another class
	}
}

