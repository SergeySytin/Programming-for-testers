package com.example.fw;

import org.openqa.selenium.By;

import com.example.tests.TestBase;

public class ApplicationManager {

	public void returnToGroupsPage() {
	    TestBase.driver.findElement(By.linkText("group page")).click();
	}

}
