package PAGES;

import UTILITIES.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindWorkshopPage extends Baseclass {
    public FindWorkshopPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//span[.='Studio']")
    public  WebElement studio;
    @FindBy(xpath = "//input[@id='location-search']")
    public WebElement location;
    @FindBy(className = "rightArrow-daPRP")
   public  WebElement arrowButton;

    public void getLocation(){
        studio.click();
        location.sendKeys("10011");
        arrowButton.click();
    }








}
