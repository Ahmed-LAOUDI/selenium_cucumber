package com.e2eTest.automation.step_definitions;



import com.e2eTest.automation.page_objects.AdminPage;
import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.SeleniumUtils;
import com.e2eTest.automation.utils.Setup;
import com.e2eTest.automation.utils.Validations;

import io.cucumber.java.en.When;

public class AdminStepDefinition {
	
	private AdminPage adminPage;
	private SeleniumUtils seleniumUtils;
	private Validations validations;
	private ConfigFileReader configFileReader;
	
	//AdminPage adminPage = new AdminPage();
	public AdminStepDefinition(){
		adminPage = new AdminPage();
		seleniumUtils = new SeleniumUtils();
		validations = new Validations();
		configFileReader = new ConfigFileReader();
	}

	@When("je clique sur le module admin")
	public void jeCliqueSurLeModuleAdmin()  {
		seleniumUtils.click(AdminPage.getBtnAdmin());
		
	}
	@When("je clique sur adduser")
	public void jeCliqueSurAdd() throws InterruptedException {
		Thread.sleep(5000);
		seleniumUtils.click(AdminPage.getBtnAdd());
	}
	@When("je rempli le formulaire")
	public void jeRempliLeFormulaire() throws InterruptedException {
		seleniumUtils.click(AdminPage.getuserRole()); 
		seleniumUtils.click(AdminPage.getuserRoleadmin());
		seleniumUtils.writeText(AdminPage.getEmployeeName(), configFileReader.getProperty("home.EmployeeName"));
		seleniumUtils.click(AdminPage.getEmployeeNameSelect());
		seleniumUtils.click(AdminPage.getStatus());
		seleniumUtils.click(AdminPage.getStatusSelect());
		seleniumUtils.click(AdminPage.getUserName());
		Thread.sleep(3000);
		seleniumUtils.writeText(AdminPage.getUserName(), configFileReader.getProperty("home.Username"));
		Thread.sleep(3000);
		seleniumUtils.writeText(AdminPage.getPassword(), configFileReader.getProperty("home.Password") );
		Thread.sleep(3000);
		seleniumUtils.writeText(AdminPage.getConfiPassword(), configFileReader.getProperty("home.Password"));
		Thread.sleep(3000);
		seleniumUtils.click(AdminPage.getBtnSave());
		Thread.sleep(3000);
	}
	
	@When("je clique sue save")
	public void jeCliqueSueSave() {
	 
	}



	



}
