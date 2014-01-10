package com.example.tests;

	import org.testng.annotations.Test;

	public class ContactRemovalTest extends TestBase{

		@Test
		public void deleteSomeGroup() {
			app.getNavigationHelper().openMainPage();
			app.getContactHelper().goToContactEditPage(1);
			app.getContactHelper().removeContact();
			app.getContactHelper().goToHomePage();
		}
		
	
}
