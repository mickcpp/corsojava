public class Pizza {
	
	String impasto;
	String salsa;
	String formaggio;
	String extra;
	String extra2;
	
	Pizza(String impasto){
		this.impasto = impasto;
		System.out.println("ingredienti: " + this.impasto);
	}
	Pizza(String impasto, String salsa){
		this.impasto = impasto;
		this.salsa = salsa;
		System.out.println("ingredienti: " + this.impasto + ", " + this.salsa);
	}
	Pizza(String impasto, String salsa, String formaggio){
		this.impasto = impasto;
		this.salsa = salsa;
		this.formaggio = formaggio;
		System.out.println("ingredienti: " + this.impasto + ", " + this.salsa + ", " + this.formaggio);
	}
	Pizza(String impasto, String salsa, String formaggio, String extra){
		this.impasto = impasto;
		this.salsa = salsa;
		this.formaggio = formaggio;
		this.extra = extra;
		System.out.println("ingredienti: " + this.impasto + ", " + this.salsa + ", " + this.formaggio + ", " + this.extra);
	}
	Pizza(String impasto, String salsa, String formaggio, String extra1, String extra2){
		this.impasto = impasto;
		this.salsa = salsa;
		this.formaggio = formaggio;
		this.extra = extra1;
		this.extra2 = extra2;
		System.out.println("ingredienti: " + this.impasto + ", " + this.salsa + ", " + this.formaggio + ", " + this.extra + ", " + this.extra2);
	}
	
}