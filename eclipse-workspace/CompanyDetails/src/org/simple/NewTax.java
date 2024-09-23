package org.simple;
//Child Class in Method Overriding
public class NewTax extends OldTax{
	public void taxLimit(int tax) {
		System.out.println("New Tax Limit is "+tax); 
		super.taxLimit(2500000);
	}
 public static void main(String[] args) {
	NewTax a=new NewTax();
	a.taxLimit(500000);
}

}
