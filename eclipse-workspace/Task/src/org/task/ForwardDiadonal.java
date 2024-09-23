package org.task;
import java.util.Scanner;
public class ForwardDiadonal {
		public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
		int rs=sc.nextInt();
		int cs=sc.nextInt();
		   int a[][]=new int[rs][cs];
		   for(int i=0;i<rs;i++)
		   {for(int j=0;j<cs;j++) {
			   a[i][j]=sc.nextInt();}
		   }
		   int fd=0;
		   for( int i=0;i<rs;i++)
		   {
			   for( int j=0;j<cs;j++)
			   {
				   if(i==j) {
				   fd=fd+a[i][j];
			   }
		   }
		   }
	       System.out.println("FD="+fd);
	}
	}
	}

