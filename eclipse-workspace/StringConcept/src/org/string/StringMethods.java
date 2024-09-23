package org.string;

public class StringMethods {
    public static void main(String[] args) {
	String s="KAVISRI BELONGS TO CSE DEPARTMENT";
	int length = s.length();
	System.out.println(length);
	char charAt = s.charAt(5);
	System.out.println(charAt);
	int indexOf = s.indexOf("C");
	System.out.println(indexOf );
	int lastIndexOf = s.lastIndexOf("T");
	System.out.println(lastIndexOf);
	boolean empty = s.isEmpty();
	System.out.println( empty);
	boolean contains = s.contains("z");
	System.out.println( contains);
//	String trim = s.trim();
//	System.out.println( trim);
	boolean startsWith = s.startsWith("KA");
	System.out.println(startsWith );
	boolean endsWith = s.endsWith("NE");
	System.out.println(endsWith);
	String upperCase = s.toUpperCase();
	System.out.println(upperCase);
	String lowerCase = s.toLowerCase();
	System.out.println(lowerCase);
	boolean endsWith2 = s.endsWith("NT");
	System.out.println(endsWith2);
	String b="KAVI";
	String c="kavi";
	boolean equals = b.equals(c);
	System.out.println(equals);
	boolean equalsIgnoreCase = b.equalsIgnoreCase(c);
	System.out.println(equalsIgnoreCase);
	String replace = b.replace("KA", "PA");
	System.out.println(replace );
	String replaceAll = c.replaceAll("kavi","Jeevi");
	System.out.println(replaceAll);
    String substring = s.substring(8);
	System.out.println(substring);
	String substring2 = s.substring(8,15);
	System.out.println(substring2);
	int compareTo = b.compareTo(c);
	System.out.println(compareTo);
}
}
