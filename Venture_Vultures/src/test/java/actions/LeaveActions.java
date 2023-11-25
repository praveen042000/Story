package actions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import locators.LeaveLocators;
import stepDefinition.ExternalFileReader;
import utility.HelperClass;

public class LeaveActions {
	ExternalFileReader fil = new ExternalFileReader();

	LeaveLocators LeaveLoc  ;
	public LeaveActions() {
		this.LeaveLoc = new LeaveLocators();
		PageFactory.initElements(HelperClass.getDriver(), LeaveLoc);
	}
	public void leavetype() throws InterruptedException {
		HelperClass.wait.until(ExpectedConditions.elementToBeClickable(LeaveLoc.leavetype));
		LeaveLoc.leavetype.click();
	}
	public void configure() throws InterruptedException {
		HelperClass.wait.until(ExpectedConditions.elementToBeClickable(LeaveLoc.configure));
		LeaveLoc.configure.click();
		LeaveLoc.leaveformat.click();
		HelperClass.wait.until(ExpectedConditions.elementToBeClickable(LeaveLoc.leaveadd));
		LeaveLoc.leaveadd.click();
	}
	public void setLeavename(String Leavename)throws InterruptedException {
		HelperClass.wait.until(ExpectedConditions.elementToBeClickable(LeaveLoc.leavename));
		LeaveLoc.leavename.sendKeys(Leavename);
		LeaveLoc.entitlement.click();
		LeaveLoc.saveclick.click();
    }
	public void saveclick() {
		LeaveLoc.saveclick.click();
	}
	public String  getverifyleave()throws InterruptedException {
		HelperClass.wait.until(ExpectedConditions.visibilityOf(LeaveLoc.configure));
		return LeaveLoc.verifysavemessage.getText();
	}
	
    public void excelsheetread(String sheetname, Integer rownumber) throws InvalidFormatException, IOException, InterruptedException {
        // Get data from the Excel sheet
        List<Map<String, String>> testdata = fil.getData("D:\\Praveen Expleo\\Venture_Vultures\\src\\test\\resources\\Data.xlsx", sheetname);

        // Get skill and description from the specified row
        String LeaveType = testdata.get(rownumber).get("LeaveType");       

        // Add skill details using the retrieved data
        
        setLeavename(LeaveType);
    }

}