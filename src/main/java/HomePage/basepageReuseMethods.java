package HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public class basepageReuseMethods {

		



		public static WebDriver driver;
		public String browser="chrome";
		
		public basepageReuseMethods()
		{
			if (driver == null) {
				if (browser.equals("chrome")) {
					System.setProperty("webdriver.chrome.driver",
							"C:\\Users\\sam\\Downloads\\chromedriver_win32\\chromedriver.exe");
					driver = new ChromeDriver();
				} else if (browser.equals("firefox")) {
					System.setProperty("webdriver.gecko.driver", "Firefox Driver Server Path");
					driver = new FirefoxDriver();
				}
				driver.get("http://automationpractice.com/index.php");
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.manage().window().maximize();
			}
		}

		public boolean elementFound(WebElement element) {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			boolean res = false;
			try {
				res = element.isDisplayed();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return res;
		}

		public void setText(WebElement element, String name) {
			if (name != null) {
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				element.click();
				element.clear();
				element.sendKeys(name);
			}
		}
		
		/*public boolean getnewsletter(WebElement element)
		{
			element.click();
			//return driver.getCurrentUrl();
			//String Url=driver.getCurrentUrl();
		
							
		}*/
		
		public String getUrlclick(WebElement element)
		{
			element.click();
			return driver.getCurrentUrl();
			
			//String Url=driver.getCurrentUrl();
		
							
		}

		public String getTxtAttribute(WebElement element) {
			return element.getAttribute("value");
		}

		public String selectFromDropDown(WebElement element, String option) {
			Select obj = new Select(element);
			obj.selectByValue(option);
			return obj.getFirstSelectedOption().getText();
		}

		public boolean isElementVisible(WebElement element) {
			try {
				WebDriverWait wait = new WebDriverWait(driver, 90);
				wait.until(ExpectedConditions.visibilityOf(element));
				return true;
			} catch (Exception e) {
				return false;
			}
		}

		public String getTitlte() {
			return driver.getTitle();
		}	
		
		public void quitDriver() {
			driver.quit();
		}
	}




