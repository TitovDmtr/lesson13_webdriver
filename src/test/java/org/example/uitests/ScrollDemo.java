package org.example.uitests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class ScrollDemo {
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeClass
    public void beforeClass() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @AfterClass
    public void afterClass() {
        if (driver !=null) {
//            driver.quit();
        }
    }

    @BeforeMethod
    public void beforeMethod() {
        driver.get("https://www.w3schools.com/xml/xpath_axes.asp");
    }

    @Test
    public void Test() {
//        wait.until(ExpectedConditions.elementToBeClickable(By.id("accept-choices"))).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

        driver.findElement(By.xpath("//*[@id=\"spacemyfooter\"]/div[3]/div[2]/a[6]")).click();

        Assert.assertEquals(driver.getTitle(), "W3.CSS Reference");
    }

}
