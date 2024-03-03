package com.nit.bean;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("wmg")
public class WishMessageGenarator {
	@Autowired
	public Calendar calendar;
	
	//b.logic
	public String registerMessage(String name){
		int hour=calendar.get(calendar.HOUR_OF_DAY);
		if(hour<12)
			return "good nigth "+name;
		else if(hour<16)
			return "good afternoon "+name;
		else if(hour<20)
			return "good evening "+name;
		else
			return "good mong "+name;		
	
	}
 
}
