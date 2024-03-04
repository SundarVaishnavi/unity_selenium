package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sample {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://wisetech.projectdemo.site/login");
		driver.manage().window().maximize();
		WebElement usr = driver.findElement(By.name("username"));usr.sendKeys("apple@gmail.com");
		WebElement pwd =driver.findElement(By.name("password"));pwd.sendKeys("Test@1234");
		WebElement but =driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/form/div[4]/button"));but.click();
		Thread.sleep(5000);
		WebElement mydeal = driver.findElement (By.xpath("/html/body/section/div/div[1]/div/a[2]"));
		mydeal.click();
		//Actions a = new Actions(driver);
		//a.clickAndHold(homeicon).moveToElement(mydeal).doubleClick().perform();

	}

}
