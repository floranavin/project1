package genericLibrary;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Photo {

	public void getPhoto(WebDriver driver, String name) throws IOException {
		 Date d = new Date();
	     String currentdate	=  d.toString().replaceAll(":", "-");
		
		    //STEP1 type casting
		    TakesScreenshot ts=(TakesScreenshot) driver;
				
			//STEP 2 we can access the method and store it in RAM
		    File src = ts.getScreenshotAs(OutputType.FILE);
				
			//STEP3 i have to specify the location
			File dest = new File(AutoConstant.photopath+currentdate+name+".png");
				 
			//STEP 4 copy and paste from RAM to required Location
			FileUtils.copyFile(src, dest);
				

		
	}
}
