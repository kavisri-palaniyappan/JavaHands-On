package org.amazonlogin;
public class LoginPage {
private void userName(String name) {
System.out.println("Enter Your Name:"+name);
}
private void password(int pw) {
System.out.println("Enter Your Password:"+pw);
}
public static void main(String[] args) {
	LoginPage a=new LoginPage();
	a.userName("KAVISRI");
	a.password(123456789);
}
}
