package com.yash.assignment;

import java.util.Arrays;
import java.util.List;

import com.yash.exception.NoSuchElementFoundException;

public class ArrayElementReplacement {

	public List<Integer> replaceElement(int element,int replacement,List<Integer> list) {
		if(list.contains(element)) {
			int index=list.indexOf(element);
			list.set(index, replacement);
		}
		else
			throw new NoSuchElementFoundException("Element does not exist in the arraylist");
		
		return list;
	}
	
public static void main(String args[]) {
	ArrayElementReplacement arrayElementReplacement=new ArrayElementReplacement();
	System.out.println(arrayElementReplacement.replaceElement(25, 6, Arrays.asList(55,25,368)));
}
}
