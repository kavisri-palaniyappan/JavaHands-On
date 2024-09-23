package org.company;
//Method Overloading
//Same Class
//Same Method
//Different Arguments
//Arg depends on datatype
//public class EmplooyeeDetails {
//private void empName(String name) {
//	System.out.println("Employee Name is "+name);
//}
//private void empName(int age) {
//	System.out.println("Employee Age is "+age);
//}
//public static void main(String[] args) {
//	EmplooyeeDetails a=new EmplooyeeDetails();
//	a.empName("KAVI");
//	a.empName(20);
//	a.empName("JEEVI");
//	a.empName(20);
//	a.empName("ASMAA");
//	a.empName(20);
//	
//}
//}
//Arg depends on datatype count
//public class EmplooyeeDetails {
//private void empName(String name,int a) {
//	System.out.println("Employee Name is "+name+"\n"+"Employee Age is "+a);
//}
//private void empName(int age) {
//	System.out.println("Employee Age is "+age);
//}
//public static void main(String[] args) {
//	EmplooyeeDetails a=new EmplooyeeDetails();
//	a.empName("KAVI",20);
//	a.empName(40);
//	a.empName("JEEVI",20);
//	a.empName(30);
//	a.empName("ASMAA",20);
//	a.empName(50);	
//}
//}
//Arg depends on datatype order
//public class EmplooyeeDetails {
//private void empName(String name,int a) {
//	System.out.println("Employee Name is "+name+"\n"+"Employee Age is "+a);
//}
//private void empName(int age,String n) {
//	System.out.println("Employee Age is "+age+"\n"+"Employee Name is "+n);
//}
//public static void main(String[] args) {
//	EmplooyeeDetails a=new EmplooyeeDetails();
//	a.empName("KAVI",20);
//	a.empName(20,"PRADEE");
//	a.empName("JEEVI",20);
//	a.empName(20,"ANU");
//	a.empName("ASMAA",20);
//	a.empName(20,"KANI");
//	
//}
//}
//This-->Keyword(Method Calling in Same Class          
//public class EmplooyeeDetails {
//private void empName(String name) {
//	System.out.println("Employee Name is "+name);
//	this.empName(10);
//	this.empName('m');
//}
//private void empName(int age) {
//	System.out.println("Employee Age is "+age);
//}
//private void empName(char a) {
//	System.out.println("Employee Age is "+a);
//}
//public static void main(String[] args) {
//	EmplooyeeDetails a=new EmplooyeeDetails();
//	a.empName("KAVI");
//	a.empName("JEEVI");
//	a.empName("ASMAA");	
//}
//}
//Super-->Keyword(Method Calling in Different Class)
public class EmplooyeeDetails extends CompanyInfo{
private void empName(String name) {
	System.out.println("Employee Name is "+name);
	this.empName(10);
	this.empName('m');
	super.empName(123);
	
}
//private void empName(int age) {
//	System.out.println("Employee Age is "+age);
//}
private void empName(char a) {
	System.out.println("Employee Age is "+a);
}
public static void main(String[] args) {
	EmplooyeeDetails a=new EmplooyeeDetails();
	a.empName("KAVI");
	a.empName("JEEVI");
	a.empName("ASMAA");
		
}
}


