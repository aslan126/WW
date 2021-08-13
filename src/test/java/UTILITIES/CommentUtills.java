package UTILITIES;

import java.util.concurrent.TimeUnit;

public class CommentUtills extends Baseclass{
    public static void  Wait(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
}
