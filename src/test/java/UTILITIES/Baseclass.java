package UTILITIES;


import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

    public class Baseclass extends DriverUtill {

        @BeforeMethod
        public void setup()  {
            DriverUtill.getDriver();
            driver.get(Configuration_reader.getProperties("url"));
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
        }
//   @AfterClass
//   public void tearDown(){
//   driver.quit();
// }

    }
