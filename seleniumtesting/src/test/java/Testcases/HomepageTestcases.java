package Testcases;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

import Pageobjects.Loginpage;
import Pageobjects.globalsearch;
import io.github.bonigarcia.wdm.WebDriverManager;



public class HomepageTestcases{
	
	@Test
	public void Home_page_dashboard_Testcases() throws InterruptedException, AWTException {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://wisetech.projectdemo.site/login");
	driver.manage().window().maximize();
	
	
	Loginpage lp = new Loginpage();
	lp.username(driver).sendKeys("apple@gmail.com");
	lp.password(driver).sendKeys("Test@4321");
	lp.submit(driver).click();
	
	globalsearch hp = new globalsearch();
	hp.global_search(driver).click();
	
	System.out.println("global search :"+hp.global_search_All(driver).getText());
	
	hp.global_search_InterestedInvestor(driver).click();
	System.out.println("global search :"+hp.global_search_InterestedInvestor(driver).getText());
	
	hp.global_search_CommittedInvestors(driver).click();
	System.out.println("global search :"+hp.global_search_CommittedInvestors(driver).getText());
	
	hp.global_search_FavouriteInvestors(driver).click();
	System.out.println("global search :"+hp.global_search_FavouriteInvestors(driver).getText());
	
	hp.global_search_namesearch(driver).click();
	hp.global_search_namesearch(driver).sendKeys(Keys.ENTER+"investor");
	hp.global_search_All(driver).click();
	System.out.println("global search name :"+hp.global_search_All(driver).getText());
	
	
	hp.global_search_Filter(driver).click();
	hp.global_search_Filtersort(driver).click();
	hp.global_search_Filter_search_button(driver).click();
	System.out.println("global search  filter name :"+hp.global_search_All(driver).getText());
	hp.global_search_namesearch(driver).clear();
	//driver.quit();
	

}}
