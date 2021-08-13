package PAGES;

import UTILITIES.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Locationverification extends Baseclass {

    public Locationverification() {
        PageFactory.initElements(driver, this);
    }



    ////a[.='WW Studio @ Chelsea']
    @FindBy(xpath = "//*[@id='location-1252089']/a/div[1]/div/a")

    private WebElement studioName;
    @FindBy(xpath = "//*[@id='location-1252089']/a/div[1]/span")
    private WebElement distance;

    public void nearestStudio(){
        studioName.click();
    }
    public WebElement getStudioName() {
        return studioName;
    }

    public void setStudioName(WebElement studioName) {
        this.studioName = studioName;
    }
    public WebElement getDistance() {
        return distance;
    }

    public void setDistance(WebElement distance) {
        this.distance = distance;
    }
}