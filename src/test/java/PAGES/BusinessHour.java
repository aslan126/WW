package PAGES;

import UTILITIES.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BusinessHour extends  Baseclass{
    public BusinessHour(){
        PageFactory.initElements(driver,this);
    }



    @FindBy(xpath = "//h1[@class='locationName-1jro_']")
    private WebElement studioTitle;

    @FindBy(xpath = "//*[@class='hoursIcon-II-H2']")
    private WebElement businessHoursIcon;

    @FindBy(xpath = "//*[@class='hoursWrapper-1KHIv show-1db4o']/div/div")
    private List<WebElement> businessHours;

    public WebElement getStudioTitle() {
        return studioTitle;
    }

    public void setStudioTitle(WebElement studioTitle) {
        this.studioTitle = studioTitle;
    }
    public WebElement getBusinessHours() {
        return businessHoursIcon;
    }

    public void setBusinessHours(WebElement businessHours) {
        this.businessHoursIcon = businessHours;
    }
    public void businesHours(){
        businessHoursIcon.click();
    }
    public void businessHoursTable(){
        for(WebElement i:businessHours)
            System.out.println(i.getText());
            System.out.println();
        }
    }



