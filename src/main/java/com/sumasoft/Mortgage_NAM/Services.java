package com.sumasoft.Mortgage_NAM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Services {
	 WebDriver driver;
	public Services(WebDriver driver2) {
		driver=driver2;
	}
	public void home()
	{
		Actions act = new Actions(driver);
          WebElement web = driver.findElement(By.xpath("//span[contains(text(),'Services')][@class='link_text']"));
          act.moveToElement(web).build().perform();
		};
	}
	



