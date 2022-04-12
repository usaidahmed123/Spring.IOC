package com.tns.first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
	/*	Airtel a= new Airtel();
		a.Browsing();
		a.Calling();
		
		Jio j= new Jio();
		j.Browsing();
		j.Calling();
		
		*/
		
		
		ApplicationContext u = new ClassPathXmlApplicationContext("beans.xml");
		Sim c = u.getBean("sim",Sim.class);
		c.Browsing();
		c.Calling();
		
		
		
		

	}

}
