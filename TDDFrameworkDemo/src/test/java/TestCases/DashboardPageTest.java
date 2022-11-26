package TestCases;

import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import OHRMpages.DashboardPage;
import OHRMpages.LoginPage;
import OHRMpages.leave.AssignLeave;
import base.OHRM.BaseClass;

public class DashboardPageTest extends BaseClass {

	LoginPage lpage;
	DashboardPage dpage;
	AssignLeave asslp;
	
	@BeforeMethod
	public void browserLaunch() {
		try {
			initialization();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		openURL();
		 lpage = new LoginPage();
	}
	
	@AfterMethod
	public void quit() {
		browserQuit();
	}

	@Test
	public void validateAssignLeaveLauncher() {
		dpage = lpage.loginTest();
		asslp = dpage.assignLeaveLauncher();
		asslp.assignLeave();
	}
	
	@Test
	public void validateLeaveListLauncher() {
		
	}
	
	@Test
	public void validateTimeSheetLauncher() {
		
	}
	
	@Test
	public void validateApplyLeaveLauncher() {
		
	}
	
	@Test
	public void validateMyLeaveLauncher() {
		
	}
	
	@Test
	public void validateMyTimeSheetLauncher() {
		
	}
}
