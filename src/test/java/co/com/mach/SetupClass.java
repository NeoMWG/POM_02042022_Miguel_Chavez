package co.com.mach;

import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class SetupClass {

    protected String BASE_URL = "http://automationpractice.com/index.php";

    @Managed
    protected WebDriver webDriver;

    public void goToLinkText(String linkText){
        webDriver.findElement(By.linkText(linkText));
    }

}
