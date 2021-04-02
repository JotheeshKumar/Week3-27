package assignment328;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
		WebElement wjc = driver.findElement(By.xpath("//a[@href='/women-jackets-coats']"));
		visbl(wjc, 3, driver);
		wjc.click();
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
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//span[@class='categories-num']/following-sibling::div)[1]")).click();
		WebElement moreBtn = driver.findElement(By.className("brand-more"));
		visbl(moreBtn, 3, driver);
		moreBtn.click();
		WebElement searchIp = driver.findElement(By.className("FilterDirectory-searchInput"));
		visbl(searchIp, 3, driver);
		searchIp.sendKeys("MANGO");
		WebElement chkBtn = driver.findElement(By.xpath("//label[@class=' common-customCheckbox']//div[1]"));
		visbl(chkBtn, 3, driver);
		chkBtn.click();
		WebElement elem1 = driver
				.findElement(By.xpath("//span[contains(@class,'myntraweb-sprite FilterDirectory-close')]"));
		visbl(elem1, 3, driver);
		elem1.click();
		WebElement hover1 = driver.findElement(By.className("sort-sortBy"));
		action.moveToElement(hover1).build().perform();
		WebElement elem2 = driver.findElement(By.xpath("//label[text()='Better Discount']"));
		visbl(elem2, 3, driver);
		// driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		elem2.click();
		WebElement elem3 = driver.findElement(
				By.xpath("//*[@id='desktopSearchResults']/div[2]/section/ul/li[1]/a/div[2]/div/span[1]/span[1]"));
		visbl(elem3, 3, driver);
		String rs = elem3.getText();
		System.out.println("First productamount:" + rs);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		WebElement hoverSize = driver.findElement(By.xpath("(//div[@class='product-productMetaInfo'])[1]"));
		visbl(hoverSize, 3, driver);
		action.moveToElement(hoverSize).build().perform();
		WebElement elem4 = driver.findElement(By.xpath("(//span[text()='wishlist'])[1]"));
		visbl(elem4, 3, driver);
		elem4.click();
		System.out.println("=====closing chrome=====");
		driver.close();

	}

	public static void visbl(WebElement elem1, int timeout, WebDriver driver) {
		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(elem1));
	}
}
