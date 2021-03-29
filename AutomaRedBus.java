package redbus;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomaRedBus {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		Date date = calendar.getTime();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");  
		String formatDate = formatter.format(date);
		System.out.println(formatDate);
	}

}
