package HomePage;



	import org.openqa.selenium.WebElement;
		import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	

	public class homepageObjects extends basepageReuseMethods {

		@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[1]/a")
		private WebElement women;

		@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[2]/a")
		private WebElement dresses;

		@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[3]/a")
		private WebElement Tshirts;

		@FindBy(xpath = "//*[@id='newsletter-input']")
		private WebElement newsletter;

		@FindBy(xpath = "//*[@id='newsletter_block_left']/div/form/div/button")
		private WebElement newsletterclick;
		
		@FindBy(xpath = "//*[@id='columns']/p")
		private WebElement Subscribed;
		
		
		//*[@id="columns"]/p
		
		
		@FindBy(xpath = "//*[@id='header_logo']/a/img")
		private WebElement homeClick;

		// *[@id="newsletter_block_left"]/div/form/div/button

		// @FindBy(xpath="//*[@id='center_column']/div[1]/div/div/span")
		// private WebElement navWomen;

		// *[@id="center_column"]/div[1]/div/div/span
		// @FindBy(xpath="//*[@id='center_column']/div[1]/div/div/span")
		// private WebElement navDresses;

		// @FindBy(xpath="//*[@id='center_column']/div[1]/div/div/span")
		// private WebElement navTshirts;

		public homepageObjects() {
			PageFactory.initElements(driver, this);
		}

		public WebElement verifytabdresses() {
			return dresses;
		}

		public WebElement verifytabwomen() {
			return women;
		}

		public WebElement verifytabTshirts() {
			return Tshirts;
		}

		public void enterNewsletter(String input) {
			newsletter.sendKeys(input);
			newsletterclick.click();

		}

		public WebElement homeClick() {

			return homeClick;
		}
		
		public WebElement subscribedLetter() {

			return Subscribed;
		}
		


	}

