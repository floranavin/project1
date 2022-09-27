package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoryTesting {
	
	
	@FindBy(xpath="(//a[text()='Selenium Training'] )[2]")
	private WebElement selenium;
	
	public WebElement getFacebook() {
		return facebook;
	}

	public WebElement getSelenium() {
		return selenium;
	}
	
	@FindBy(id="mycart")
	private WebElement mycart;

	public WebElement getMycart() {
		return mycart;
	}
	
	@FindBy(xpath ="(//i[@class='fa fa-facebook'])[2]")
	private WebElement facebook;
	
	public CategoryTesting(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void  facebookicon() {
		facebook.click();
	}
			
}
