package org.example.uitests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Titov_13HW_WithoutDataProvider_Test extends BaseTestClass {
    @Test
    public void bottomFrameHWTest() {
        driver.get("https://the-internet.herokuapp.com/nested_frames");
        driver.switchTo().frame("frame-bottom");

        String body = driver.findElement(By.xpath("//body")).getText();
        Assert.assertEquals(body, "BOTTOM");

        driver.switchTo().defaultContent();
        Assert.assertEquals(driver.findElements(By.xpath("//frameset/frame")).size(), 2);
    }

    @Test
    public void leftFrameHWTest() {
        driver.get("https://the-internet.herokuapp.com/nested_frames");
        driver.switchTo().frame("frame-top");

        driver.switchTo().frame("frame-left");
        String body = driver.findElement(By.xpath("//body")).getText();
        Assert.assertEquals(body, "LEFT");

        driver.switchTo().defaultContent();
        Assert.assertEquals(driver.findElements(By.xpath("//frameset/frame")).size(), 2);
    }

    @Test
    public void middleFrameHWTest() {
        driver.get("https://the-internet.herokuapp.com/nested_frames");
        driver.switchTo().frame("frame-top");

        driver.switchTo().frame("frame-middle");
        String body = driver.findElement(By.xpath("//body")).getText();
        Assert.assertEquals(body, "MIDDLE");

        driver.switchTo().defaultContent();
        Assert.assertEquals(driver.findElements(By.xpath("//frameset/frame")).size(), 2);
    }

    @Test
    public void rightFrameHWTest() {
        driver.get("https://the-internet.herokuapp.com/nested_frames");
        driver.switchTo().frame("frame-top");

        driver.switchTo().frame("frame-right");
        String body = driver.findElement(By.xpath("//body")).getText();
        Assert.assertEquals(body, "right");

        driver.switchTo().defaultContent();
        Assert.assertEquals(driver.findElements(By.xpath("//frameset/frame")).size(), 2);
    }

}