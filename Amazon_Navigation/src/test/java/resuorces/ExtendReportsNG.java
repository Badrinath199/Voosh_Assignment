package resuorces;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReportsNG {
	public static ExtentReports getReportObject()
	{
		String path = "C:\\Users\\K Badrinath\\git\\repositoryVoosh_Assignment\\Amazon_Navigation\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Result");
		reporter.config().setDocumentTitle("Test Results");
		
		ExtentReports extend = new ExtentReports();
		extend.attachReporter(reporter);
		extend.setSystemInfo("Tester", "Badri");
		return extend;
	}

}
