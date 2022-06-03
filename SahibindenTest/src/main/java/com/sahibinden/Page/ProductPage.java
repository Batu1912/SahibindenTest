package com.sahibinden.Page;

import Methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ProductPage {
    Methods methods;
    Logger logger = LogManager.getLogger(ProductPage.class);

    public ProductPage(){
        methods = new Methods();
    }

    public void selectRandomProduct(){
        methods.selectRandomProduct(By.cssSelector(".showCaseList.showCaseSubCategory.category-showcase-container"));
        methods.waitBySeconds(2);
        methods.clickElement(By.cssSelector("div[style='top: -430.333px; left: 408.667px;']"));
        methods.waitBySeconds(2);
    }
    public void selectRandomCar(){
        methods.selectRandomProduct(By.id("searchResultsTable"));
        methods.waitBySeconds(2);
    }

    public void checkProductPage(){
        methods.swipeDown(By.cssSelector("a[href='#classifiedProperties']"));
        methods.waitBySeconds(2);
        Assert.assertTrue(methods.isElementVisible(By.cssSelector("a[href='#classifiedProperties']")));
        methods.waitBySeconds(2);

    }
    public void swipeUp(){
        methods.swipeUp(By.cssSelector("a[title='sahibinden.com anasayfasına dön']"));
        methods.waitBySeconds(2);
    }
    public void swipeDown(){
        methods.swipeDown(By.id("_cllpsID_a5"));
        methods.waitBySeconds(2);
    }
    public void advancedSorting(){
        methods.clickElement(By.id("advancedSorting"));
        methods.waitBySeconds(2);
        methods.clickElement(By.cssSelector("a[title='Fiyata göre (Önce en yüksek)']"));
        methods.waitBySeconds(2);
    }
    public void selectCity(){
        methods.clickElement(By.cssSelector("li[data-address='city']"));
        methods.waitBySeconds(2);
        methods.sendKeys(By.cssSelector("input[placeholder='İl']"),"İstanbul");
        methods.waitBySeconds(2);
        methods.clickElement(By.cssSelector("li[data-label='istanbul (tumu)']"));
        methods.waitBySeconds(2);
        methods.clickElement(By.cssSelector(".address-pane.active .collapse-pane"));
        methods.waitBySeconds(2);
        methods.clickElement(By.cssSelector(".btn.btn-block.search-submit"));
        methods.waitBySeconds(2);
    }




}
