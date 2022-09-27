package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoLoginPage {

	@FindBy(id="course")
	private WebElement coursertab;
	
	@FindBy(name="addresstype")
	private WebElement courseadd;

	public WebElement getCourseadd() {
		return courseadd;
	}


	public WebElement getCoursertab() {
		return coursertab;
	}

	@FindBy(xpath ="(//a[text()='Selenium Training']) [1]")
	private WebElement seleniumtraining;
	
	public SkillraryDemoLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	public void seleniumtraininggtab(){
		seleniumtraining.click();
		
	}
}
