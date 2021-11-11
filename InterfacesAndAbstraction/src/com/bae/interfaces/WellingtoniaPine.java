package com.bae.interfaces;

public class WellingtoniaPine extends TreeType implements Seeds{
	
	public WellingtoniaPine() {
		super();
	}
	
	@Override
	public void leafShape() {
		String leaf = "scale like needles";
		System.out.println("The Maple leaf type is: " + leaf);
	}

	@Override
	public void evergreen() {
		Boolean evergreen = true;
		System.out.println("Maples are evergreen: " + evergreen);
	}

	@Override
	public void seeds() {
		System.out.println("pinecones");
		
	}
	
	

}
