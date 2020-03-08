package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class NavigationTests {


    public static void main(String[] args) throws InterruptedException {
        chromeTests();
        fireFoxTests();
        safariTests();

    }

    public static void chromeTests(){
        WebDriver driver = BrowserFactory.getDriver("chromeDriver");
        driver.get("https://google.com");
        String title=driver.getTitle();

        driver.navigate().to("https://etsy.com");
        String title1=driver.getTitle();

        driver.navigate().back();
        StringUtility.verifyEquals(title,driver.getTitle());

        driver.navigate().forward();
        StringUtility.verifyEquals(title1,driver.getTitle());

        driver.close();
    }

    public static void fireFoxTests(){
        WebDriver driver=BrowserFactory.getDriver("FireFoxDriver");
        driver.get("https://google.com");
        String title=driver.getTitle();

        driver.navigate().to("https://etsy.com");
        String title1=driver.getTitle();

        driver.navigate().back();
        StringUtility.verifyEquals(title,driver.getTitle());

        driver.navigate().forward();
        StringUtility.verifyEquals(title1,driver.getTitle());

        driver.close();

    }


    public static void safariTests() throws InterruptedException {

        WebDriver driver=BrowserFactory.getDriver("safariDriver");
        driver.get("https://google.com");
        String title=driver.getTitle();

        Thread.sleep(3000);

        driver.navigate().to("https://etsy.com");
        String title1=driver.getTitle();

        Thread.sleep(3000);
        driver.navigate().back();
        StringUtility.verifyEquals(title,driver.getTitle());

        Thread.sleep(3000);
        driver.navigate().forward();
        StringUtility.verifyEquals(title1,driver.getTitle());

        driver.close();
    }
}
