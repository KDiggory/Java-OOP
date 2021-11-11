package com.bae.polymorphism;

public class Runner {
	
	public static void main(String[] args) {
		
		Cakes choc = new ChocolateCake();		
		Cakes glutenFree = new GlutenFreeCake();
		
		ChocolateCake choc2 = new ChocolateCake();		
		GlutenFreeCake glutenFree2 = new GlutenFreeCake();
		
		Object choc3 = new ChocolateCake();		
		Object glutenFree3 = new GlutenFreeCake();
		System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~ AS CAKES ~~~~~~~~~~~~~~~~~~~~~~~~~~");
		choc.hasFlour();
		choc.icing();
		choc.flavour();
		choc.serves();
		glutenFree.hasFlour();
		glutenFree.icing();
		glutenFree.flavour();
		glutenFree.serves();
		
		System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~ AS SPECIFIC CAKES ~~~~~~~~~~~~~~~~~~~~~~~~~~");
		choc2.hasFlour();
		choc2.icing();
		choc2.flavour();
		choc2.serves();
		glutenFree2.hasFlour();
		glutenFree2.icing();
		glutenFree2.flavour();
		glutenFree2.serves();
		
		System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~ AS OBJECTS ~~~~~~~~~~~~~~~~~~~~~~~~~~");
		((ChocolateCake) choc3).hasFlour();
		((ChocolateCake) choc3).icing();
		((ChocolateCake) choc3).flavour();
		((ChocolateCake) choc3).serves();
		((GlutenFreeCake) glutenFree3).hasFlour();
		((GlutenFreeCake) glutenFree3).icing();
		((GlutenFreeCake) glutenFree3).flavour();
		((GlutenFreeCake) glutenFree3).serves();
		
		
		
		
		
	}

}
