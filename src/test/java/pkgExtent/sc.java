package pkgExtent;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;



import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class sc {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		
		  ExtentReports extent = new ExtentReports();
		  
	      ExtentSparkReporter spark = new ExtentSparkReporter("report.html");
	        extent.attachReporter(spark);
	        
	        
			
	        
	        
	        
	        ExtentTest test1= extent.createTest("Test 1");
	        test1.pass("This is pass");
        
	        ExtentTest test2= extent.createTest("Test 2");
	        test2.log(Status.FAIL, "This is failed");
	        
	        
	        extent.createTest("Test 3").skip("This is Skipped");
	        
	        extent.createTest("test 4")
	        .log(Status.INFO, "info1")
	        .log(Status.INFO, "info2");
	        
	        
	        
	        
	        
	     
	        
	        extent.flush();
	        Desktop.getDesktop().browse(new File("report.html").toURI());
	        
	        
	        

	        
		
		
	}

}
