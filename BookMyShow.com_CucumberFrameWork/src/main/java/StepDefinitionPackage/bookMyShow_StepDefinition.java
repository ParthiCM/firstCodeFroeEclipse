package StepDefinitionPackage;


import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class bookMyShow_StepDefinition extends BaseClass {

	WebDriverWait wait;
	String parentWindow;
	Set<String> childWindows;



	@Before
	public void initiatingBrowser() {
		BaseClass.initiatingDriver();
	}


	@Given("^User should land on application home page$")
	public void user_should_land_on_application_home_page() {
		driver.get(URL);
		System.out.println("User is in Home page :"+driver.getTitle());
		parentWindow = driver.getWindowHandle();
	}


	@Then("^User should select their city$")
	public void user_should_select_their_city() throws Exception{
		wait = new WebDriverWait(driver, 20);
		PageFactory.initElements(driver, HomePageObjects.class);
		HomePageObjects.popup.click();

		HomePageObjects.viewAllCitiesBtn.click();

		WebElement userCityname = driver.findElement(By.xpath("//div[text()='"+userCity+"']"));
		userCityname.click();
	}


	@Then("^user should select sports tab in the homepage$")
	public void user_should_select_sports_tab_in_the_homepage() {

		HomePageObjects.sportsField.click();

	}

	@When("^verifying user is on Sports page$")
	public void verifying_user_is_on_Sports_page() {

		String sportsPageTitle = driver.getTitle();
		Assert.assertEquals(sportsPageTitle, "Top Upcoming Sports Events in Pondicherry | Live Sports Tournaments in Pondicherry - BookMyShow");
		System.out.println("User in Sports page : "+sportsPageTitle);
	}

	@Then("^User should select This Weekend button$")
	public void user_should_select_This_Weekend_button()  {
		PageFactory.initElements(driver, sportsPageObjects.class);
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(sportsPageObjects.thisWeekEndBtn));
		sportsPageObjects.thisWeekEndBtn.click();



	}

	@Then("^Displaying Name of the sports$")
	public void displaying_Name_of_the_sports_with_Date()  {
		//PageFactory.initElements(driver, sportsPageObjects.class);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("Total number of sports available are "+sportsPageObjects.sportsName.size());
		System.out.println("*********** The spors name are ************");
		for (WebElement webElement : sportsPageObjects.sportsName) {
			System.out.println(webElement.getText());
		}
	}


	@Then("^User should click on Movie Tab on home page$")
	public void user_should_click_on_Movie_Tab_on_home_page() {
		HomePageObjects.moviesTab.click();


	}
	@Then("^locate all Languages in Movie Section and Displaying as list$")
	public void locate_all_Languages_in_Movie_Section_and_Displaying_as_list(){
		PageFactory.initElements(driver, MoviePage.class);
		wait = new WebDriverWait(driver, 20);
		for (WebElement Elements : MoviePage.LanguageList) {
			System.out.println("*************** Languages are ************* \n"+Elements.getText() );
		}
	}


	@Then("^User should click on Sign-In button and choose Continue with Google$")
	public void user_should_click_on_Sign_In_button_and_choose_Continue_with_Google(){


		HomePageObjects.sign_inButton.click();
		//page is not accepting any wait statement, So iam using thread.sleep
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println("Exception in clicking continue with google button");
		}

		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("document.getElementsByClassName('sc-cIShpX kbgKIH')[1].click();");
		childWindows = driver.getWindowHandles();
		for (String newWindow : childWindows) {
			driver.switchTo().window(newWindow);
		}

	}


	@Then("^User should enter invalid email id$")
	public void user_should_enter_invalid_email_id(DataTable Username){


		PageFactory.initElements(driver, Sign_inPage.class);

		List<List<String>>  inValidEmailId = Username.raw();
		Sign_inPage.email.sendKeys(inValidEmailId.get(0).get(0));
	}

	@Then("^click on Sign-In button$")
	public void click_on_Sign_In_button()  {

		Sign_inPage.nextBtn.click();
	}

	@Then("^Capture and display the Error message$")
	public void Capture_and_display_the_Error_message() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElements(Sign_inPage.errormsg));
		for (WebElement webElement : Sign_inPage.errormsg) {
			wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOfAllElements(Sign_inPage.errormsg));
			System.out.println("The Error message is "+ webElement.getText());
		}


		TakesScreenshot ts = (TakesScreenshot)driver; 
		File pic =ts.getScreenshotAs(OutputType.FILE);

		try {
			FileHandler.copy(pic, new File(System.getProperty("user.dir")+"\\ScreenShot\\errorMesssage.png"));
		} catch (IOException e) {
			System.out.println("Exception taking ScreenShot");
		}

		driver.close();
		driver.switchTo().window(parentWindow);
	}

	@After
	public void closingBrowser() {
		driver.quit();
	}
}
