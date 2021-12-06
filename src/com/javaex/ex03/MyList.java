package com.javaex.ex03;

import java.util.Arrays;

public class MyList<T> {
	
	//필드
	private T[] pArray;
	private int crtPos;
	
	//생성자
	public MyList() {
		this.pArray = (T[])new Object[3];
		this.crtPos = 0;
	}
	
	
	//메소드 g/s
	
	//메소드 일반
	public void add(T o) {
		pArray[crtPos] = o;
		crtPos++;
	}
	
	public Object get(int index) {
		Object result = pArray[index];
		return result;
	}
	
	public int size() {
		return crtPos;
	}


	@Override
	public String toString() {
		return "MyList [oArray=" + Arrays.toString(pArray) + ", crtPos=" + crtPos + "]";
	}
	
	
	
	

}