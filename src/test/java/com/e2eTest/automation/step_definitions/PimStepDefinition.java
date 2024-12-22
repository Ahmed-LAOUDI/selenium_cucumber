package com.e2eTest.automation.step_definitions;

import com.e2eTest.automation.page_objects.ConnexionPage;
import com.e2eTest.automation.page_objects.PimPage;
import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.SeleniumUtils;
import com.e2eTest.automation.utils.Validations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PimStepDefinition {
	
	private PimPage pimPage;
	private SeleniumUtils seleniumUtils;
	private Validations validations;
	private ConfigFileReader configFileReader;
	
	public PimStepDefinition() {
		pimPage = new PimPage();
		seleniumUtils = new SeleniumUtils();
		validations = new Validations();
		configFileReader = new ConfigFileReader();
	}
	
	@When("Je navigue vers le module PIM")
	public void jeNavigueVersLeModulePIM() {
	  seleniumUtils.click(PimPage.getModulePim());
	}
	@When("Je clique sur le bouton Add Employee")
	public void jeCliqueSurLeBoutonAddEmployee() {
	   seleniumUtils.click(PimPage.getBtnAdd());
	}
	@When("Je remplis les informations {string} dans le champ firstname")
	public void jeRemplisLesInformationsDansLeChampFirstname(String string) {
	   seleniumUtils.writeText(PimPage.getSaisiFirstName(), string );
	   seleniumUtils.writeText(PimPage.getMiddleName(), configFileReader.getProperty("home.MiddleName"));
	  
	  
	}
	@When("Je remplis les informations {string} dans le champ Lastname")
	public void jeRemplisLesInformationsDansLeChampLastnameAndJeCliqueSurLeBoutonSave(String string) {
		 seleniumUtils.writeText(PimPage.getLastName(), string);
	}
	
	@When("Je clique sur le bouton Save")
	public void JeCliqueSurLeouBtonSave() {
		 seleniumUtils.click(PimPage.getBtnSave());
	}
	@Then("je me regirige vers la page {string}")
	public void jeMeRegirigeVersLaPage(String text) throws InterruptedException {
		validations.assertEquals(PimPage.getPersonalDetails(), text);
		Thread.sleep(8000);
	}



	
	
	
	
	
}
