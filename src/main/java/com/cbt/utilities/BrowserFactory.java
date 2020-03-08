package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {

    public static WebDriver getDriver(String arg){

        if ( arg.equalsIgnoreCase("edge")){
            return null;
        }else if (arg.equalsIgnoreCase("chromeDriver")){
            WebDriverManager.chromedriver().version("79").setup();
            return new ChromeDriver();
        }else if (arg.equalsIgnoreCase("FireFoxDriver")){
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }else if (arg.equalsIgnoreCase("SafariDriver")){
            return new SafariDriver();
        }else{
            return null;
        }

    }


}
