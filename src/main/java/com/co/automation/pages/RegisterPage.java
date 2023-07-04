package com.co.automation.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://automationexercise.com/")
public class RegisterPage extends PageObject {
    @FindBy (xpath = "//a[normalize-space()='Signup / Login']")
    WebElement SINGUP_LOGIN;

    @FindBy (xpath = "//input[@placeholder='Name']")
    WebElement NAME;

    @FindBy (xpath = "//input[@data-qa='signup-email']")
    WebElement EMAIL;

    @FindBy (xpath = "//button[normalize-space()='Signup']")
    WebElement BOTON_SINUNP;

    @FindBy (xpath = "//input[@id='id_gender1']")
    WebElement TITLE;
    @FindBy (xpath = "//input[@id='password']")
    WebElement PASSWORD;

    @FindBy(id = "days")
    private WebElementFacade DAY;

    @FindBy(id = "months")
    private WebElementFacade MONTH;

    @FindBy(id = "years")
    private WebElementFacade YEAR;

    @FindBy (xpath = "//input[@id='newsletter']")
    WebElement NEWS;
    @FindBy (xpath = "//input[@id='first_name']")
    WebElement FIRTSNAME;

    @FindBy (xpath = "//input[@id='last_name']")
    WebElement LASTNAME;
    @FindBy (xpath = "//input[@id='company']")
    WebElement COMPANY;

    @FindBy (xpath = "//input[@id='address1']")
    WebElement ADDRESS;

    @FindBy (xpath = "//input[@id='state']")
    WebElement STATE;

    @FindBy (xpath = "//input[@id='city']")
    WebElement CITY;

    @FindBy (xpath = "//input[@id='zipcode']")
    WebElement ZIPCODE;

    @FindBy (xpath = "//input[@id='mobile_number']")
    WebElement MOBILENUMBER;

    @FindBy (xpath = "//button[normalize-space()='Create Account']")
    WebElement BOTON_REGISTER;
    @FindBy (xpath = "//b[normalize-space()='Account Created!']")
    WebElement TITLE_CREATED;

    public void Registrar(String name, String email, String password,String day,String month,String year, String firstName, String lastName,
                          String company, String address, String state, String city, String zipcode, String mobileNumber){

        SINGUP_LOGIN.click();
        NAME.sendKeys(name);
        EMAIL.sendKeys(email);
        BOTON_SINUNP.click();
        TITLE.click();
        PASSWORD.sendKeys(password);
        DAY.selectByVisibleText(day);
        MONTH.selectByVisibleText(month);
        YEAR.selectByVisibleText(year);
        NEWS.click();
        JavascriptExecutor js = (JavascriptExecutor) ((WebDriverFacade) getDriver()).getProxiedDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", YEAR);
        FIRTSNAME.sendKeys(firstName);
        LASTNAME.sendKeys(lastName);
        COMPANY.sendKeys(company);
        ADDRESS.sendKeys(address);
        STATE.sendKeys(state);
        CITY.sendKeys(city);
        ZIPCODE.sendKeys(zipcode);
        MOBILENUMBER.sendKeys(mobileNumber);
        BOTON_REGISTER.click();

    }
    public String validarRegistro(){

        return TITLE_CREATED.getText();
    }

}
