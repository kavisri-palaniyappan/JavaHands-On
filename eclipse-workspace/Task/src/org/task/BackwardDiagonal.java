package org.task;
import java.util.Scanner;
public class BackwardDiagonal {
		public static void main(String[] args) {
			try (Scanner sc = new Scanner(System.in)) {
			int rs=sc.nextInt();
			int cs=sc.nextInt();
			   int a[][]=new int[rs][cs];
			   for(int i=0;i<rs;i++)
			   {for(int j=0;j<cs;j++) {
				   a[i][j]=sc.nextInt();}
			   }
			   int bd=0;
			   for( int i=0;i<rs;i++)
			   {
				   for( int j=0;j<cs;j++)
				   {
					   if(i==cs-1-j) {
					   bd=bd+a[i][j];
				   }
			   }
			   }
		       System.out.println("BD="+bd);
		}
		}
		}




