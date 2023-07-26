package com.luma.pages;

import com.luma.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MenPantsPage extends Utility {
    private static final Logger log = LogManager.getLogger(MenPantsPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cronus Yoga Pant']")
    WebElement cronusPant;
    //By cronusPant = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
    @CacheLookup
    @FindBy(xpath = "(//div[@class='swatch-option text'])[1]")
    WebElement size32;
    //By size32 = By.xpath("(//div[@class='swatch-option text'])[1]");
    @CacheLookup
    @FindBy(xpath = "(//div[@class='swatch-option color'])[1]")
    WebElement color;
    //By color = By.xpath("(//div[@class='swatch-option color'])[1]");
    @CacheLookup
    @FindBy(xpath = "(//span[contains(text(),'Add to Cart')])[1]")
    WebElement addToCart;
    //By addToCart = By.xpath("(//span[contains(text(),'Add to Cart')])[1]");
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCart;
    //By shoppingCart = By.xpath("//a[normalize-space()='shopping cart']");

    public void mouseHoverOnPantAndClick() throws InterruptedException {
        log.info("Mouse hover on Cronus Pant");
        mouseHoverToElement(cronusPant);
        //CustomListeners.test.log(Status.PASS, "Mouse hover on Cronus Pant ");
        Thread.sleep(1000);
        log.info("Mouse hover on Size and click ");
        mouseHoverToElementAndClick(size32);
        //CustomListeners.test.log(Status.PASS, "Mouse hover on Size and click ");
        Thread.sleep(1000);
        log.info("Mouse hover on Color and click ");
        mouseHoverToElementAndClick(color);
        //CustomListeners.test.log(Status.PASS, "Mouse hover on Color and click ");
    }

    public void clickOnAddToCart() throws InterruptedException {
        log.info("Mouse hover on Cronus Pant ");
        mouseHoverToElement(cronusPant);
        //CustomListeners.test.log(Status.PASS, "Mouse hover on Cronus Pant ");
        Thread.sleep(1000);
        log.info("Mouse hover on Add to Cart and click ");
        mouseHoverToElementAndClick(addToCart);
        //CustomListeners.test.log(Status.PASS, "Mouse hover on Add to Cart and click ");
        Thread.sleep(1000);
    }

    public void clickOnShoppingCart() throws InterruptedException {
        log.info("Click on Shopping Cart ");
        clickOnElement(shoppingCart);
        //CustomListeners.test.log(Status.PASS, "Click on Shopping Cart ");
        Thread.sleep(1000);
    }

}
