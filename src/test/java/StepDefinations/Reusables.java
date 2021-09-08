package StepDefinations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Base64;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

public class Reusables extends AllProps {
	static WebDriver driver = null;

	static Properties obj = new Properties();
	static String projectpath = System.getProperty("user.dir");
	public static void main(String[] args) {

	}

	public static void ScreenShot(WebDriver driver, String ScreenShotName) {
		try {
			File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshot,new File("C:/Users/Akhil/git/MyRepo/target/screenShot/"+ScreenShotName+".png"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	/*
	 * public static void ScreenShotByte(WebDriver driver, String ScreenShotName)
	 * throws IOException {
	 * 
	 * 
	 * File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 * String path=System.getProperty("D:/Selenium/JavaCucu/target/screenShotByte/"+
	 * ScreenShotName+".png"); FileUtils.copyFile(screenshot,new File(path)); byte[]
	 * imageBytes= IOUtils.toByteArray(new FileInputStream(path)); return
	 * Base64.getEncoder().encodeToString(imageBytes);
	 * 
	 * 
	 * 
	 * 
	 * }
	 */
	
	public static WebDriver chromeDriver() {

		System.setProperty("webdriver.chrome.driver", "D:/Selenium/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		ChromeOptions Options= new ChromeOptions();
		Options.setHeadless(true);
		return driver;

	}

	public static String getProperties(String locator) throws FileNotFoundException, IOException {

		InputStream objfile = new FileInputStream(projectpath + "/src/test/java/config/Properties.properties");
		obj.load(objfile);
		String xpath = obj.getProperty(locator);
		System.out.print(xpath);
		return xpath;

	}

	public static void setProperties() {
		try {

			OutputStream objfile = new FileOutputStream(projectpath + "/src/test/java/config/Properties.properties");

			obj.setProperty("browser", "Chrome");
			obj.store(objfile, null);
		}

		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void MouseOver(WebDriver driver, By Element) {
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(Element)).build().perform();
	}

}
