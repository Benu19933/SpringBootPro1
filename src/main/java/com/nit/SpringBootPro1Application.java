package com.nit;

import java.util.Calendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nit.bean.WishMessageGenarator;

@SpringBootApplication
public class SpringBootPro1Application {
	
	@Bean(name="cal")
	public Calendar createCalender() {
		return Calendar.getInstance();	
	}

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringBootPro1Application.class, args);
		WishMessageGenarator wmg=ctx.getBean("wmg",WishMessageGenarator.class);
		String result=wmg.registerMessage("benu");
		System.out.println(result);
		
		((ConfigurableApplicationContext) ctx).close();
		
		
	}

}
