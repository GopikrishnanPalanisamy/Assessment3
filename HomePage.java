package com.salesforce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {
	
	public HomePage clickMenu() {
		click(locateElement(Locators.CLASS_NAME, "slds-icon-waffle"));
        reportStep(" Menu button clicked successfully","pass");
        return this;
    }
	public HomePage clickViewAll1() {
		click(locateElement(Locators.XPATH, "//button[text()='View All']"));
        reportStep(" View all button clicked successfully","pass");
        return this;

	}
	public HomePage searchText1() {
		clearAndType(locateElement(Locators.XPATH, "//label[text()='Search apps or items...']/following::input"), "Content");
        reportStep(" Search text entered successfully","pass");
        return this;

	}
	
	public MyContentPage clickContacts() {
		click(locateElement(Locators.XPATH, "//mark[text()='Content']"));
        reportStep(" Content link clicked successfully","pass");
        return new MyContentPage();

	}
	public MyIndividualPage selectIndividual() {
		WebElement clickIndividual = locateElement(Locators.XPATH, "//p[text()='Individuals']");
		act = new Actions(getDriver());
		act.moveToElement(clickIndividual).perform();
		clickIndividual.click();
        reportStep(" Search text entered successfully","pass");
        return new MyIndividualPage();

	}

}
