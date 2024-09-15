package com.dairy.in;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependancyssApplication {

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext context=SpringApplication.run(DependancyssApplication.class, args);
	   Ink ink=new Ink();
	   ink.setColour("blue");
	   ink.setName("Ekless");
	   Pen pen=new Pen();
	   pen.setInk(ink);
	context.getBean(Pen.class);
	System.out.println(pen.getInk());
	
	}

}
