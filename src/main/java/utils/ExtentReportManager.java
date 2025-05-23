package utils;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {
    private static ExtentReports extent;
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    public static void initReports() {
        ExtentSparkReporter spark = new ExtentSparkReporter("target/extent-report.html");
        extent = new ExtentReports();
        extent.attachReporter(spark);
    }

    public static void flushReports() {
        if (extent != null) {
            extent.flush();
        }
    }

    public static void createTest(String testName) {
        test.set(extent.createTest(testName));
    }

    public static ExtentTest getTest() {
        return test.get();
    }
}
