package selinumproject;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.redbus.in");

		https: // www.redbus.in/search?fromCityName=Chennai%20%28All%20Locations%29&fromCityId=123&toCityName=Gandhipuram%2C%20Coimbatore&toCityId=66904&onward=01-Apr-2021&srcCountry=IND&destCountry=IND&opId=0&busType=Any
		driver.manage().window().maximize();
		driver.findElement(By.id("src")).sendKeys("c");
		Thread.sleep(3000L);
		driver.findElement(By.id("src")).sendKeys(Keys.TAB);

		driver.findElement(By.id("dest")).sendKeys("coimbatore");
		Thread.sleep(3000L);
		driver.findElement(By.id("dest")).sendKeys(Keys.DOWN, Keys.TAB);
		driver.findElement(By.xpath("//button[text()='>']")).click();
		driver.findElement(By.xpath("(//td[@class='empty day']/following-sibling::td)[3]")).click();
		/*
		 * Calendar calendar = Calendar.getInstance(); calendar.add(Calendar.DATE,1);
		 * Date date = calendar.getTime(); SimpleDateFormat formatter = new
		 * SimpleDateFormat("dd-MMM-yyyy"); String formatDate = formatter.format(date);
		 * //driver.findElement(By.xpath("//input[@data-caleng='"+formatDate+"']")).
		 * click(); //input[@id='onward_cal']
		 */
		driver.findElement(By.xpath("//button[text()='Search Buses']")).click();
		Thread.sleep(7000);
		String NoBus = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println("No of buses: " + NoBus);
		driver.findElement(By.xpath("//div[@class='close']/i")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//input[@id='bt_SLEEPER']/following-sibling::label[1]")).click();
		Thread.sleep(7000);
		String NoBusSleeper = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println("No of sleeper buses: " + NoBusSleeper);
		driver.findElement(By.xpath("(//label[@for='bt_AC'])[1]")).click();
		Thread.sleep(7000);
		String NoBusAcSleeper = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println("No of sleeper AC buses: " + NoBusAcSleeper);
		Thread.sleep(7000);
		driver.findElement(By.xpath("(//div[contains(@class,'w-15 fl')]//a)[1]")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("(//div[contains(@class,'w-15 fl')]//a)[1]")).click();
		Thread.sleep(7000);
		String CostlyBus = driver.findElement(By.xpath("(//div[contains(@class,'column-two p-right-10')]//div)[1]"))
				.getText();
		System.out.println("Costly bus: " + CostlyBus);
	}

}
