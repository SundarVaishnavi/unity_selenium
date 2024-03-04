package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage {
	
	@FindBy(name="username")
	public static WebElement username;
	
	@FindBy(name="password")
	public static WebElement password;
	
	@FindBy(xpath="/html/body/div[2]/div/div[3]/form/div[4]/button")
	public static WebElement submit;
	
	
	
	
	/*public static WebElement username(WebDriver driver) {
		return driver.findElement(By.name("username"));
	}
	
public static WebElement password(WebDriver driver) {
	return driver.findElement(By.name("password"));
	}

public static WebElement submit(WebDriver driver) {
	return driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/form/div[4]/button"));
}*/

}
