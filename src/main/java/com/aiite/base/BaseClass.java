package com.aiite.base;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	private WebDriver driver = null;

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "/src/main/resources/drivers/chromedriver.exe");
			driver = new ChromeDriver();
	
		}

		driver.manage().window().maximize();
	}

	public void getUrl(String url) {
		driver.get(url);
	}

	public void inputboxText(WebElement element, String input) {
//		driver.findElement(by).sendKeys(input);
		element.sendKeys(input);
	}

	public void clickButtons(WebElement element) {
		element.click();
	}

	public void driverClose() {
		driver.close();
	}

	public void dropDown(WebElement element, String visibleText) {
		Select select = new Select(element);
		select.selectByVisibleText(visibleText);
	}

	public String screenshot(String filename) throws IOException {
		TakesScreenshot takescreenshot = (TakesScreenshot) driver;
		File src = takescreenshot.getScreenshotAs(OutputType.FILE);
		File dest = new File(System.getProperty("user.dir") + "/Screenshot/" + filename + ".png");
		FileHandler.copy(src, dest);
		return System.getProperty("user.dir") + "/Screenshot/" + filename + ".png";
	}

	public String base64Screenshot() throws IOException {
		TakesScreenshot takescreenshot = (TakesScreenshot) driver;
		String screenshot = takescreenshot.getScreenshotAs(OutputType.BASE64);
//		File dest = new File(System.getProperty("user.dir")+"/Screenshot/"+filename+".png");
//		FileHandler.copy(src, dest);
//		return System.getProperty("user.dir")+"/Screenshot/"+filename+".png";
		return screenshot;
	}

	public void implictelyWait() {
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
	}
}
