package Locators;

import org.openqa.selenium.By;

public class LocatorUtility {

	/**
	 * @param locator
	 * @return
	 */
	public static By getBy(String locator) {
		By temp = null;
		String value = null;
		
		if(locator.indexOf("=") > 0) {
		String[] arrOfStr = locator.split("=", 2);
		locator = arrOfStr[0];
		value = arrOfStr[1];
		switch (locator) {
		case "xpath":
			temp = By.xpath(value);
			break;
			
		case "className":
			temp = By.className(value);
			break;
		case "id":
			temp = By.id(value);
			break;
		case "name":
			temp = By.name(value);
			break;
		case "link":
			temp = By.linkText(value);
			break;
		case "tagname":
			temp = By.tagName(value);
			break;
		case "partiallink":
			temp = By.partialLinkText(value);
			break;
		case "css":
			temp = By.cssSelector(value);
			break;
		}
	}
		
		return temp;
	}
	
	
	/**
	 * @param locator
	 * @param dynamicParameter
	 * @return
	 */
	public static By getBy(String locator,Object... dynamicParameter) {
		By temp = null;
		String[] arrOfStr = locator.split("=", 2);
		locator = arrOfStr[0];
		String value = arrOfStr[1];

			if(value.contains("%s")) {
				temp=By.xpath(String.format(value, dynamicParameter));
			}
			return temp;
	
	}
	
	/**
	 * @param locator
	 * @return
	 */
	public static String getLocatorType(String locator) {
		
		String[] arrOfStr = locator.split("=", 2);
		String locatorType=locator = arrOfStr[0];
		
		return locatorType;
	}


}
