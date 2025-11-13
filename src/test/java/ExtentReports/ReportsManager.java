package ExtentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.Test;

import java.io.File;

public class ReportsManager {

    private static String reportsDir = System.getProperty("user.dir")+ "/Reports/SourceDemo.html";
    private static ExtentReports extentReports;
    private static ExtentSparkReporter extentSpartReporter;
    public static ExtentReports extentReports(){
        extentReports = new ExtentReports();
        extentSpartReporter = new ExtentSparkReporter(new File(reportsDir));
        extentReports.attachReporter(extentSpartReporter);
        extentSpartReporter.config().setDocumentTitle("Extent Reports");
        extentSpartReporter.config().setReportName("Source demo");
        extentReports.setSystemInfo("OS", System.getProperty("os.name"));
        extentReports.setSystemInfo("execution machine",System.getProperty("user.name"));
        return extentReports;
    }

    @Test
    public void test(){
        System.out.println(reportsDir) ;
    }
}
