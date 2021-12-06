package com.javaex.ex03;

public class MyListApp {

	public static void main(String[] args) {
		
		
		Point p01 = new Point(4,7);
		Circle c01 = new Circle(5);
		
		
		MyList pList = new MyList();
		pList.add(p01);
		
		System.out.println(pList.toString());
		
		MyList cList = new MyList();
		cList.add(c01);
		//cList.add(p01); 오브젝트로 관리해서 이것도 들어갈 수 있으니까 조심
						//하나로 관리할 때 체크하기 어려움 
		System.out.println(cList.toString());
		
		
		
		
		

		
		
		

	}

}