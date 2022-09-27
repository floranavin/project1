package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishlistPage { 
	
	@FindBy(xpath="//div[@class='play-icon']")  //div[@class='play-icon']
	private WebElement playbtn;
	
	//a[@class='close_cookies']
	
	@FindBy(xpath="//div[@class='pause-icon']")
	private WebElement pausebtn;
	
	@FindBy(xpath="//a[@class='close_cookies']")  //div[@class='play-icon']
	private WebElement closebtn;
	
	@FindBy(xpath="//span[text()='Add To Wishlist']")
	private WebElement addtowishlist;
	
	
	
	public WishlistPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void playbutton() {
		playbtn.click();
	}
	
	public void closebutton() {
		closebtn.click();
	}
	
	public void pausebutton() {
		pausebtn.click();
	}
	
	public void addtowishlistbtn() {
		addtowishlist.click();
	}

}
