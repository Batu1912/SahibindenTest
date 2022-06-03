package Methods;


import com.sahibinden.driver.BaseTest;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class Methods {


    WebDriver driver;
    FluentWait<WebDriver> wait;
    public JavascriptExecutor jsdriver;



    public Methods() {
        driver = BaseTest.driver;
        wait = new FluentWait<>(driver);
        wait.withTimeout(Duration.ofSeconds(30))
            .pollingEvery(Duration.ofMillis(300))
            .ignoring(NoSuchElementException.class);
        jsdriver = (JavascriptExecutor) driver;

    }
    public WebElement findElement(By by) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));

    }

    public List<WebElement> findElements(By by) {
        return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
    }


    public void clickElement(By by){
        findElement(by).click();
    }

    public void waitBySeconds(int seconds) {

        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void sendKeys(By by, String text) {
        findElement(by).sendKeys(text);

    }
    public String getText(By by) {
        return findElement(by).getText();

    }

    public Select getSelect(By by) {

        return new Select(findElement(by));
    }

    public void selectByText(By by, String text) {

        getSelect(by).selectByVisibleText(text);
    }

    public boolean isElementVisible(By by) {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void hoverMouse(By by) {
        WebElement element = findElement(by);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }


    public void swipeDown(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(findElement(by)).build().perform();
    }
    public void swipeUp(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(findElement(by)).build().perform();
    }

    public void selectRandomProduct(By by) {
        List<WebElement> products = findElements(by);
        Random random = new Random();
        int number = 0;
        number = random.nextInt(products.size());
        try {
            products.get(number).click();
        } catch (Exception e) {
            jsdriver.executeScript("arguments[0].click();", products.get(number));
        }
    }




}

