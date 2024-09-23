package org.array;

public class OneDimensional {
      public static void main(String[] args) {
    	  //datatype var []=new datatype[size]
    	  //index(0 to n-1) = value(1 to n)
		int a[]=new int [6];
		a[0]=63;
		a[1]=79;
		a[2]=46;
		a[3]=07;
		a[4]=15;
		a[5]=99;
		//for loop-->Index Based(0 to n-1)
		for(int i=0;i<=5;i++) {
			System.out.println(a[i]);
		}
		System.out.println("===========");
		for(int b:a) {
			System.out.println(b);
		}
	}
}
