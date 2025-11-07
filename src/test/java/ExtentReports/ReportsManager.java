package ExtentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.Test;

public class ReportsManager {

    private static String reportsDir = System.getProperty("user.dir")+ "/Reports/SourceDemo.html";
    private static ExtentReports extentReports;
    private static ExtentSparkReporter extentSpartReporter;


    @Test
    public void test(){
        System.out.println(reportsDir) ;
    }
}
