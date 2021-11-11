package com.bae.abstraction;

public class MagicalTree extends AbstractTree {
	
	

	public MagicalTree() {
		super();
		
	}

	@Override
	public void evergreen() {
		System.out.println("This tree is not evergreen");
		
		
	}

	@Override
	public void hasSquirrel() {
		System.out.println("There is a squirrel in this tree!");
		
		
	}

	@Override
	public void hasOwl() {
		System.out.println("There are two owls in the tree");
				
	}
	
	@Override
	public void bearsFruit() {
		System.out.println("apples, pears and cherries");
		
	}
	@Override
	public void seeds() {
		System.out.println("pinecones and lots of flowers");
		
	}

}
