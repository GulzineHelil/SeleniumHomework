package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification {


    public static void main(String[] args) {


        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");



        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get(urls.get(0));
        String title=driver.getTitle();

        driver.navigate().to(urls.get(1));
        String title1=driver.getTitle();

        driver.navigate().to(urls.get(2));
        String title2=driver.getTitle();

        StringUtility.verifyEquals(title,title1);
        StringUtility.verifyEquals(title1,title2);
        StringUtility.verifyEquals(title,title2);

//        System.out.println( urls.get(0).startsWith("http://practice.cybertekschool.com"));
//        System.out.println(urls.get(1).startsWith("http://practice.cybertekschool.com"));
//        System.out.println(urls.get(2).startsWith("http://practice.cybertekschool.com"));

        for (String each:urls) {
            System.out.println(each.startsWith("http://practice.cybertekschool.com"));
        }


        driver.close();
    }

}
