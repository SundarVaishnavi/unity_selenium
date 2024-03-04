package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class profilepage {
	
	
	
	// Individual details
	
	public static WebElement profileclick(WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
		return driver.findElement(By.xpath("//span[contains(text(),'Profile')]"));
		
		
	}
	public static WebElement Founder_Name(WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
		return driver.findElement(By.xpath("//*[starts-with(text(),'Founder Name:')]/following::span"));
}
	public static WebElement Founder_Address(WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
		return driver.findElement(By.xpath("//*[starts-with(text(),'Address:')]/following::span"));
}
	
	public static WebElement Founder_LinkedIn(WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
		return driver.findElement(By.xpath("//*[starts-with(text(),'Linkedin:')]/following::span"));
}
	
	public static WebElement Founder_Email(WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
		return driver.findElement(By.xpath("//*[starts-with(text(),'Email:')]/following::span"));

}
	public static WebElement Founder_phonenumber(WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
		return driver.findElement(By.xpath("//*[starts-with(text(),'Phone:')]/following::span"));
}
	public static WebElement Founder_website(WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
		return driver.findElement(By.xpath("//*[starts-with(text(),' Website:')]/following::span"));	
	
}
	public static WebElement Founder_DOB(WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
		return driver.findElement(By.xpath("//*[starts-with(text(),'DOB:')]/following::span"));
}
	public static WebElement coFounder_name(WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
		return driver.findElement(By.xpath("//*[starts-with(text(),'Co-Founder Name:')]/following::span"));
}
	public static WebElement coFounder_Address(WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
		return driver.findElement(By.xpath("//*[starts-with(text(),'Address:')]/following::span"));
	
	}	
	public static WebElement coFounder_LinkedIn(WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
		return driver.findElement(By.xpath("//*[starts-with(text(),'Linkedin:')]/following::span"));


}
	public static WebElement coFounder_Email(WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
		return driver.findElement(By.xpath("//*[starts-with(text(),'Email:')]/following::span"));

}
	
	public static WebElement coFounder_website(WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
		return driver.findElement(By.xpath("//*[starts-with(text(),' Website:')]/following::span"));

}
	public static WebElement coFounder_phone(WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
		return driver.findElement(By.xpath("//*[starts-with(text(),'Phone:')]/following::span"));

}	
	public static WebElement coFounder_Role(WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
		return driver.findElement(By.xpath("//*[starts-with(text(),'Role:')]/following::span"));

}	
	public static WebElement coFounder_DOB(WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
		return driver.findElement(By.xpath("//*[starts-with(text(),'DOB:')]/following::span"));

}
	public static WebElement coFounder_Description(WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
		return driver.findElement(By.xpath("//*[starts-with(text(),'Description:')]/following::span"));

}}
	