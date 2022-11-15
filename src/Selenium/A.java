package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	public static void main(String[] args) {
		//System.setProperty("key", "value");
		System.setProperty("webdriver.chrome.driver","D:\\Software Tesing\\SOFTWARE TESTING software\\selnium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//driver is ref variable
		driver.get("https://www.google.com/");
		driver.close();
	}

}
