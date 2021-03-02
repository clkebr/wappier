package com.wappier.step_definitions;

import com.google.common.collect.Ordering;
import com.wappier.pages.UserListPage;
import com.wappier.pages.UserViewPage;
import com.wappier.utilities.BrowserUtils;
import com.wappier.utilities.ConfigurationReader;
import com.wappier.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;


public class userManagement {

    UserListPage userListPage=new UserListPage();
    UserViewPage userViewPage= new UserViewPage();

    @Given("go to url")
    public void go_to_url() {

        Driver.get().get(ConfigurationReader.get("url"));

    }
    @When("user click add user button")
    public void user_click_add_user_button() {
        BrowserUtils.waitForClickablility(userListPage.addUserButton,20);
        userListPage.addUserButton.click();


    }

    @Then("user can upload avatar")
    public void user_can_upload_avatar() {
        BrowserUtils.clickWithJS(userListPage.fileInput);

        StringSelection selection= new StringSelection(new File("userAvatar.jpg").getAbsolutePath());
        BrowserUtils.waitFor(3);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
        BrowserUtils.waitFor(3);

        try {
            Robot robot= new Robot();
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (Exception e) {
            System.out.println("Ignore is related with upload avatar");
        }

    }

    @Then("user can write {string} as user's name")
    public void user_can_write_as_user_s_name(String name) {
        userViewPage.nameInputBox.clear();
        userViewPage.nameInputBox.sendKeys(name);
    }

    @Then("user can write {string} as user's country")
    public void user_can_write_as_user_s_country(String country) {
        userViewPage.countryInputBox.sendKeys(country);
    }

    @Then("user can select {string} user's birthdate")
    public void user_can_select_user_s_birthdate(String date) {
        userViewPage.dateInputBox.click();
        BrowserUtils.waitFor(3);
        userViewPage.dateInputBox.clear();
        BrowserUtils.waitFor(3);
        userListPage.selectDate(date);
    }

    @Then("user able to see {string} user on userlist table")
    public void user_able_to_see_user_on_userlist_table(String userName) {
        List<String> actualTable = BrowserUtils.getElementsText(userListPage.getTableValue());
        assertTrue(actualTable.contains(userName));

    }

    @Then("user able to click save button")
    public void user_able_to_click_save_button() {
        userListPage.saveButton.click();
    }


    @When("user can see there is not null value on the table")
    public void user_can_see_there_is_not_null_value_on_the_table() {
        assertFalse(userListPage.isTableNULL());
    }



    @When("user can see headers following below")
    public void user_can_see_headers_following_below( List<String> options) {
        System.out.println(options.toString());
       assertEquals(options,userListPage.getTableColumn());
    }

    @Then("user can not to see {string} new user on userlist table")
    public void user_can_not_to_see_new_user_on_userlist_table(String name) {
        assertFalse(BrowserUtils.getElementsText(userListPage.tableBody).contains(name));
    }

    @When("user click on {string} icon")
    public void user_click_on_icon (String icon) {
       BrowserUtils.clickWithJS( userListPage.sortTable(icon));
    }

    @Then("user can sort the table based on {string}")
    public void user_can_sort_the_table_based_on(String columnName) {
        System.out.println(userListPage.getColumnValue(columnName));
       assertTrue(Ordering.natural().isOrdered(userListPage.getColumnValue(columnName)) || Ordering.natural().reverse().isOrdered(userListPage.getColumnValue(columnName)));
    }

    @When("user hover over each row")
    public void user_hover_over_each_row() {
        for (WebElement row : userListPage.getRow()) {
            BrowserUtils.hover(row);
        }
    }

    @When("user click on {string}")
    public void user_click_on(String name) {
        for (WebElement webElement : userListPage.getTableValue()) {
            if(webElement.getText().equals(name)){
                System.out.println("webElement.getText() = " + webElement.getText());
                webElement.click();
            }
        }
    }
    @Then("user should able to see {string} as header on userView page")
    public void user_should_able_to_see_as_header_on_userView_page(String name) {
        
        String actualHeader = userViewPage.userHeader.getText();
        System.out.println("actualHeader = " + actualHeader);
        assertEquals(actualHeader, name);

    }

    @When("user click list button")
    public void user_click_list_button() {
       BrowserUtils.waitFor(2);
        userViewPage.userListButton.click();
       BrowserUtils.waitFor(2);
    }

    @Then("user is on userListPage")
    public void user_is_on_userListPage() {
        String actualHeader= userListPage.userHeader.getText();
        assertEquals(actualHeader,"Users list");
    }


    @Then("user click edit button")
    public void user_click_edit_button() {
       userViewPage.userEditButton.click();
    }

    @Then("history table contains {string}")
    public void history_table_contains(String change) {
        String actualInfo= userViewPage.historyInfo.getText();
        assertTrue(actualInfo.contains(change));
    }


    @Then("user can go userList page by clicking list button")
    public void user_can_go_userList_page_by_clicking_list_button() {
      userViewPage.userListButton.click();
    }

    @Then("user can see {string} on history on userList page")
    public void user_can_see_on_history_on_userList_page(String change) {
        String actualHistory = userListPage.historyChange.getText();
        assertTrue(actualHistory.contains(change));

    }












}
