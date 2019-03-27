package com.niit.springcore;

public class Triangle {
	
	private String type;
	private int height;
	
	public Triangle(String type) {
		
		this.type = type;
	}

	public Triangle(int height) {
		
		this.height = height;
	}

	public Triangle(String type, int height) {
	
		this.type = type;
		this.height = height;
	}

	public void draw()
	{
		System.out.println(this.type + "Triangle is drawn of height "+this.height);
	}
	
}
