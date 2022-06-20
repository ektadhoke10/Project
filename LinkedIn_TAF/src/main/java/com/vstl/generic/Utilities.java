package com.vstl.generic;

import java.util.Random;

import org.openqa.selenium.WebDriver;

public class Utilities {
	WebDriver driver =null;

	public String getFirstNameOnFacebookSignupPage() {
		Random objRandom= new Random();	
		String [] strArrayOfFirstName = { "Shikhar","Ravindra","Rohit","Virat","Ajinkya","Cheteshwar",};
		String strFname =strArrayOfFirstName[objRandom.nextInt(strArrayOfFirstName.length)];
		return strFname;
	}

	public String getLastNameOnFacebookSignupPage() {
		Random objRandom= new Random();	
		String [] strArrayOfLastName = { "Pujara","Sharma","Rahane","Jadeja","Dhawan","Kohli",};
		String strLname=strArrayOfLastName[objRandom.nextInt(strArrayOfLastName.length)];
		return strLname;	
	}
	
	public String getRandomNumber() {
		String allowChar = "0123456789";
		String randomString="";
		for (int intIndex = 0; intIndex <8; intIndex++) {
			int intNum= (int) Math.floor(Math.random()*allowChar.length());
			randomString+= allowChar.substring(intNum, intNum+1);
		}
		return randomString;
	}
	
	public String getRandomNumberWithString() {
		String allowChar = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM0123456789";
		String randomString="";
		for (int intIndex = 0; intIndex <8; intIndex++) {
			int intNum= (int) Math.floor(Math.random()*allowChar.length());
			randomString+= allowChar.substring(intNum, intNum+1);
		}
		return randomString;
	}
	
	
	public String getMobileNumberForFacebookSignupPage() {
		//print first two digits
		String strArray []= {"99","98","89","90"};
		String strStartingNumber =strArray[new Random().nextInt(strArray.length)];

		// print next 8 digits

		String allowChar = "0123456789";
		String randomString="";
		for (int intIndex = 0; intIndex <8; intIndex++) {
			int intNum= (int) Math.floor(Math.random()*allowChar.length());
			randomString+= allowChar.substring(intNum, intNum+1);
		}
		return strStartingNumber+randomString;
	}

	public String getDate(){
		try {			
			String strRandomDay=" ";
			int intRandomDay = (int) (Math.random()*30);
			if(intRandomDay==0);
			strRandomDay="30";
			strRandomDay = String.valueOf(intRandomDay).trim();
			return strRandomDay;				
		}catch(Exception exception) {
			System.out.println("Error msg==>"+ exception.getMessage());
			return "";
		}
	}

	public String getMonth() {
		try {			
			String strRandomMonth=" ";
			int intRandomMonth = (int) (Math.random()*12);
			if(intRandomMonth==0);
			strRandomMonth="12";
			strRandomMonth = String.valueOf(intRandomMonth).trim();
			return strRandomMonth;				
		}catch(Exception exception) {
			System.out.println("Error msg==>"+ exception.getMessage());
			return "";
		}	
	}

	public String getYear() {
		Random objRandom= new Random();
		int intMinYear = 1905;
		int inMaxYear = 2022;
		int intYears = objRandom.nextInt(inMaxYear-intMinYear) + intMinYear;
		String strYears=Integer.toString(intYears);
		return strYears;

	}
	public static int getGenderForFacebookSignupPage() {
		Random objRandom= new Random();
		int intNum = objRandom.nextInt(3)+1;
		return intNum;

	}
}
