package TESTCASES;

import PAGES.FindWorkshopPage;
import PAGES.Locationverification;
import PAGES.BusinessHour;
import UTILITIES.Baseclass;
import UTILITIES.CommentUtills;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WwTestCases extends Baseclass {
    @Test
    public void WW_TC1() throws InterruptedException {
        String actualTitle= driver.getTitle();
        String expectedTitle="Find WW Studios & Meetings Near You | WW USA";//wha is this NBSP ?
        System.out.println(actualTitle);
        System.out.println(expectedTitle);
        Assert.assertEquals(actualTitle, expectedTitle,"TITLE ARE NOT MATCHIN");
        System.out.println("we pass first verification our page title contains ---Find WW Studios & Meetings Near You | WW USA------");
        FindWorkshopPage fv=new FindWorkshopPage();
        fv.getLocation();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        CommentUtills.Wait();
        Locationverification lv=new Locationverification();
        CommentUtills.Wait();
        String studioName1=lv.getStudioName().getText();
        CommentUtills.Wait();
        String distance=lv.getDistance().getText();
        CommentUtills.Wait();
        lv.nearestStudio();
        System.out.println(studioName1);
        System.out.println(distance);
        BusinessHour bh =new BusinessHour();
        String studioName2=bh.getStudioTitle().getText();
        Assert.assertEquals(studioName1,studioName2,"FAILED");
        System.out.println("PASSED =   FIRST TITLE AND SECOND TITLE ARE SAME" );
        js.executeScript("window.scrollBy(0,250)", "");
        CommentUtills.Wait();
        bh.businesHours();
        System.out.println();
        System.out.println("All the business hours");
        bh.businessHoursTable();








    }
}
//1) Navigate to WW Studio Finder page  https://www.weightwatchers.com/us/find-a-workshop/
//
//        2) Assert loaded page title contains “Find WW Studios & Meetings Near You | WW USA”
//
//        3) Under Find your Workshop, click on Studios
//
//        4) In the search field, search for meetings for zip code: 10011
//
//        5) Print the title of the first result and the distance (located on the right of location title/name)
//
//        6) Click on the first search result and then verify displayed location name/title matches with the name of the first searched result that was clicked.
//
//        7) Click on Business Hours
//
//        8) Create a method to print all the business hours for that studio

