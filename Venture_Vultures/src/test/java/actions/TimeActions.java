package actions;

import org.openqa.selenium.support.PageFactory;

import locators.TimeLocators;
import utility.HelperClass;

public class TimeActions {
	TimeLocators Timloc;
	public TimeActions() {
		this.Timloc = new TimeLocators();
		PageFactory.initElements(HelperClass.getDriver(), Timloc);
	}
		public void clickTimeButton() {
			Timloc.timeclick.click();
		}
		public void clickProjectInfo() {
			Timloc.projectinfoclick.click();
		}
		public void selectCustomer() {
			Timloc.customer.click();
		}
		public void  clickaddbutton() {
			Timloc.selectadd.click();
		}
		public void setname(String name) {
			Timloc.customername.sendKeys(name);
		}
		public void setDiscription(String discription) {
			Timloc.description.sendKeys(discription);
		}
		public void  savebutton() {
			Timloc.savebutton.click();
		}
		public String getVerifydiscription() {
			return Timloc.verifyemployee.getText();
		}
		public void AddEmployee(String name, String discription) {
			setname(name);
			setDiscription(discription);
		}
		public String getverifyerror() {
			return Timloc.verifyerror.getText();
		}
		
}
