package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MyDealpage {
	
public static WebElement mydealclick(WebDriver driver) throws InterruptedException {
	
	
	Thread.sleep(5000);
		return driver.findElement (By.xpath("/html/body/section/div/div[1]/div/a[2]"));
		
}
	
public static WebElement basicinfo(WebDriver driver) throws InterruptedException {
	Thread.sleep(5000);
	return driver.findElement(By.xpath("//*[contains(text(),'Basic Info')]"));
	
}
	
public static WebElement startupinfo(WebDriver driver) throws InterruptedException {
	Thread.sleep(5000);
	return driver.findElement(By.xpath("//*[contains(text(),'Startup Info')]"));
	
}

public static WebElement InvestorDeck (WebDriver driver)throws InterruptedException {
	Thread.sleep(5000);
	return driver.findElement(By.xpath("//*[contains(text(),'Investor Deck')]"));
	
}
public static WebElement FundraisingInfo (WebDriver driver)throws InterruptedException {
	Thread.sleep(5000);
	return driver.findElement(By.xpath("//*[contains(text(),'Fundraising Info')]"));
}

}
