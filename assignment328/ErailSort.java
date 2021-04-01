package assignment328;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailSort {

	public static void main(String[] args) {
		WebDriverManager.chromiumdriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://erail.in/");
		// WebDriverWait wait = new WebDriverWait(driver, 10); Timeouts implicitlyWait =
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		WebElement element = driver.findElementByXPath("//*[@Title='View trains running on select date']");
		element.click();
		List<WebElement> tRows = driver.findElements(By.xpath("//*[@id='divTrainsList']/table[1]/tbody/tr"));
		List<WebElement> findElements = driver
				.findElements(By.xpath("//*[@id='divTrainsList']/table[1]/tbody/tr/td[2]"));
		List<String> name = new ArrayList<String>();
		Set<String> Unique = new HashSet<String>();
		System.out.println("total trains: " + findElements.size());
		System.out.println("total rows: " + tRows.size());
		for (WebElement webElement : findElements) {
			name.add(webElement.getText());
		}

		Collections.sort(name);

		for (String string : name) {
			System.out.print("Train Name: " + string + ", ");
			Unique.add(string);
		}
		for (String string : Unique) {
			System.out.print("unique: " + string + ", ");
		}
	}
}
