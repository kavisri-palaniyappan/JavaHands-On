package org.task;
//To find Second Maximum Value in Java
import java.util.Scanner;
public class NewTask {
	public static void main(String[] args) {
	try (Scanner sc = new Scanner(System.in)) {
	int n=sc.nextInt();
	   int arr[]=new int[n];
	   for(int i=0;i<n;i++)
	   {
		   arr[i]=sc.nextInt();
	   }
	   int m1=arr[0];
	   for( int i=1;i<n;i++)
	   {
		   if(arr[i]>m1)
		   {
			   m1=arr[i];		  
		   }
	   }
	   int m2=arr[0];
	   for( int i=1;i<n;i++)   
	   {
		   if(arr[i]!=m1)
		   { if(arr[i]>m2)
		   {
			   m2=arr[i];		  
		   }
		   }
	   }
       System.out.println(m2);
}
}
}
