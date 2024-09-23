package org.ssample;
//Child Class
import org.base.Company;

public class Master extends Company{
	private void masterId() {
		System.out.println("Master ID is 123456");
	}
	private void masterName() {
		System.out.println("Master Name is Pradeepa");
	}
public static void main(String[] args) {
	Master a=new Master();
	a.masterId();
	a.masterName();
	a.compName();
	a.compId();
//	Company b=new Company();
//	b.compId();
//	b.compName();
}
}
