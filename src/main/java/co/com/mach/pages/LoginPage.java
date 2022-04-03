package co.com.mach.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.*;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject {

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Sign in']")
    private WebElement SING_IN_SECTION;

    @CacheLookup
    @FindBy(id = "email")
    private WebElement EMAIL_ADDRESS_FIELD;

    @CacheLookup
    @FindBy(id = "passwd")
    private WebElement PASSWORD_FIELD;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Sign in']")
    private WebElement SING_IN_BUTTON;

    @CacheLookup
    @FindBy(linkText = "Sign out")
    private WebElement LOGOUT_BUTTON;

    @CacheLookup
    @FindBy(xpath = "//img[@alt='My Store']")
    private WebElement GO_TO_HOME;

    @CacheLookup
    @FindBy(xpath = "//p[@class='info-account']")
    private WebElement SUCCESS_MESSAGE_LOGIN;


    public WebElement getSING_IN_SECTION() {
        return SING_IN_SECTION;
    }

    public WebElement getEMAIL_ADDRESS_FIELD() {
        return EMAIL_ADDRESS_FIELD;
    }

    public WebElement getPASSWORD_FIELD() {
        return PASSWORD_FIELD;
    }

    public WebElement getSING_IN_BUTTON() {
        return SING_IN_BUTTON;
    }

    public WebElement getLOGOUT_BUTTON() {
        return LOGOUT_BUTTON;
    }

    public WebElement getGO_TO_HOME() {
        return GO_TO_HOME;
    }

    public WebElement getSUCCESS_MESSAGE_LOGIN() {
        return SUCCESS_MESSAGE_LOGIN;
    }


    //Actions on Page

    public void openTheBrowserWithDefaultUrl(String url){
        this.open();
        getDriver().get(url);
    }

    public void goToHomePage(){
        getGO_TO_HOME().click();
    }

    public void enterLoginSection(){
        getSING_IN_SECTION().click();
    }

    public void loginUsers(String email, String pass){
        enterEmail(email);
        enterPass(pass);
        clickButtonLogin();
    }

    public void enterEmail(String email){
        getEMAIL_ADDRESS_FIELD().click();
        getEMAIL_ADDRESS_FIELD().sendKeys(email);
    }

    public void enterPass(String pass){
        getPASSWORD_FIELD().click();
        getPASSWORD_FIELD().sendKeys(pass);
    }

    public void clickButtonLogin(){
        getSING_IN_BUTTON().click();
    }

    public void clickButtonLogout(){
        getLOGOUT_BUTTON().click();
    }

}






