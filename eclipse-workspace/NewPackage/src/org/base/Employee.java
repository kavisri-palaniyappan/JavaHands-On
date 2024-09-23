package org.base;
//Child Class

public class Employee extends Company{
	private void empId() {
		System.out.println("Emp ID is 0315");
	}
	private void empName() {
	System.out.println("Emp Name is Kavi");
	}
public static void main(String[] args) {
	Employee a=new Employee();
	a.empId();
	a.empName();
	a.compId();
	a.compName();
	a.staffId();
	a.staffName();
	
	
	
	
	
	
	
//	Company b=new Company();
//	b.compId();
//	b.compName();
}
}
