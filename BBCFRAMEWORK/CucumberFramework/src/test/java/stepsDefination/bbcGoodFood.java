package stepsDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Locators.LocatorUtility;
import Locators.Locators;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import junit.framework.Assert;

public class bbcGoodFood extends Locators {

	WebDriver driver;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jahed.miah\\Desktop\\Automation\\SF Automation\\chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		this.driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);

//	WebDriver DriverManager = new ChromeDriver();
//	DriverManager.get("https://www.bbcgoodfood.com/");
	}

	@After

	public void tearDown() {
		this.driver.manage().deleteAllCookies();
		this.driver.quit();
		this.driver = null;

	}

	@Given("^User is on BBC Good Food website$")
	public void UserOnBBCGOODFOODSite() {
		driver.get("https://www.bbcgoodfood.com/");
	}

	@SuppressWarnings("deprecation")

	@Given("^User accpets cookies$")
	public void select_Recipe() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 10000);

		wait.until(
				ExpectedConditions.visibilityOfElementLocated(LocatorUtility.getBy(bbcGoodFoodLocators.cookiesBanner)));
		driver.findElement(LocatorUtility.getBy(bbcGoodFoodLocators.cookiesBanner)).click();

		WebElement ImageFile = driver.findElement(LocatorUtility.getBy(bbcGoodFoodLocators.image1));

		// WebElement ImageFile = driver.findElement(By.xpath("//img[contains(@id,'Test
		// Image')]"));

		Boolean ImagePresent = (Boolean) ((JavascriptExecutor) driver).executeScript(
				"return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0",
				ImageFile);
		if (!ImagePresent) {
			System.out.println("Image not displayed on BBC GOOD FOOD Homepage");
		} else {
			System.out.println("Image displayed on BBC GOOD FOOD Homepage.");
		}

		wait.until(ExpectedConditions.visibilityOfElementLocated(LocatorUtility.getBy(bbcGoodFoodLocators.recipe)));
		Actions builder = new Actions(driver);
		WebElement element = driver.findElement(LocatorUtility.getBy(bbcGoodFoodLocators.recipe));
		builder.moveToElement(element).build().perform();

	}

	@SuppressWarnings("deprecation")
	@Given("^User goes to Recipe page$")
	public void recipePage() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 10000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(LocatorUtility.getBy(bbcGoodFoodLocators.recipe)));

		driver.findElement(LocatorUtility.getBy(bbcGoodFoodLocators.recipe)).click();

//		if(driver.findElement(LocatorUtility.getBy(prizeDraw.closeButton)).isDisplayed()) {
//			wait.until(ExpectedConditions.visibilityOfElementLocated(LocatorUtility.getBy(prizeDraw.closeButton)));
//			driver.findElement(LocatorUtility.getBy(prizeDraw.closeButton)).click();
//		} else{
//			System.out.println("Good Food prize draw is not displayed");
//		}

		try {
			driver.findElement(LocatorUtility.getBy(prizeDraw.closeButton)).isDisplayed();
			driver.findElement(LocatorUtility.getBy(prizeDraw.closeButton)).click();

		} catch (Exception e) {
			System.out.println("Good Food prize draw is not displayed");
		}

//		Thread.sleep(10000);
//		JavascriptExecutor js = (JavascriptExecutor) DriverManager;
//		js.executeScript("window.scrollTo(0, document.body.300);");
		Thread.sleep(6000);
//	wait.until(ExpectedConditions.visibilityOfElementLocated(LocatorUtility.getBy(recipePage.text1)));
		String text1 = driver.findElement(LocatorUtility.getBy(recipePage.text1)).getText().trim();
		String string1 = "Whether you’re looking for healthy recipes or ideas to use up last night’s chicken, we’ve more than 7000 tested recipes to choose from, so you’re sure to find the perfect dish.";
		System.out.println(text1);
		Assert.assertTrue(text1.equals(string1));
	}

	@SuppressWarnings("deprecation")
	@Given("^User browseres a halloumi ingredients$")
	public void halloumiIngredient() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 10000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(LocatorUtility.getBy(recipePage.halloumi)));
		driver.findElement(LocatorUtility.getBy(recipePage.halloumi)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(LocatorUtility.getBy(recipePage.beetroot)));
		driver.findElement(LocatorUtility.getBy(recipePage.beetroot)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(LocatorUtility.getBy(recipePage.rocket)));
		driver.findElement(LocatorUtility.getBy(recipePage.rocket)).click();

		String recipeSuggestedText = driver.findElement(LocatorUtility.getBy(recipePage.suggestedRecipeText)).getText()
				.trim();
		// String string2 = "A great storecupboard salad, topped with golden brown
		// halloumi and quick, homemade pickled red onion";
		System.out.println("Recipe Suggested Text : " + recipeSuggestedText);

		wait.until(ExpectedConditions.visibilityOfElementLocated(LocatorUtility.getBy(recipePage.suggestedRecipe)));
		Thread.sleep(1200);
		driver.findElement(LocatorUtility.getBy(recipePage.suggestedRecipe)).click();
		Thread.sleep(1200);
	}

	@Given("^User finds the perfect halloumi recipe$")
	public void halloumiRecipe() {
		WebDriverWait wait = new WebDriverWait(driver, 10000);
		System.out.println("Method's to cook perfect Halloumi");
		wait.until(ExpectedConditions.visibilityOfElementLocated(LocatorUtility.getBy(recipePage.recipeMethod1)));

		String recipeMethod1 = driver.findElement(LocatorUtility.getBy(recipePage.recipeMethod1)).getText().trim();
		System.out.println("Method 1 : " + recipeMethod1);
		wait.until(ExpectedConditions.visibilityOfElementLocated(LocatorUtility.getBy(recipePage.recipeMethod2)));
		String recipeMethod2 = driver.findElement(LocatorUtility.getBy(recipePage.recipeMethod2)).getText().trim();
		System.out.println("Method 2 : " + recipeMethod2);
		wait.until(ExpectedConditions.visibilityOfElementLocated(LocatorUtility.getBy(recipePage.recipeMethod3)));

		String recipeMethod3 = driver.findElement(LocatorUtility.getBy(recipePage.recipeMethod3)).getText().trim();
		System.out.println("Method 3 : " + recipeMethod3);

	}

	@Given("^User clicks on Sign In button$")
	public void user_clicks_Sign_In_button() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 10000);
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(LocatorUtility.getBy(bbcGoodFoodLocators.cookiesBanner)));
		driver.findElement(LocatorUtility.getBy(bbcGoodFoodLocators.cookiesBanner)).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(LocatorUtility.getBy(loginLocators.sigInButton)));

		Actions builder = new Actions(driver);
		WebElement element = driver.findElement(LocatorUtility.getBy(loginLocators.sigInButton));
		wait.until(ExpectedConditions.visibilityOfElementLocated(LocatorUtility.getBy(loginLocators.sigInButton)));
		Thread.sleep(2000);
		driver.findElement(LocatorUtility.getBy(loginLocators.sigInButton)).click();
		// builder.moveToElement(element).build().perform();

//		wait.until(ExpectedConditions.visibilityOfElementLocated(LocatorUtility.getBy(loginLocators.sigInButton)));
//	driver.findElement(LocatorUtility.getBy(loginLocators.sigInButton)).click();

	}

	@Given("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String Username, String Password) {
		WebDriverWait wait = new WebDriverWait(driver, 10000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(LocatorUtility.getBy(loginLocators.userName)));
		driver.findElement(LocatorUtility.getBy(loginLocators.userName)).sendKeys(Username);
		wait.until(ExpectedConditions.visibilityOfElementLocated(LocatorUtility.getBy(loginLocators.password)));
		driver.findElement(LocatorUtility.getBy(loginLocators.password)).sendKeys(Password);
		wait.until(ExpectedConditions.visibilityOfElementLocated(LocatorUtility.getBy(loginLocators.submit)));
		driver.findElement(LocatorUtility.getBy(loginLocators.submit)).click();

	}

	@SuppressWarnings("deprecation")
	@Given("^User gets an error message \"([^\"]*)\"$")
	public void user_enters_and(String errorMessage) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 10000);

		wait.until(ExpectedConditions.visibilityOfElementLocated(LocatorUtility.getBy(loginLocators.errorMessage)));

		String actual = driver.findElement(LocatorUtility.getBy(loginLocators.errorMessage)).getText();
		System.out.println("actual message on the site: " + actual);
		System.out.println("Error message should match the site: " + errorMessage);
		Assert.assertEquals(actual, errorMessage);
		Thread.sleep(2000);

	}

}
