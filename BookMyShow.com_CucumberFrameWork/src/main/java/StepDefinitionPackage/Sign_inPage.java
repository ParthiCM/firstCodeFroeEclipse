package StepDefinitionPackage;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Sign_inPage {

	@FindBy(xpath = "//input[@type='email']")
	public static  WebElement email ;
	
	@FindBy(xpath = "//div[@class='VfPpkd-RLmnJb']")
	public static WebElement nextBtn;
	
	@FindBy(xpath = "//div[@class='o6cuMc']")
	public static List<WebElement> errormsg;
}
