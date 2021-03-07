package StepDefinitionPackage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageObjects  {
	
	
	@FindBy(xpath = "//button[@class='No thanks']")
	public static WebElement popup;

	@FindBy(xpath="//input[@type='text']")
	public static  WebElement locationTextBox;
	
	@FindBy(xpath = "//a[text()='Sports']")
	public static WebElement sportsField ;
	
	@FindBy(xpath = "//a[text()='Movies']")
	public static WebElement moviesTab;
	
	@FindBy(xpath = "//div[@class='sc-bRBYWo dacEpJ']")
	public static WebElement sign_inButton;
	
	@FindBy(xpath = "//span[text()='View All Cities']")
	public static WebElement viewAllCitiesBtn;
	
	
	
}
