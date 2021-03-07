package StepDefinitionPackage;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MoviePage {
	@FindBy(xpath = "//div[@class='commonStyles__VerticalFlexBox-sc-133848s-2 style__FilterBody-sc-1y4pbdw-11 dUklKx']")
	public static  List<WebElement> LanguageList;
	
	@FindBy(xpath = "//div[@class ='style__StyledText-sc-7o7nez-0 boewjJ' and text()='Malayalam']")
	public static WebElement malayalam;
}
