package com.bae.interfaces;

import com.bae.abstraction.AbstractTree;
import com.bae.abstraction.MagicalTree;

public class TreeRunner {
	
	public static void main(String[] args) {
		TreeType maple = new Maple();
		TreeType oak = new Oak();
		TreeType pine = new WellingtoniaPine();
		AbstractTree magical = new MagicalTree();
		
		maple.evergreen();
		maple.leafShape();
		((Maple) maple).bearsFruit();
		
		oak.evergreen();
		oak.leafShape();
		((Oak) oak).seeds();
		
		
		pine.evergreen();
		pine.leafShape();
		((WellingtoniaPine) pine).seeds();
		
		
		magical.evergreen();
		magical.leafShape();
		magical.bearsFruit();
		magical.seeds();
		magical.hasOwl();
		magical.hasSquirrel();
		
		
		
		
	}

}
