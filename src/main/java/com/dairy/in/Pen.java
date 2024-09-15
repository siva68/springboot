package com.dairy.in;

import org.springframework.stereotype.Component;

@Component
public class Pen
{
	Ink ink;

	public Ink getInk() {
		return ink;
	}

	public void setInk(Ink ink) {
		this.ink = ink;
	}

	@Override
	public String toString() {
		return "Pen [ink=" + ink + "]";
	}
	

}
