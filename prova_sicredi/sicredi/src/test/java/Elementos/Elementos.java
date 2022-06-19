package Elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By btnSelectVersion = By.id("switch-version-select");
	private By btnV4Theme = By.cssSelector("#switch-version-select > option:nth-child(2)");
	private By btnAddCustomer = By.cssSelector("#gcrud-search-form > div.header-tools > div.floatL.t5 > a");
	private By campoName = By.id("field-customerName");
	private By campoLastName = By.id("field-contactLastName");
	private By campoContactFirstName = By.id("field-contactFirstName");
	private By campoPhone = By.id("field-phone");
	private By campoAddressLine1 = By.id("field-addressLine1");
	private By campoAddressLine2 = By.id("field-addressLine2");
	private By campoCity = By.id("field-city");
	private By campoState = By.id("field-state");
	private By campoPostal = By.id("field-postalCode");
	private By campoCountry = By.id("field-country");
	private By btnFrom = By.cssSelector("#field_salesRepEmployeeNumber_chosen > a > span");
	private By btnFixter = By.cssSelector("#field_salesRepEmployeeNumber_chosen > div > ul > li:nth-child(8)");
	private By campoCreditLimit = By.id("field-creditLimit");
	private By btnSave = By.id("form-button-save");
	private By validarMensagem = By.cssSelector("#report-success > p");
	private By btnColuna = By.cssSelector("#gcrud-search-form > div.scroll-if-required > table > thead > tr.filter-row.gc-search-row > td:nth-child(3) > input");
	private By btnActions = By.cssSelector("#gcrud-search-form > div.scroll-if-required > table > tbody > tr > td:nth-child(2) > div.only-desktops > div > button");
	private By btnDelete = By.cssSelector("#gcrud-search-form > div.scroll-if-required > table > tbody > tr > td:nth-child(2) > div.only-desktops > div > ul > li:nth-child(3) > a > span"); 
	private By validarMensagemDoDelete = By.cssSelector("body > div.container-fluid.gc-container > div.row > div.delete-confirmation.modal.fade.in.show > div > div > div.modal-body > p");
	private By btnClicarDeletePopPup = By.cssSelector("body > div.container-fluid.gc-container > div.row > div.delete-confirmation.modal.fade.in.show > div > div > div.modal-footer > button.btn.btn-danger.delete-confirmation-button");
	
	public By getBtnSelectVersion() {
		return btnSelectVersion;
	
	}
	public By getBtnV4Theme() {
		return btnV4Theme;
	
	}
	public By getBtnAddCustomer() {
		return btnAddCustomer;
	
	}
	public By getCampoName() {
		return campoName;

	}
	public By getCampoLastName() {
		return campoLastName;
	
	}
	public By getCampoContactFirstName() {
		return campoContactFirstName;
	
	}
	public By getCampoPhone() {
		return campoPhone;
	
	}
	public By getCampoAddressLine1() {
		return campoAddressLine1;
	
	}
	public By getCampoAddressLine2() {
		return campoAddressLine2;
	
	}
	public By getCampoCity() {
		return campoCity;
	
	}
	public By getCampoState() {
		return campoState;
	
	}
	public By getCampoPostal() {
		return campoPostal;
	
	}
	public By getCampoCountry() {
		return campoCountry;
	
	}
	public By getBtnFrom() {
		return btnFrom;
	
	}
	public By getBtnFixter() {
		return btnFixter;
	
	}
	public By getCampoCreditLimit() {
		return campoCreditLimit;
	
	}
	public By getValidarMensagem() {
		return validarMensagem;
	
	}
	public By getBtnSave() {
		return btnSave;
	}
	public By getBtnColuna() {
		return btnColuna;
	}
	public By getBtnActions() {
		return btnActions;
	}
	public By getBtnDelete() {
		return btnDelete;
	}
	public By getValidarMensagemDoDelete() {
		return validarMensagemDoDelete;
	}
	public By getBtnClicarDeletePopPup() {
		return btnClicarDeletePopPup;
	}
	
}
