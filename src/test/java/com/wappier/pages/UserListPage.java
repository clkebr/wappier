package com.wappier.pages;

import com.wappier.utilities.BrowserUtils;
import com.wappier.utilities.Driver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class UserListPage  extends BasePage{

    @FindBy(xpath = "/html/body/wua-root/wua-layout/div/div/div[1]/wua-users/wua-users-list/p-table/div/div/div/div[1]/div/table/thead/tr[2]")
    public List<WebElement> tableColumns;

    @FindBy(xpath = "/html/body/wua-root/wua-layout/div/div/div[1]/wua-users/wua-users-list/p-table/div/div/div/div[2]/table/tbody/tr")
    public List<WebElement> tableBody;

    @FindBy(xpath = "/html/body/wua-root/wua-layout/div/div/div[1]/wua-users/wua-users-list/div/button")
    public WebElement addUserButton;

    @FindBy(xpath = "/html/body/wua-root/wua-layout/div/div/div[1]/wua-user-details/div/div/div[2]/div/div/wua-user-info/div/div/input[1]")
    public WebElement fileInput;

    @FindBy(xpath = "//button[.='Save']")
    public WebElement saveButton;

    @FindBy(xpath = "/html/body/wua-root/wua-layout/div/div/div[1]/wua-user-details/div/div/div[2]/div/div/wua-user-info/div/div/p-calendar/span/div/div/div[1]/a[1]/span")
    public WebElement before;

    @FindBy(xpath = "/html/body/wua-root/wua-layout/div/div/div[1]/wua-user-details/div/div/div[2]/div/div/wua-user-info/div/div/p-calendar/span/div/div/div[2]/table/tbody/tr[1]/td")
    public List<WebElement> pickerDate;

    @FindBy(xpath = "/html/body/wua-root/wua-layout/div/div/div[1]/wua-users/wua-users-list/p-table/div/div/div/div[1]/div/table/thead/tr[1]/th/h4")
    public WebElement userHeader;

    @FindBy(xpath = "//span[@class='text-muted']")
    public List<WebElement> historyDates;

    @FindBy(xpath = "/html/body/wua-root/wua-layout/div/div/div[2]/wua-history/wua-incidents-list/p-virtualscroller/div/div[2]/ul/cdk-virtual-scroll-viewport/div[1]/li[2]/div/div[2]/p")
    public WebElement historyChange;

    public WebElement sortTable(String ıcon){
        int index=0;

        switch (ıcon) {
            case "nameIcon":
                index = 2;
                break;
            case "countryIcon":
                index = 4;
                break;
            case "appNumIcon":
                index = 5;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + ıcon);
        }
        String xpath="/html/body/wua-root/wua-layout/div/div/div[1]/wua-users/wua-users-list/p-table" +
                "/div/div/div/div[1]/div/table/thead/tr[2]/th["+index+"]";
        Driver.get().findElement(By.xpath(xpath)).click();

        return Driver.get().findElement(By.xpath(xpath));

    }

    public boolean isTableNULL(){
        boolean flag=false;

        for (int i = 1; i < tableBody.size(); i++) {
            for (int j = 2; j < tableColumns.size(); j++) {
                WebElement element = Driver.get().findElement(By.xpath("/html/body/wua-root/wua-layout/div/div/div[1]/wua-users" +
                                                            "/wua-users-list/p-table/div/div/div/div[2]/table/tbody/tr[" + i + "]/td[" + j + "]"));
                if(element.getText().isEmpty()){
                    flag=true;
                    break;
                }

            }
        }
        return flag;
    }

    public List<WebElement> getTableValue(){
        List<WebElement> eachCell= new ArrayList<>();
        for (int i = 1; i < tableBody.size(); i++) {
            for (int j = 2; j < tableColumns.size(); j++) {
                WebElement element = Driver.get().findElement(By.xpath("/html/body/wua-root/wua-layout/div/div/div[1]/wua-users" +
                        "/wua-users-list/p-table/div/div/div/div[2]/table/tbody/tr[" + i + "]/td[" + j + "]"));
                eachCell.add(element);
            }
        }
        System.out.println("BrowserUtils.getElementsText(eachCell) = " + BrowserUtils.getElementsText(eachCell));
        return eachCell;
    }




    public List<String> getTableColumn() {
        List<String> columnList= new ArrayList<>();

        for (WebElement element : tableColumns) {
            columnList.add(element.getText());
        }
        System.out.println(columnList.toString());
        return columnList;

    }
    public List<String> getColumnValue(String columnName){

        int index=0;
        List<String> columnList= new ArrayList<>();
        switch (columnName.toLowerCase()){
            case "name":
                index=2;
                break;
            case "country":
                index=4;
                break;
            case "number of apps":
                index=5;
                break;
        }
        for (int i = 1; i < tableBody.size(); i++) {
             columnList.add(Driver.get().findElement(By.xpath("/html/body/wua-root/wua-layout/div/div/div[1]/wua-users/wua-users" +
                     "-list/p-table/div/div/div/div[2]/table/tbody/tr["+i+"]/td["+index+"]")).getText());

        }
       return columnList;
    }

    public List<WebElement> getRow(){
        List<WebElement> rowList= new ArrayList<>();
        for (int i = 1; i < tableBody.size(); i++) {
            rowList.add(Driver.get().findElement(By.xpath("/html/body/wua-root/wua-layout/div/div/div[1]/wua-users/" +
                                        "wua-users-list/p-table/div/div/div/div[2]/table/tbody/tr["+i+"]")));
        }
        return rowList;
    }

    public void selectDate(String str){

        String date,month,year;

        String dateArray[]= str.split(" ");
        date=dateArray[0];
        month=dateArray[1];
        year=dateArray[2];
        BrowserUtils.waitForClickablility(before,3);
        String pickerYear = Driver.get().findElement(By.cssSelector(".ui-datepicker-year.ng-tns-c92-0.ng-star-inserted")).getText();

       String pickerMonth= Driver.get().findElement(By.cssSelector(".ui-datepicker-month.ng-tns-c92-0.ng-star-inserted")).getText();


        do{
            before.click();
            pickerYear = Driver.get().findElement(By.cssSelector(".ui-datepicker-year.ng-tns-c92-0.ng-star-inserted")).getText();
        }while(!(pickerYear.equalsIgnoreCase(year)));
            BrowserUtils.waitFor(4);
        do{
            before.click();
            pickerMonth= Driver.get().findElement(By.cssSelector(".ui-datepicker-month.ng-tns-c92-0.ng-star-inserted")).getText();
        }while (!(pickerMonth.equals(month)));

        for (WebElement calender : pickerDate) {
            String calDate=calender.getText();
           if(calDate.equals(date)){
             BrowserUtils.clickWithJS(calender);
             break;
           }
        }

    }













}
