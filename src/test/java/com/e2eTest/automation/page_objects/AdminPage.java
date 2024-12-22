package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class AdminPage extends BasePage {

	/* Retrieve element */
	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Admin']")
	private static WebElement btnAdmin;
	
	/* @FindBy(how = How.XPATH, using = "//a[@class='oxd-main-menu-item active']//span[1]")
	private static WebElement btnAdmin;*/

	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Add']")
	private static WebElement btnAdd;

	@FindBy(how = How.XPATH, using = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")
	private static WebElement userRole;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Admin')]")
	private static WebElement userRoleadmin;
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Type for hints...']")
	private static WebElement employeeName;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Ranga  Akunuri')]")
	private static WebElement employeeNameSelect;
	
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'-- Select --')]")
	private static WebElement Status;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Enabled')]")
	private static WebElement StatusSelect;
	
	@FindBy(how = How.XPATH, using = "//*[@autocomplete='off']")
	private static WebElement userName;
	
	@FindBy(how = How.XPATH, using = "//div[@class='oxd-grid-item oxd-grid-item--gutters user-password-cell']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']")
	private static WebElement password;
	
	@FindBy(how = How.XPATH, using = "//input[contains(@class, 'oxd-input') and contains(@class, 'oxd-input--active') and not(contains(@class, 'oxd-input--error')) and @type='password']")
	private static WebElement ConfiPassword;
	
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Save']")
	private static WebElement btnSave;
	
	public AdminPage() {
		super(Setup.getDriver());
		// TODO Auto-generated constructor stub
	}

	/* Methods */
	public static WebElement getBtnAdmin() {
		wait.waitForElementToBeClickable(btnAdmin, 10);
		return btnAdmin;
		// btnAdmin.click();
	}

	public static WebElement getBtnAdd() {
		wait.waitForElementToBeVisible(btnAdd, 10);
		return btnAdd;
		// btnAdd.sendKeys(usrn);

	}

	public static WebElement getuserRole() {
		wait.waitForElementToBeVisible(userRole, 10);
		return userRole;
		// userRole.click();
	}
	
	public static WebElement getuserRoleadmin() {
		wait.waitForElementToBeVisible(userRoleadmin, 10);
		return userRoleadmin;
		// userRole.click();
	}
	
	public static WebElement getEmployeeName() {
		wait.waitForElementToBeVisible(employeeName, 10);
		return employeeName;
		// userRole.click();
	}
	
	public static WebElement getEmployeeNameSelect() {
		wait.waitForElementToBeVisible(employeeNameSelect, 10);
		return employeeNameSelect;
		// userRole.click();
		
	}
	
	public static WebElement getStatus() {
		wait.waitForElementToBeVisible(Status, 10);
		return Status;
		// userRole.click();
	}
	
	public static WebElement getStatusSelect() {
		wait.waitForElementToBeVisible(StatusSelect, 10);
		return StatusSelect;
		// userRole.click();
	}

	public static WebElement getUserName() {
		wait.waitForElementToBeVisible(userName, 10);
		return userName;
		// userRole.click();
	}
	
	public static WebElement getPassword() {
		wait.waitForElementToBeVisible(password, 10);
		return password;
		// userRole.click();
	}
	
	public static WebElement getConfiPassword() {
		wait.waitForElementToBeVisible(ConfiPassword, 10);
		return ConfiPassword;
		// userRole.click();
	}
	
	public static WebElement getBtnSave() {
		wait.waitForElementToBeVisible(btnSave, 10);
		return btnSave;
		// userRole.click();
	}
}
