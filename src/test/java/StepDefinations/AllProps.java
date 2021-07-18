package StepDefinations;

import org.openqa.selenium.By;

public class AllProps {

	/* Login */
	
	static By username = By.xpath("//div[@class='_2QfC02']//input[@type='text']");

	static By password = By.xpath("//input[@type='password']");

	static By login = By.xpath("(//span[text()=\"Login\"])[2]");
    
    /* Home */
    
	static By Textbox =By.xpath("//input[@type='text']");
    
	static By ElectronicsHome = By.xpath("//*[text()='Electronics']");
	
	static By EleOptions = By.xpath("//a[contains(@class,\'_6WOcW9\')]");
}
