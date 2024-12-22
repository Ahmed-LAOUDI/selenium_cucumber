package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class CreationBuzzPage extends BasePage {

	/*Retrieve element*/ 
	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Buzz']")
	private static WebElement moduleBuzz; 
	
	@FindBy(how = How.XPATH, using = "//textarea[@placeholder=\"What's on your mind?\"]")
	private static WebElement buzzText;
	
	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	private static WebElement btnPost;
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Test automation']")
	private static WebElement checkTest;
	
	
	public CreationBuzzPage() {
		super(Setup.getDriver());
	}

	/*Methods */
	public static WebElement getModuleBuzz2() {
		wait.waitForElementToBeVisible(moduleBuzz, 10);
		return moduleBuzz ;
	}
	
	public static WebElement getBuzzText() {
		wait.waitForElementToBeVisible(buzzText, 10);
		return buzzText ;
		//buzzText.sendKeys(buzz);

	}
	
	public static WebElement getBtnPost() {
		return btnPost ;
		//btnPost.click();
	}
	
	public static WebElement verifyBuzzCreated() {
		return checkTest ;
		//return checkTest.getText();
	}
}
