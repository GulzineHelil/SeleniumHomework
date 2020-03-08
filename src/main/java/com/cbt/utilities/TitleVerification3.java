package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification3 {



    public static void main(String[] args) {

        List<String> urls = Arrays.asList("https://luluandgeorgia.com",
                "https://wayfair.com/", "https://walmart.com",
                "https://westelm.com/");


        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get(urls.get(0));
        String title=driver.getTitle();

        if(urls.get(0).contains(title.replace(" ","").toLowerCase())) {
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println(urls.get(0));
            System.out.println("title: "+title);
        }
        driver.close();

        WebDriver driver1=new ChromeDriver();

        driver1.get(urls.get(1));
        String title1=driver1.getTitle();


        if(urls.get(1).contains(title1.replace(" ","").toLowerCase())) {
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println(urls.get(1));
            System.out.println("title1: "+title1);
        }
        driver1.close();

        WebDriver driver2=new ChromeDriver();

        driver2.navigate().to(urls.get(2));
        String title2=driver2.getTitle();
        if(urls.get(2).contains(title2.replace(" ","").toLowerCase())) {
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println(urls.get(2));
            System.out.println("title2: "+title2);
        }

        driver2.close();

        WebDriver driver3=new ChromeDriver();

        driver3.navigate().to(urls.get(3));
        String title3=driver3.getTitle();

        if(urls.get(3).contains(title3.replace(" ","").toLowerCase())) {
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println(urls.get(3));
            System.out.println("title3: "+title3);
        }

        driver3.close();

    }
}
