package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class LogoutPage extends BasePage {

	public LogoutPage() {
		super(Setup.getDriver());
		// TODO Auto-generated constructor stub
	}
		/*Retrieve element*/ 
		
		@FindBy(how = How.XPATH, using = "//span[@class='oxd-userdropdown-tab']")
		private static WebElement btnProfil ; 
		
		
		@FindBy(how = How.XPATH, using = "//a[normalize-space()='Logout']")
		private static WebElement btnLogout; 
		
		/*Methods */ 
		public void getbtnProfil() {
		 btnProfil.click();
	}

		public void getbtnLogout() {
			btnLogout.click();
		}
}
