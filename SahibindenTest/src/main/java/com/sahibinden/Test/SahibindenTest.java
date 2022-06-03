package com.sahibinden.Test;

import com.sahibinden.Page.*;
import com.sahibinden.driver.BaseTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class SahibindenTest extends BaseTest {
    Logger logger = LogManager.getLogger(ProductPage.class);

    @Test
    public void loginTest() throws InterruptedException{
        HomePage homePage = new HomePage();
        homePage.swipeDownToElement();
        ProductPage productPage = new ProductPage();
        productPage.selectRandomProduct();
        productPage.checkProductPage();
        productPage.swipeUp();
        homePage.goToHomePage();
        homePage.searchElement();
        productPage.swipeDown();
        productPage.selectCity();
        productPage.advancedSorting();
        productPage.swipeDown();
        productPage.selectRandomCar();
        productPage.checkProductPage();







    }

}

