package com.appium.ApiDemos_debug.utils;

import com.appium.ApiDemos_debug.suites.BaseTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.commons.lang.exception.ExceptionUtils;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener extends BaseTest implements ITestListener {
    private ExtentReports reports;
    private ThreadLocal<ExtentTest> threadLocal;

    private String testName;

    @Override
    public void onTestStart(ITestResult iTestResult) {
        testName = iTestResult.getMethod().getMethodName();
        ExtentTest test = reports.createTest(testName);

        threadLocal = new ThreadLocal<>();
        threadLocal.set(test);
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        threadLocal.get().log(Status.PASS, ConstantStrings.PASSED);
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        Throwable throwable = iTestResult.getThrowable();

        JiraServiceProvider provider = new JiraServiceProvider(
                props.getProperty(ConstantStrings.PROJECT_NAME),
                props.getProperty(ConstantStrings.JIRA_URL),
                props.getProperty(ConstantStrings.USER_EMAIL),
                props.getProperty(ConstantStrings.PASSWORD_TOKEN)
        );

        String summary = testName + ConstantStrings.SUMMARY;
        String description = ConstantStrings.DESCRIPTION + throwable.getMessage();

        provider.createJiraIssue(
                ConstantStrings.BUG,
                summary,
                description.concat(ExceptionUtils.getFullStackTrace(throwable))
        );

        threadLocal.get().fail(throwable);
    }

    @Override
    public void onStart(ITestContext iTestContext) {
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(ConstantStrings.INDEX);

        reports = new ExtentReports();
        reports.attachReporter(sparkReporter);
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        reports.flush();
    }
}
