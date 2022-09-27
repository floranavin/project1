package scripts;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.AddtoCartPage;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPAge;

public class Testcase1 extends BaseClass {
	@Test
	public void tc1() {
		SkillraryLoginPAge s = new SkillraryLoginPAge(driver);
		s.gearsbutton();
		s.skillrarydemoapplication();
	
	
	utilities.switchingTabs(driver);
	
	SkillraryDemoLoginPage sd = new SkillraryDemoLoginPage(driver);
	utilities.mouseHover(driver, sd.getCoursertab());
	sd.seleniumtraininggtab();
	
	AddtoCartPage d = new AddtoCartPage(driver);
	utilities.doubleClick(driver, d.getAddbtn());
	d.carttocartbtn();
	utilities.alertPopup(driver);
	

	
}
}
