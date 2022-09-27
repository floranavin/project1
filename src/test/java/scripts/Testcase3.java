package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.CorejavaPage;
import pomPages.SkillraryLoginPAge;
import pomPages.WishlistPage;

public class Testcase3  extends BaseClass{
	@Test
	
 public void tc3() throws IOException, InterruptedException {
	 
	 SkillraryLoginPAge s = new SkillraryLoginPAge(driver);
		s.searchTextBox(pdata.getPropertydata("coursedata"));
		s.gobutton();
		
		CorejavaPage c = new CorejavaPage(driver);
		c.seleniumtraining();
		
		WishlistPage w= new  WishlistPage(driver);
		//w.closebutton();
		utilities.switchFrame(driver);
		
		Thread.sleep(5000);
		w.playbutton();
		Thread.sleep(7000);
		w.pausebutton();
		utilities.switchbackFrame(driver);
		w.addtowishlistbtn();
		
		
	 
 }
}
