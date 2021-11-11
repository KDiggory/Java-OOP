package com.bae.abstraction;

import com.bae.interfaces.Fruit;
import com.bae.interfaces.Seeds;
import com.bae.interfaces.Tree;

public abstract class AbstractTree implements Tree, Seeds, Fruit {
	
	@Override
	public void leafShape() {
		String leaf = "Elliptic";
		System.out.println("The default leaf type is set as: " + leaf);
	}

	@Override
	public void seeds() {
		System.out.println("pinecones");
		
	}
	
	@Override
	public void bearsFruit() {
		System.out.println("apples");
		
	}
	
	public abstract void hasSquirrel();
	
	public abstract void hasOwl();
	
	public void isTree() {
		Boolean isTree = true;
		System.out.println(isTree);
	}
	
	
	
	 

}
