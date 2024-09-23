package org.phone;
//Child Class

public class InternalStorage {
	private void processorName() {
        System.out.println("My Processor Name is i5");
	}
	private void ramSize() {
		System.out.println("My RAM Size is 400");
	}
public static void main(String[] args) {
	InternalStorage a=new InternalStorage();
	a.processorName();
	a.ramSize();
	ExternalStorage b=new ExternalStorage();
	b.phoneSize();
}	
	
	
	
	
	
	
	
	

}
