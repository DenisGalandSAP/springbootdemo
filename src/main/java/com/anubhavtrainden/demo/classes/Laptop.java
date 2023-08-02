package com.anubhavtrainden.demo.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {

	public Laptop() {
		super();
	}

	@Override
	public String toString() {
		return "Laptop [length=" + length + ", width=" + width + ", weight=" + weight + ", brandName=" + brandName
				+ "] and is running with " + hdd.read();
	}
	
	//This is a dependancy
	@Autowired	
	private IHardDisk hdd;

	private int length;
	private int width;
	private int weight;
	private String brandName;
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
}
