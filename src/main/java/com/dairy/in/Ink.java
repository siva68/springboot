package com.dairy.in;

import org.springframework.stereotype.Component;

@Component
public class Ink 
{
	String name;
	String colour;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	@Override
	public String toString() {
		return "Ink [name=" + name + ", colour=" + colour + "]";
	}
	

}
