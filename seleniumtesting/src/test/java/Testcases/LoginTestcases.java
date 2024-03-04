package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pageobjects.Loginpage;
import io.github.bonigarcia.wdm.WebDriverManager;




@Test
public class LoginTestcases {

	public void login()throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://wisetech.projectdemo.site/login");
		driver.manage().window().maximize();
		
		
		PageFactory.initElements(driver,Loginpage.class);
		Loginpage.username.sendKeys("apple@gmail.com");
		Loginpage.password.sendKeys("Test@4321");
		Loginpage.submit.click();
		
		
		/*Loginpage lp = new Loginpage();
		lp.username(driver).sendKeys("apple@gmail.com");
		lp.password(driver).sendKeys("Test@4321");
		lp.submit(driver).click();*/
		
		
		
	

	}

}
