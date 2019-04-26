package Locators;

public class Locators {
	 public interface bbcGoodFoodLocators
	 {
		 public static final String cookiesBanner = "xpath=//div[@class='optanon-alert-box-button optanon-button-allow']";
		 public static final String recipe = "xpath=//span[contains(text(),'Recipes')]";
	 public static final String image1 = "xpath=//*[@id=\"main-content\"]/div/div[2]/div[1]/div[1]/div/a/img";

		 	
	 }
	 public interface recipePage
	 {
		 public static final String text1 = "xpath=//*[@id=\"main-content\"]/div[1]/div[1]/div[1]";
		 public static final String halloumi = "xpath=//div[@id='js-metadrift-suggestion__grid']//div[3]";
		 public static final String beetroot = "xpath=//div[@id='js-metadrift-suggestion__grid']//div[2]";
		 public static final String rocket = "xpath=//div[@data-id='20003']";
		 public static final String suggestedRecipeText = "xpath=//div[@class='metadrift-recipe-description field-item even']";
		 public static final String suggestedRecipe = "xpath=//*[@id=\"js-metadrift-recipes__list\"]/article/h3";

		 public static final String recipeMethod1 = "xpath=//p[contains(text(),'Put the sliced onion in a bowl, add the vinegar an')]";
		 public static final String recipeMethod2 = "xpath=//p[contains(text(),'Pile the rocket onto plates and dot over the beetr')]";
		 public static final String recipeMethod3 = "xpath=//p[contains(text(),'Stir the pomegranate into the onions and spoon thi')]";

		 	
	 }
	 
	 public interface prizeDraw
	 {
		 public static final String tickbox = "xpath=//*[@id=\"popup-content\"]/div/div[1]/span/div";
		 public static final String noButton = "xpath=//a[@id=\"btn-reject\"]";
		 public static final String closeButton = "xpath=//*[@id=\"btn-close\"]";


		 	
	 
}
	 public interface loginLocators
	 {
		 public static final String sigInButton = "xpath=//div[@class='user-state bg-green']//a[contains(text(),'Sign in')]";
		 public static final String userName = "xpath=//input[@id='edit-name']";
		 public static final String password = "xpath=//input[@id='edit-pass']";
		 public static final String submit = "xpath=//input[@id='edit-submit']";
		 public static final String errorMessage = "xpath=//h2[@class='element-invisible']";
		 
		
		
		 }
}

