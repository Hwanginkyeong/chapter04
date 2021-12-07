package com.javaex.ex04;

import java.util.HashSet;
import java.util.Set;

public class Ex02 {

	public static void main(String[] args) {
		
		Integer i01 = new Integer(3);
		Integer i02 = new Integer(24);
		Integer i03 = new Integer(7);
		
		Set<Integer> iSet = new HashSet<Integer>();
		iSet.add(i01);
		iSet.add(i02);
		iSet.add(i03); 
		
		for(Integer no : iSet) {
			System.out.println(no.toString());
		}
		
		System.out.println("---------------------");
		
		//Point 관리 
		Point p01 = new Point(3, 13);
		Point p02 = new Point(4, 14);
		Point p03 = new Point(5, 15);
		
		Set<Point> pSet = new HashSet<Point>();
		pSet.add(p01);
		pSet.add(p02);
		pSet.add(p03);
		
		for(Point i: pSet) {
			System.out.println(i.getX());
		}
		
		
		
	}

}
