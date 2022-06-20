package com.vstl.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumWrapperFunctions {
	private Pojo objPojo;
	public SeleniumWrapperFunctions(Pojo pojo) {
		this.objPojo=pojo;
	}

	//sendkeys
	public boolean setText(By locators, String strInputvaule) {
		try {
			objPojo.getDriver().findElement(locators).sendKeys(strInputvaule);
			return true;
		} catch (Exception exception) {
			System.out.println("Error :" + exception.getMessage());
			exception.printStackTrace();
			return false;
		}
	}

	//getText
	public String getText(By locators) {
		try {
			String strGetValue= objPojo.getDriver().findElement(locators).getText();
			return strGetValue;
		} catch (Exception exception) {
			System.out.println("Error :" + exception.getMessage());
			exception.printStackTrace();
			return null;
		}
	}

	//Click
	public boolean click(By locators) {
		try {
			objPojo.getDriver().findElement(locators).click();
			return true;
		} catch (Exception exception) {
			System.out.println("Error :" + exception.getMessage());
			exception.printStackTrace();
			return false;
		}
	}

	// DropDown
	public boolean selectDropDown(By locator, String selectValue) {
		try {
			Select selectDropDown = new Select(objPojo.getDriver().findElement(locator));
			selectDropDown.selectByVisibleText(selectValue);
			return true;
		} catch (Exception exception) {
			System.out.println("Error Occured in DropDown is : " + exception.getMessage());
			exception.printStackTrace();
			return false;
		}
	}
	
	//checkBox
	public boolean selectCheckBox(By locators) {
		
		try {
			WebElement checkBox= objPojo.getDriver().findElement(locators);
			System.out.println(checkBox.isSelected());
			
			if (checkBox.isSelected()) 
				System.out.println("Selected");
			else 
				System.out.println("not selected");
				return true;
		} catch (Exception exception) {
			System.out.println("Error :" + exception.getMessage());
			exception.printStackTrace();
			return false;
		}

	}

	//submit
	public boolean clickSubmit(By locators) {
		try {
			objPojo.getDriver().findElement(locators).submit();
			return true;
		} catch (Exception exception) {
			System.out.println("Error :" + exception.getMessage());
			exception.printStackTrace();
			return false;
		}
	}

	//clear
	public boolean clear(By locators) {
		try {
			objPojo.getDriver().findElement(locators).clear();
			return true;
		} catch (Exception exception) {
			System.out.println("Error :" + exception.getMessage());
			exception.printStackTrace();
			return false;
		}
	}
	// Mouse Hover

	public boolean checkMouseHover(By locator) {

		try {
			WebElement mouseHover = objPojo.getDriver().findElement(locator);
			Actions action = new Actions(objPojo.getDriver());
			action.moveToElement(mouseHover).perform();
			return true;
		} catch (Exception exception) {
			System.out.println("Error message is : " + exception.getMessage());
			exception.printStackTrace();
			return false;
		}
	}
	
	// slider

		public boolean checkSliderMovement(By locator) {

			try {
				WebElement slider = objPojo.getDriver().findElement(locator);
				Actions action = new Actions(objPojo.getDriver());
				action.moveToElement(slider).perform();
				action.dragAndDropBy(slider, 100,200);
				return true;
			} catch (Exception exception) {
				System.out.println("Error message is : " + exception.getMessage());
				exception.printStackTrace();
				return false;
			}
		}

	//getSize
	public boolean getSize(By locators) {
		try {
			objPojo.getDriver().findElement(locators).getSize();
			return true;
		} catch (Exception exception) {
			System.out.println("Error :" + exception.getMessage());
			exception.printStackTrace();
			return false;
		}
	}

//	//isSelected
//	public boolean isSelected(By locators) {
//		try {
//			objPojo.getDriver().findElement(locators).isSelected();
//			return true;
//		} catch (Exception exception) {
//			System.out.println("Error :" + exception.getMessage());
//			exception.printStackTrace();
//			return false;
//		}
//	}




}
