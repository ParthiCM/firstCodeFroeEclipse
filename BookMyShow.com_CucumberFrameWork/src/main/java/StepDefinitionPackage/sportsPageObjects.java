package StepDefinitionPackage;

import java.util.List;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class sportsPageObjects {
	
	@FindBy(xpath = "//*[@id='super-container']/div[2]/div[4]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]")
	public static WebElement thisWeekEndBtn;
	
	@FindBy(xpath = "//div[@class='style__StyledText-sc-7o7nez-0 gBgfCW']")
	public static List<WebElement>  sportsName;

}
