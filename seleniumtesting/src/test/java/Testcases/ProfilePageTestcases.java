package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pageobjects.Loginpage;
import io.github.bonigarcia.wdm.WebDriverManager;




public class ProfilePageTestcases {
	
	
	
	@Test
	public void profilepage() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://wisetech.projectdemo.site/login");
		driver.manage().window().maximize();
		
		
		Loginpage lp = new Loginpage();
		lp.username(driver).sendKeys("apple@gmail.com");
		lp.password(driver).sendKeys("Test@4321");
		lp.submit(driver).click();
		
		Pageobjects.profilepage pg = new Pageobjects.profilepage();
		
		pg.profileclick(driver).click();
		
		
		// individual details
		String s =pg.Founder_Name(driver).getText();
		System.out.println("Founder Name:"+s);
		String s1 = pg.Founder_Address(driver).getText();
		System.out.println("Address:"+s1);
		String s2 = pg.Founder_LinkedIn(driver).getText();
		System.out.println("LinkedIn:"+s2);
		String s3 = pg.Founder_Email(driver).getText();
		System.out.println("Email:"+s3);
		String s4 = pg.Founder_DOB(driver).getText();
		System.out.println("DOB:"+s4);
		String s5 = pg.Founder_website(driver).getText();
		System.out.println("Website:"+s5);
		String s6 = pg.Founder_phonenumber(driver).getText();
		System.out.println("phonenumber:"+s6);
		String s7 = pg.coFounder_name(driver).getText();
		System.out.println("Co-founder Name:"+s7);
		String s8 = pg.coFounder_Address(driver).getText();
		System.out.println("Co-founder Address:"+s8);
		String s9 = pg.coFounder_LinkedIn(driver).getText();
		System.out.println("Co-founder LinkedIn:"+s9);
		String s10 = pg.coFounder_Email(driver).getText();
		System.out.println("Co-founder Email:"+s10);
		String s11 = pg.coFounder_website(driver).getText();
		System.out.println("Co-founder Website:"+s11);
		String s12 = pg.coFounder_phone(driver).getText();
		System.out.println("Co-founder phone:"+s12);
		String s13 = pg.coFounder_Role(driver).getText();
		System.out.println("Co-founder Role:"+s13);
		String s14 = pg.coFounder_DOB(driver).getText();
		System.out.println("Co-founder DOB:"+s14);
		String s15 = pg.coFounder_Description(driver).getText();
		System.out.println("Co-founder Description:"+s15);
		
		
	}

}
