package org.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetFunction {
	
	
public static void main(String[] args) {
	
	Set <Object> s=new HashSet<>();
	 s.add(10);
	 s.add('P');
	 s.add("Diya");
	 s.add(22.45);
	 s.add(34.1234f);
	 s.add(10123456l);
	 
	 for(Object s1:s) {
		 System.out.println(s1);
	 }
	 
	 
	 System.out.println("==============================");
	
	 Set <Object> s2=new LinkedHashSet<>();
	 s2.add(10);
	 s2.add('P');
	 s2.add("Diya");
	 s2.add(22.45);
	 s2.add(34.1234f);
	 s2.add(10123456l);
	 
	 for(Object s3:s2) {
		 System.out.println(s3);
	 }
	 
	 System.out.println("==============================");
		
	 Set <Object> s4=new TreeSet<>();
	 s4.add(10);
	 s4.add(20);
	 s4.add(30);
	 s4.add(40);
	 s4.add(5);
	 s4.add(1);
	 
	 for(Object s5:s4) {
		 System.out.println(s5);
	 }
	
	
}	

}
