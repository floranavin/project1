package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.CategoryTesting;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPAge;

public class Testcase2 extends BaseClass {
	@Test
	public void tc2() throws IOException {
		
		SkillraryLoginPAge s = new SkillraryLoginPAge(driver);
		s.gearsbutton();
		s.skillrarydemoapplication();
		
		utilities.switchingTabs(driver);
		
		SkillraryDemoLoginPage sd = new SkillraryDemoLoginPage(driver);
		utilities.dropDown(sd.getCourseadd(), pdata.getPropertydata("courseadd"));
		
		
		CategoryTesting ct = new CategoryTesting(driver);
		
		utilities.dragdrop(driver,ct.getSelenium(), ct.getMycart());
		Point loc = ct.getFacebook().getLocation();
		
		int x =loc.getX();
		int y = loc.getY();
		
		utilities.scrollBar(driver, x, y);
		ct.facebookicon();
		
		
		
}
}