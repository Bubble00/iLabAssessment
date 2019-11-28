package utils;

import org.openqa.selenium.WebDriver;

import java.util.Random;

import static org.openqa.selenium.remote.BrowserType.FIREFOX;

public class Utility {

    public static String autoGenerate(){
        String randnum = "0";
        Random random = new Random();
        for (int i = 1; i < 10; ++i){
            int randomInt = random.nextInt(10);
            randnum += randomInt;
            if (i==2 || i == 5){
                randnum += " ";
            }
        }
        //log.info("Generate random phone number");
        return randnum;
    }
}
