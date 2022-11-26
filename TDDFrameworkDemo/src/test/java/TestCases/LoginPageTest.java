package TestCases;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import OHRMpages.DashboardPage;
import OHRMpages.LoginPage;
import base.OHRM.BaseClass;

public class LoginPageTest extends BaseClass {

	LoginPage lpage;
	DashboardPage dpage;
	
	
	@BeforeMethod
	public void browserLaunch() throws IOException {
		initialization();
		openURL();
		 lpage = new LoginPage();
	}
	
	@Test
	public void validateLogin() {
		dpage = lpage.loginTest();
		Assert.assertTrue(dpage.checkDashboardMenu());
	}
	
	@Test
	public void validateLogo() {
		Assert.assertTrue(lpage.getLogo());
	}
	
	@Test
	public void validateTitle() {
		String actTitle = lpage.getPageTitle();
		String expTitle = "OrangeHRM";
		Assert.assertEquals(actTitle, expTitle);
	}
	
	@Test
	public void validateForgotPassword() {
		boolean check = lpage.forgotPassword();
		Assert.assertTrue(check);
	}
	
	@Test
	public void captureScreenshot(String testcaseName) throws IOException {
		captureScreenshot(testcaseName);
	}
	
	@AfterMethod
	public void quit() {
		browserQuit();
	}
}
