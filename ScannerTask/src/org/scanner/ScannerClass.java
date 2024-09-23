package org.scanner;
import java.util.Scanner;
public class ScannerClass {
      public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String nextLine = sc.nextLine();
		System.out.println(nextLine);
		
		String next = sc.next();
		System.out.println(next);
		
		int nextInt = sc.nextInt();
		System.out.println(nextInt);
		
		byte nextByte = sc.nextByte();
		System.out.println(nextByte);
		
		short nextShort = sc.nextShort();
		System.out.println(nextShort);
		
		float nextFloat = sc.nextFloat();
		System.out.println(nextFloat);
		
		long nextLong = sc.nextLong();
		System.out.println(nextLong);
		
		boolean nextBoolean = sc.nextBoolean();
		System.out.println(nextBoolean);
		
		double nextDouble = sc.nextDouble();
		System.out.println(nextDouble);
	}
}

