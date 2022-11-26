package OHRMpages;

import org.openqa.selenium.By;

import OHRMpages.leave.AssignLeave;
import base.OHRM.BaseClass;

public class DashboardPage extends BaseClass {

	public boolean checkDashboardMenu() {
		return driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']")).isDisplayed();
	}
	
	public AssignLeave assignLeaveLauncher() {
		driver.findElement(By.xpath("//button[@title='Assign Leave']")).click();
		return new AssignLeave();
	}
}
