package com.e2eTest.automation.page_objects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class BuzzPage extends BasePage {

	public BuzzPage() {
		super(Setup.getDriver());
		// TODO Auto-generated constructor stub
	}
	/*Retrieve element*/ 
	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Buzz']")
	private static WebElement moduleBuzz; 
	
	@FindBy(how = How.XPATH, using = "//textarea[@placeholder=\"What's on your mind?\"]")
	private static WebElement buzzText;
	
	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	private static WebElement btnPost;
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Test automation']")
	private static WebElement checkTest;
	
	
	/*Methods */
	public void getModuleBuzz() {
		moduleBuzz.click();
	}
	
	public void getBuzzText(String buzz) {
		buzzText.sendKeys(buzz);

	}
	
	public void getBtnPost() {
		btnPost.click();
	}
	
	public String verifyBuzzCreated() {
		return checkTest.getText();
	}
}
