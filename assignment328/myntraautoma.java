package assignment328;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class myntraautoma {

	public static void main(String[] args) {
		WebDriverManager.chromiumdriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//div/a[contains(text(),'Women')]"));
		action.moveToElement(we).build().perform();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='/women-jackets-coats']")).click();
		String countProduct = driver.findElement(By.className("title-count")).getText();
		System.out.println("no of products: " + Integer.parseInt(countProduct.replaceAll("[a-zA-Z\\p{P}]", "").trim()));
		List<String> validList = new ArrayList<String>();
		List<WebElement> findElements = driver.findElements(By.className("categories-list"));
		String[] split = findElements.get(0).getText().replaceAll("[a-zA-Z\\p{P}]", "").split("\\r?\\n");
		System.out.println(split.length);
		int sum = 0;
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
			sum = sum + Integer.parseInt(split[i]);
		}
		System.out.println("sum: " + sum);
		if (sum == Integer.parseInt(countProduct.replaceAll("[a-zA-Z\\p{P}]", "").trim())) {
			System.out.println("validated the overall count and sum of category count  is same ");
			
		}
		//driver.findElement(By.className("brand-more")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//span[@class='categories-num']/following-sibling::div)[1]")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.className("brand-more")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.className("FilterDirectory-searchInput")).sendKeys("MANGO");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//label[@class=' common-customCheckbox']//div[1]")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[contains(@class,'myntraweb-sprite FilterDirectory-close')]")).click();
		WebElement hover1 =driver.findElement(By.className("sort-sortBy"));
		action.moveToElement(hover1).build().perform();
		 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//label[text()='Better Discount']")).click();
		 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); 
		 String rs =		driver.findElement(By.xpath("//*[@id='desktopSearchResults']/div[2]/section/ul/li[1]/a/div[2]/div/span[1]/span[1]")).getText(); 
		 System.out.println("First productamount:" +rs);
		 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		 WebElement hoverSize =		driver.findElement(By.xpath("(//div[@class='product-productMetaInfo'])[1]"));
		 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		 action.moveToElement(hoverSize).build().perform();
		 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("(//span[text()='wishlist'])[1]")).click();
		 driver.close();
		 
	}
}
