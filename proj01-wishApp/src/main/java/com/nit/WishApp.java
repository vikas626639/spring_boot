package com.nit;

import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Component;
@Component		//indicate this class is a spring bean
public class WishApp {
	
	public String WishMsg(String name,Date date) {
		Calendar cal=null;	
		int hour=0;
		String msg="";
		try {
			//creating the object of calendar 
			cal=Calendar.getInstance();		//calendar object created
			hour=cal.get(Calendar.HOUR_OF_DAY);
			//writing condition
			msg=(hour<=12)?"Good Morning":(hour<=15)?"Good AfterNoon":(hour<=18)?"Good Evening":"Good Night";
			//print the message
			System.out.println("hey.. "+name+" "+msg+" and today date is="+date);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}
}
