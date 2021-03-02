package com.wappier.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Set;

public class UserViewPage extends BasePage {

    @FindBy(xpath = "/html/body/wua-root/wua-layout/div/div/div[1]/wua-user-details/div/div/div[2]/div/div[2]/wua-user-apps-list/p-table/div/div/table/thead/tr")
    public Set<WebElement> appTableColumns;

    @FindBy(xpath = "/html/body/wua-root/wua-layout/div/div/div[1]/wua-user-details/div/div/div[2]/div/div[2]/wua-user-apps-list/p-table/div/div/table/tbody/tr[1]/td[3]/button[1]")
    public WebElement app1EditButton;

    @FindBy(xpath = "/html/body/wua-root/wua-layout/div/div/div[1]/wua-user-details/div/div/div[2]/div/div[2]/wua-user-apps-list/p-table/div/div/table/tbody/tr[1]/td[3]/button[2]")
    public WebElement app1DeleteButton;

    @FindBy(xpath = "/html/body/wua-root/wua-layout/div/div/div[1]/wua-user-details/div/div/div[3]/wua-user-detail-actions/button[1]")
    public WebElement userEditButton;

    @FindBy(xpath = "/html/body/wua-root/wua-layout/div/div/div[1]/wua-user-details/div/div/div[3]/wua-user-detail-actions/button[2]")
    public WebElement userDeleteButton;

    @FindBy(css = ".btn.btn-primary.btn-sm.ml-1.my-auto")
    public WebElement userListButton;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement nameInputBox;

    @FindBy(xpath = "//input[@name='country']")
    public WebElement countryInputBox;

    @FindBy(xpath = "(//input[@type='text'])[3]")
    public WebElement dateInputBox;

    @FindBy(xpath = "/html/body/wua-root/wua-layout/div/div/div[1]/wua-user-details/div/div/div[1]/h4")
    public WebElement userHeader;

    @FindBy(xpath = "/html/body/wua-root/wua-layout/div/div/div[2]/wua-history/wua-incidents-list/p-virtualscroller/div/div[2]/ul/cdk-virtual-scroll-viewport/div[1]/li/div/div[2]/p")
    public WebElement historyInfo;














}
