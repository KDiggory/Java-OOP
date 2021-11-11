package com.bae.polymorphism;

public class ChocolateCake extends Cakes {

	public ChocolateCake() {
		super();
		
	}
	
	@Override
	public void icing() {
		boolean icing = true;
		System.out.println("Icing: " + icing);
		
	}
	
	@Override
	public void flavour() {
		System.out.println("Flavour: Chocolate");
		
	}
	
	

}
