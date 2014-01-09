package com.example.tests;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {
  @Test
  public void testNonEmptyGroupCreation() throws Exception {
        app.openMainPage();
    app.gotoGroupsPage();
    app.initGroupCreation();
    GroupData group = new GroupData();
    group.groupName = "group name 1";
    group.groupHeader = "group header 1";
    group.groupFooter = "group footer 1";
        app.fillGroupForm(this, group);
    app.submitGroupCreation();
    app.returnToGroupsPage();
  }
  
  @Test
  public void testEmptyGroupCreation() throws Exception {
        app.openMainPage();
    app.gotoGroupsPage();
    app.initGroupCreation();
    app.fillGroupForm(this, new GroupData("", "", ""));
    app.submitGroupCreation();
    app.returnToGroupsPage();
  }
}