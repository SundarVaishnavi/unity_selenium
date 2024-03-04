package Pageobjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public  class globalsearch  {
	
	public static WebElement global_search(WebDriver driver) throws InterruptedException {
		
		FluentWait<WebDriver> wait = new FluentWait<>(driver);
		wait.withTimeout(Duration.ofSeconds(10));
        wait.pollingEvery(Duration.ofSeconds(2));
        wait .ignoring(NoSuchElementException.class);
		WebElement element =  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'Search Investors')]")));
		return element;
	}
	
   public static WebElement global_search_All(WebDriver driver)throws InterruptedException {
		Thread.sleep(5000);
		return driver.findElement(By.xpath("//*[contains(text(),'All:')]"));
	

}
    public static WebElement global_search_InterestedInvestor(WebDriver driver)throws InterruptedException {
		Thread.sleep(3000);
		return driver.findElement(By.xpath("//*[contains(text(),'Interested Investors :')]"));
	

}
	public static WebElement global_search_CommittedInvestors(WebDriver driver)throws InterruptedException {
	Thread.sleep(3000);
	return driver.findElement(By.xpath("//*[contains(text(),'Committed Investors:')]"));
	
}
	public static WebElement global_search_FavouriteInvestors(WebDriver driver)throws InterruptedException {
		Thread.sleep(3000);
		return driver.findElement(By.xpath("//*[contains(text(),'Favourite Investors:')]"));
	
}
	public static WebElement global_search_namesearch(WebDriver driver)throws InterruptedException {
		FluentWait<WebDriver> wait1 = new FluentWait<>(driver);
		wait1.withTimeout(Duration.ofSeconds(10));
        wait1.pollingEvery(Duration.ofSeconds(2));
        wait1.ignoring(NoSuchElementException.class);
        WebElement element1 =  wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@placeholder='Search Investors']")));
		return element1;
		}
	
	public static WebElement global_search_Filter(WebDriver driver)throws InterruptedException {
		Thread.sleep(3000);
		return driver.findElement(By.xpath("//button[@class='bg-[#D9D9D9] h-full flex items-center p-3 rounded-md']"));
	
}
	public static WebElement global_search_Filtersort(WebDriver driver)throws InterruptedException {
		FluentWait<WebDriver> wait2 = new FluentWait<>(driver);
		wait2.withTimeout(Duration.ofSeconds(10));
        wait2.pollingEvery(Duration.ofSeconds(2));
        wait2.ignoring(NoSuchElementException.class);
        WebElement element2 =  wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//select[@name='profession']")));
        Select s = new Select(element2);
        s.selectByVisibleText("IT Professional");
        List<WebElement> selectedOptions = s.getAllSelectedOptions();
        return element2;
        
		
	
}
	public static WebElement global_search_Filter_search_button(WebDriver driver)throws InterruptedException {
	Thread.sleep(3000);
return driver.findElement(By.xpath("//button[contains(text(),'Search')]"));
	
}
	

	
	
	
	}


