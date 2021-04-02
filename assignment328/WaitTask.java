package assignment328;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

/*Explicitly Wait:
http://leafground.com/pages/TextChange.html
http://www.leafground.com/pages/disapper.html
http://www.leafground.com/pages/appear.html
*/

public class WaitTask {

	/*
	 * public static void setUp(String url) {
	 * WebDriverManager.chromiumdriver().setup(); ChromeOptions option = new
	 * ChromeOptions(); option.addArguments("--disable-notifications"); ChromeDriver
	 * driver = new ChromeDriver(option); driver.manage().window().maximize();
	 * driver.get(url); }
	 */

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromiumdriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/TextChange.html");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String clickablt = clickablt(driver.findElement(By.xpath("//*[text()='Click ME!']")), 10, driver);
		System.out.println("Available text : " + " : " + clickablt);
	   
	    String urlLink = "http://www.leafground.com/pages/disapper.html";
	   driver.get(urlLink);
	 //  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	 //  Thread.sleep(5000);
	 // String isthr = clickablt(driver.findElement(By.xpath("//*[@id='btn']/b")), 10, driver);
	   boolean visbl = visbl(driver.findElement(By.xpath("//*[@id='btn']/b")), 10, driver);
	   //System.out.println("Available Button : " + " : " + isthr);
	   System.out.println("disapper Button - available ?: " + " : " + visbl);
	   
	   
		
	}

	public static boolean sendKeys(WebElement element, int timeout, WebDriver driver) {
		Boolean until = new WebDriverWait(driver, timeout)
				.until(ExpectedConditions.textToBePresentInElement(element, "Click ME!"));
		return element.isDisplayed();
	}

	public static String clickablt(WebElement element, int timeout, WebDriver driver) {
		WebElement until = new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(element));
		return element.getText();
	}
	public static boolean isthr(WebElement element, int timeout, WebDriver driver) {
		WebElement until = new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(element));
		return element.isDisplayed();
	}
	public static boolean visbl(WebElement element, int timeout, WebDriver driver) {
		Boolean until = new WebDriverWait(driver, timeout).until(ExpectedConditions.invisibilityOf(element));
		return element.isDisplayed();
	}
}
