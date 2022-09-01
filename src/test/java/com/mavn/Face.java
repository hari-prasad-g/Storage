package com.mavn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.hi.utils.BaseClass;

public class Face extends BaseClass {
	public static void main(String args[]) throws InterruptedException {
		launchBrowser("chrome");
       openurl("https://stage.facilio.in/auth/login?redirect=%2F");
       implicitwait(10);
       maximize();
       
       WebElement userid= driver.findElement(By.id("inputUsername"));
       sendkeys(userid, "manojkrishna@facilio.com");
       
       WebElement next= driver.findElement(By.xpath("//button[@class='el-button btn btn-primary fc-login-btn mT20 el-button--default']"));
       click(next);
       
       WebElement pass1= driver.findElement(By.id("inputPassword"));
       sendkeys(pass1, "test");
       
       WebElement signin= driver.findElement(By.xpath("//button[@class='el-button btn btn-primary fc-login-btn mT20 el-button--default']"));
        click(signin);
        
        WebElement order= driver.findElement(By.xpath("//div[@class='fc-sidebar-list-con']//li[4]"));
	    click(order);
	}

}
