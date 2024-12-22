package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class PimPage extends BasePage {

	/*Retrieve element*/ 
	@FindBy(how = How.XPATH, using = "//a[contains(@class, 'oxd-main-menu-item') and span[text()='PIM']]")
	private static WebElement modulePim; 
	
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Add']")
	private static WebElement btnAdd; 
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='First Name']")
	private static WebElement FirstName;
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Middle Name']")
	private static WebElement MiddleName;
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Last Name']")
	private static WebElement LastName;
	
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Save']")
	private static WebElement BtnSave;
	
	@FindBy(how = How.XPATH, using = "//h6[normalize-space()='Personal Details']")
	private static WebElement PersonalDetails;
	
	public PimPage() {
		super(Setup.getDriver());
		// TODO Auto-generated constructor stub
	}

	public static WebElement getModulePim() {
		wait.waitForElementToBeClickable(modulePim, 10);
		return modulePim;
	}
	public static WebElement getBtnAdd() {
		wait.waitForElementToBeClickable(btnAdd, 10);
		return btnAdd;
	}
	public static WebElement getSaisiFirstName() {
		wait.waitForElementToBeClickable(FirstName, 10);
		return FirstName;
	}
	public static WebElement getMiddleName() {
		wait.waitForElementToBeClickable(MiddleName, 10);
		return MiddleName;
	}
	public static WebElement getLastName() {
		wait.waitForElementToBeClickable(LastName, 10);
		return LastName;
	}
	public static WebElement getBtnSave() {
		wait.waitForElementToBeClickable(BtnSave, 10);
		return BtnSave;
	}
	public static WebElement getPersonalDetails() throws InterruptedException {
		Thread.sleep(5000);
		return PersonalDetails;
	}





}
