package org.array;

public class TwoDimensional {
	public static void main(String[] args) {
		
//	int a[][]=new int [2][2];
//	a[0][0]=63;
//	a[0][1]=79;
//	a[1][0]=46;
//	a[1][1]=17;
//	
//   //Nested For loop -->Index Based
//	for (int i=0;i<=1;i++)
// 	{
//		for (int j=0;j<=1;j++) {
//			System.out.println(a[i][j]);
//		}	
// 	}
//	System.out.println("================");
//	
//   //Nested Enhanced for loop
//	for(int[] b:a) {
//		for(int c:b) {
//			System.out.println(c);
//		}
//	}
		
		
		
		
//[3][3]
		
		int a[][]=new int [3][3];
		a[0][0]=1;
		a[0][1]=2;
		a[0][2]=3;
		a[1][0]=4;
		a[1][1]=5;
		a[1][2]=6;
		a[2][0]=7;
		a[2][1]=8;
		a[2][2]=9;
		
	   //For loop -->Index Based
		for (int i=0;i<a.length;i++)
	 	{
			for (int j=0;j<a.length;j++) {
				System.out.println(a[i][j]);
			}	
	 	}
		System.out.println("================");
		
	   //nested Enhanced for loop
		for(int[] b:a) {
			for(int c:b) {
				System.out.println(c);
			}
		}

		
	
}
}