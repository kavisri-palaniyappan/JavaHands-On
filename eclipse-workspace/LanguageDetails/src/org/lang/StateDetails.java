package org.lang;

public class StateDetails {
	private void southIndia() {
		System.out.println("SouthIndian's are 30,000");
	}
	private void northIndia() {
		System.out.println("NorthIndian's are 20,000");

	}
public static void main(String[] args) {
		LanguageInfo a=new LanguageInfo();
		a.tamilLanguage();
		a.englishLanguage();
		a.hindiLanguage();
		StateDetails b=new StateDetails();
		b.southIndia();
		b.northIndia();
	

}
}
