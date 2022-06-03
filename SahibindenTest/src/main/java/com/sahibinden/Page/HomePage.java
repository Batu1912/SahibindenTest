package com.sahibinden.Page;

import Methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;

public class HomePage {
    Methods methods;

    public HomePage(){
        methods = new Methods();

    }

    public void homePage(){
        methods.waitBySeconds(2);
        Assert.assertTrue(methods.isElementVisible(By.cssSelector(".logo")));

    }

    public void goToHomePage(){
        methods.clickElement(By.cssSelector("a[title='sahibinden.com anasayfasına dön'"));
        methods.waitBySeconds(2);
    }

    public void swipeDownToElement(){
        methods.swipeDown(By.cssSelector("a[href='/kategori/yedek-parca-aksesuar-donanim-tuning']"));
        methods.waitBySeconds(2);
        methods.clickElement(By.id("onetrust-close-btn-container"));
        methods.waitBySeconds(2);
        methods.clickElement(By.cssSelector("a[title='Otomobil']"));
        methods.waitBySeconds(2);

    }

    public void searchElement(){
        methods.clickElement(By.id("searchText"));
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("searchText"),"Volvo c70");
        methods.clickElement(By.cssSelector("button[type='submit']"));
        methods.waitBySeconds(2);

    }




}





