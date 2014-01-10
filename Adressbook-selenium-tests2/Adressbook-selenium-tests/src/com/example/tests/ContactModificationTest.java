package com.example.tests;

import org.testng.annotations.Test;

public class ContactModificationTest extends TestBase{

	@Test
	public void deleteSomeGroup() {
		app.getNavigationHelper().openMainPage();
		app.getContactHelper().goToContactEditPage(1);
		ContactDataParameter contact = new ContactDataParameter();
		contact.firstname = "new firstname";
		contact.lastname = "new lastname";	
		app.getContactHelper().contactData(contact);
		app.getContactHelper().editContact();
		app.getContactHelper().goToHomePage();
	}
}
