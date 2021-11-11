package com.bae.interfaces;

public class TreeType implements Tree{
	
	

	public TreeType() {
		super();
		
	}

	@Override
	public void leafShape() {
		String leaf = "Elliptic";
		System.out.println("The default leaf type is set as: " + leaf);
	}

	@Override
	public void evergreen() {
		Boolean evergreen = false;
		System.out.println("Is this tree is evergreen: " + evergreen);
		
		
	}

}
