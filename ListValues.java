package org.string;

import java.util.ArrayList;
import java.util.List;


public class ListValues {
	public static void main(String[] args) {
		List li=new ArrayList();
		li.add(10);
		li.add(true);
		li.add(null);
		li.add("Diya");
		li.add(55.56);
		li.add(123.000f);
		li.add(10);
		
		System.out.println(li);
		System.out.println("=============================");
		
		for(int i=0;i<li.size();i++) {
			System.out.println(li.get(i));
		}
		
		System.out.println("=============================");
		
	Object object=li.get(3);
	System.out.println(object);
	
	Object object1=li.get(4);
	System.out.println(object1);
		
	
//	   for each loop
		
		List <Object> li1=new ArrayList<>();
		li1.add(10);
		li1.add(true);
		li1.add(null);
		li1.add("Diya");
		li1.add(55.56);
		li1.add(123.000f);
		li1.add(10);
		
		System.out.println("=============================");
		
		
		for (Object li2:li1) {
			System.out.println(li2);
		}
		

		
	}

}
