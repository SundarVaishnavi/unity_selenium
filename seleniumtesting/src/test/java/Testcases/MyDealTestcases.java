package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pageobjects.Loginpage;
import Pageobjects.MyDealpage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MyDealTestcases{
	
	
	@Test
	public void mydeal() throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://wisetech.projectdemo.site/login");
		driver.manage().window().maximize();
		
		Loginpage lp = new Loginpage();
		lp.username(driver).sendKeys("apple@gmail.com");
		lp.password(driver).sendKeys("Test@4321");
		lp.submit(driver).click();
		
		MyDealpage dp = new MyDealpage();
		dp.mydealclick(driver).click();
		System.out.println(" My deal basicinfo details:"+dp.basicinfo(driver).getText());
		dp.startupinfo(driver).click();
		dp.InvestorDeck(driver).click();
		dp.FundraisingInfo(driver).click();
		
	}

}
