package StepDefinitionPackage;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {


	public static Properties prop;
	public static WebDriver driver;
	public static String URL;
	public static String userCity;



	public BaseClass() {
		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\config.properties");
			prop.load(fis);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception in reading properties file");
		}
	}

	public static void initiatingDriver() {
		
		//Accesing confing.property file and retrieving data
		String browser =  prop.getProperty("Browser");
		URL = prop.getProperty("BaseURL");
		String filepath = System.getProperty("user.dir");
		userCity = prop.getProperty("UserCity");

		//choosing Browser for execution
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", filepath+"\\webdrivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", filepath+"\\webdrivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("kindly provide VALID BROWSER in properties file (ex: chrome or firefox)");
		}

		//maximizing Browser
		driver.manage().window().maximize();

	}
}
