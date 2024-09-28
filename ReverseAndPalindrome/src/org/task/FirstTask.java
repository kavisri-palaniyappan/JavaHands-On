package org.task;

public class FirstTask {
	public static void main(String[] args) {
		 String s="MADAM";
		 String a="";
	     for(int i=s.length()-1;i>=0;i--) {
//	    	   System.out.println(s.charAt(i));
	    	 a=a+s.charAt(i);
	     }
	     System.out.println(a);
	     if(s.equals(a)) {
	    	 System.out.println("Given String is Palindrome");
	     }
	     else {
	    	 System.out.println("Given String is Not a Palindrome");
	     }
	}
    
}
