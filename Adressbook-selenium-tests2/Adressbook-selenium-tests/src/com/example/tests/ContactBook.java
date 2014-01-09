package com.example.tests;

import org.testng.annotations.Test;

public class ContactBook extends TestBase {
  @Test
  public void createContact() throws Exception {
    app.openMainPage();
    app.addNewContact();
    ContactDataParameter parameterObject = new ContactDataParameter();
    parameterObject.firstname = "FirstName";
    parameterObject.lastname = "LastName";
    parameterObject.address = "Address";
    parameterObject.homePhone = "12345678";
    parameterObject.mobilePhone = "987654321";
    parameterObject.workPhone = "567567";
    parameterObject.email= "mail@mail.ru";
    parameterObject.email2 = "mail2@mail.ru";
    parameterObject.bday = "6";
    parameterObject.bmonth = "April";
    parameterObject.byear = "1989";
    parameterObject.choseGroupName = "group name 1";
    parameterObject.address2 = "AdressSecondary";
    parameterObject.phone2 = "47474747";

                                                                                                    
        app.contactData(this, parameterObject);
    app.sumbitContact();
  }
    
  @Test
  public void createEmptyContact() throws Exception {
    app.openMainPage();
    app.addNewContact();
    ContactDataParameter parameterObject = new ContactDataParameter();
    parameterObject.firstname = "";
    parameterObject.lastname = "";
    parameterObject.address = "";
    parameterObject.homePhone = "";
    parameterObject.mobilePhone = "";
    parameterObject.workPhone = "";
    parameterObject.email= "";
    parameterObject.email2 = "";
    parameterObject.bday = "";
    parameterObject.bmonth = "";
    parameterObject.byear = "";
    parameterObject.choseGroupName = "";
    parameterObject.address2 = "";
    parameterObject.phone2 = "";
    app.sumbitContact();
  }
}