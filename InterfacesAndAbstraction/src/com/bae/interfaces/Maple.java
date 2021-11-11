package com.bae.interfaces;

public class Maple extends TreeType implements Fruit {

	public Maple() {
		super();
	}
	
	@Override
	public void leafShape() {
		String leaf = "palmate veined and lobed";
		System.out.println("The Maple leaf type is: " + leaf);
	}

	@Override
	public void evergreen() {
		Boolean evergreen = false;
		System.out.println("Maples are evergreen: " + evergreen);
	}

	@Override
	public void bearsFruit() {
		System.out.println("maple syrup");
		
	}
	

}
