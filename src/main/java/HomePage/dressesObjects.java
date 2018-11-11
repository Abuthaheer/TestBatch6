package HomePage;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class dressesObjects extends basepageReuseMethods {
	@FindBy(xpath = "//*[@id='ul_layered_id_attribute_group_1']/li[1]/label/a")
	private WebElement SizeS;
	@FindBy(xpath = "//*[@id='ul_layered_id_attribute_group_1']/li[2]/label/a")
	private WebElement SizeM;
	@FindBy(xpath = "//*[@id='ul_layered_id_attribute_group_1']/li[3]/label/a")
	private WebElement SizeL;
	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[2]/a")
	private WebElement dresses;
	@FindBy(xpath = "//*[@id='center_column']/ul/li[1]/div/div[2]/div[2]/a[1]/span")
	private WebElement addtoCartclick;
	@FindBy(xpath = "//*[@id='center_column']/ul/li[1]/div/div[1]/div/a[1]/img")
	private WebElement hoverfirstDress;
	@FindBy(xpath = "//*[@id='layer_cart']/div[1]/div[1]/h2")
	private WebElement addedtoCart;
	@FindBys(@FindBy(xpath = "//*[@class='product_list grid row']/li"))
	private List<WebElement> dressesCount;
	@FindBy(xpath = "//*[@class='heading-counter']")
	private WebElement headerCount;
	@FindBy(xpath = "//*[@id='layer_cart']/div[1]/div[1]/span")
	private WebElement closeCartWindow;

	// *[@class='heading-counter']

	// *[@id="center_column"]/h1/span[2]
	// *[@id="layer_cart"]/div[1]/div[1]/h2
	// *[@id="center_column"]/ul/li[1]/div/div[2]/div[2]/a[1]/span
	// *[@id="layered_id_attribute_group_1"]
	// *[@id="layer_cart"]/div[1]/div[1]/span

	public dressesObjects() {
		PageFactory.initElements(driver, this);
	}

	public WebElement verifySizeS() {
		return SizeS;
	}

	public WebElement verifySizeM() {
		return SizeM;
	}

	public WebElement verifySizeL() {
		return SizeL;
	}

	public WebElement verifytabdresses() {
		isElementVisible(dresses);
		return dresses;
	}

	public void addtoCart() {
		verifytabdresses().click();
		Actions ob = new Actions(driver);
		ob.moveToElement(hoverfirstDress).build().perform();
		addtoCartclick.click();
	}

	public void Scrolldown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(300,0)");
	}

	public WebElement addedtoCart() {
		isElementVisible(addedtoCart);
		return addedtoCart;
	}

	public int getProductcountfromheader() {

		String text = headerCount.getText();
		System.out.println(text);
		String[] textSplit = text.split(" ");
		int count = Integer.parseInt(textSplit[2]);
		System.out.println(count);
		return count;

	}

	public List<WebElement> getProduct() {
		return dressesCount;
	}

	public void clickDress() {
		dresses.click();
	}

	public void closeCartWindow() {
		closeCartWindow.click();
	}

}
