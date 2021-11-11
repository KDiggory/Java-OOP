package com.bae.interfaces;

public class Oak extends TreeType implements Seeds{
	
	public Oak() {
		super();
	}
	
	@Override
	public void leafShape() {
		String leaf = "Oblong to ovate ";
		System.out.println("The Maple leaf type is: " + leaf);
	}

	@Override
	public void evergreen() {
		Boolean evergreen = false;
		System.out.println("Oak trees are evergreen: " + evergreen);
	}

	@Override
	public void seeds() {
		System.out.println("acorns");
		
	}

}
