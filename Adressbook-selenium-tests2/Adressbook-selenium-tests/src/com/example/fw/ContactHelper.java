package com.example.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.example.tests.ContactDataParameter;
import com.example.tests.TestBase;

public class ContactHelper extends HelperBase{

	public ContactHelper(ApplicationManager manager) {
		super(manager);
	}

	public void sumbitContact() {
		click(By.name("submit"));
	}

	public void contactData(ContactDataParameter parameterObject) {
		type(By.name("firstname"), parameterObject.firstname);
		type(By.name("lastname"), parameterObject.lastname);
		type(By.name("address"), parameterObject.address);
		type(By.name("home"), parameterObject.homePhone);
		type(By.name("mobile"), parameterObject.mobilePhone);
		type(By.name("work"), parameterObject.workPhone);
		type(By.name("email"), parameterObject.email);
		type(By.name("email2"), parameterObject.email2);
	    selectByText(By.name("bday"), parameterObject.bday);
	    selectByText(By.name("bmonth"), parameterObject.bmonth);
		type(By.name("byear"), parameterObject.byear);
	    selectByText(By.name("new_group"), parameterObject.choseGroupName);
		type(By.name("address2"), parameterObject.address2);
		type(By.name("phone2"), parameterObject.phone2);
	}


	public void addNewContact() {
		click(By.linkText("add new"));
	}

	
	public void goToContactEditPage(int index){
			selectContactByIndex(index);
			selectEditButton(index);
	}

	private void selectEditButton(int index) {
		click(By.xpath("//a[starts-with(@href,'edit.php?id')][" + index + "]"));
	}

	private void selectContactByIndex(int index) {
		click(By.xpath("//input[@name='selected[]'][" + index + "]"));
	}
	
	public void removeContact() {
		click(By.xpath("//input[@name='update'][@value='Delete']"));		
	}

	public void goToHomePage() {
		click(By.linkText("home page"));		
	}

	public void editContact() {
		click(By.xpath("//input[@name='update'][@value='Update']"));
		
	}
}
