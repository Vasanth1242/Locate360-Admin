package base;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Scenario; 
import io.github.bonigarcia.wdm.WebDriverManager;

@SuppressWarnings("unused")
public class BaseClass {

	public static WebDriver driver;
	public static WebDriverWait wait;

	public static WebDriver initDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return driver;
	}

	public static void launchUrl() {
		driver.get("https://d3sl5inx636650.cloudfront.net");

	}

	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

	public static void maximize() {
		driver.manage().window().maximize();
	}

	public void sendKeys(WebElement element, String s) {
		wait.until(ExpectedConditions.visibilityOf(element));
		element.clear();
		element.sendKeys(s);
	}

	public static void click(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

	public static void clear(WebElement element) {
		element.clear();
	}

	public static String text(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
		return element.getText();
	}

	public static void forward() {
		driver.navigate().forward();
	}

	public static void backWard() {
		driver.navigate().back();
	}

	public static void refresh() {
		driver.navigate().refresh();
	}

	public static void scrollToTheElement(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();
	}
	
	public void scrollToTheBottom() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		
	}

	public static void jsCalender(WebElement element, String date) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value=arguments[1];", element, date);
	}

	public void minimize() {
		driver.manage().window().minimize();
	}

	// Alerts

	public void okAlert() {
		driver.switchTo().alert().accept();
	}

	public static WebDriverWait Explixity() {
		return new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public static String waitAlert() {
		Alert alert = Explixity().until(ExpectedConditions.alertIsPresent());
		String text = alert.getText();
		alert.accept();
		return text;

	}

	// window Handle

	public static String switchToChild() {
		String parent = driver.getWindowHandle();
		for (String window : driver.getWindowHandles()) {
			if (!window.equals(parent)) {
				driver.switchTo().window(window);
				return parent;
			}
			System.out.println("parent id " + parent);
			System.out.println("Child id " + window);
		}
		throw new RuntimeException("Child window not found.");
	}

	public static void closeChildAndReturnToParent(String parent) {
		driver.close();
		driver.switchTo().window(parent);
	}

	// Iframe//
	public void iFrameHandler(WebElement element) {
		driver.switchTo().frame(element);
	}

	public void iFrameHome(WebElement element) {
		driver.switchTo().defaultContent();
	}

	public void acceptAlert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	public void dismissAlert() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

	public static String getAlertText() {
		return driver.switchTo().alert().getText();
	}

	public void promptAlert(String text) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(text);
	}

	public void close() {
		driver.close();
	}

	public static void quitBrowser() {
		if (driver != null)
			driver.quit();
	}
	
	
	public static void takeScreenshot(WebDriver driver, Scenario scenario, String stepName) { 
	    try { 
	        byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES); 
	        String screenshotName = "Step Passed - " + stepName; 
	        scenario.attach(screenshot, "image/png", screenshotName); 
	        System.out.println("Screenshot attached to Cucumber report: " + screenshotName); 
	    } catch (Exception e) { 
	        System.out.println("Screenshot failed: " + e.getMessage()); 
	    } 
	}
		

}
