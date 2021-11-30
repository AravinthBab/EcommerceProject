package org.mavenpom;

import org.openqa.selenium.WebElement;

public interface SeleniumAPI {
	
	/**
	 * This method will launch the chrome browser with the given URL
	 * @author Aravinth
	 * @param url
	 * @exception NullPointerException, InvalidArgumentException
	 */
  void setup(String url);
  
     /**
	 * This method will launch the given browser with the given URL
	 * @author Aravinth
	 * @param url
	 * @param browserName
	 */
  void setup(Browser browserName, String url);
  
   /**
   * This function is used to close the active browser
   * @author Aravinth
   */
   void close();
   
   /**
    * This function is used to quit the driver instance
    * @author Aravinth
    */
   void quit();
   
   /**
    * This method is used to find any webelement with in the page
    * @param type- element type eg - id,name or linkText
    * @param value - element value
    * @return WebElement
    */
   WebElement element(Locators type, String value);
   
   /**
	 * This function is used to switch to specific tab
	 * @author Aravinth
	 * @param i
	 */
	void switchToWindow1(int i);
 
	/**
	 * This function is used to select the dropdown with the given value
	 * @author Aravinth
	 * @param ele
	 * @param value
	 */
	void selectValue(WebElement ele, String value);
	
	/**
	 * This function is used to select the dropdown with the given text
	 * @author Aravinth
	 * @param ele
	 * @param text
	 */
	void selectText(WebElement ele,String text);
	
	/**
	 * This function is used to select the dropdown with the given position
	 * @author Aravinth
	 * @param ele
	 * @param position
	 */
	void selectIndex(WebElement ele , int position);

	/**
	 * @author Aravinth
	 * This function will wait until the element is clickable and then click
	 * @param ele
	 */
	void click(WebElement ele);
	
	/**
	 * This function will wait until the element is ready and clear the existing value and type
	 * @param ele
	 * @param testData
	 */
	void type(WebElement ele, String testData);
	
	/**
	 * This function will wait until the element is ready and gets the input
	 * @param ele
	 * @param testData
	 */
	void appendText(WebElement ele, String testData);
	
	/**	
	 * This function return the active page title
	 * @return String
	
	 */
	String getTitle();

	/**	
	 * This function return the active page URL
	 * @return String
	 */
	String getURL();
	
	/**	
	 * This function return the element is visible or not
	 * @return boolean
	 */
	boolean isDisplayed(WebElement ele);
	
	/**
	 * This function return the element is enabled or not
	 * @param ele
	 * @return boolean
	 */
	boolean isEnabled(WebElement ele);
	
	/**
	 * This function return the element is selected or not
	 * @param ele
	 * @return Boolean
	 */
	boolean isSelected(WebElement ele);
}
	
   
   
   
   
   
   
   
   
   

