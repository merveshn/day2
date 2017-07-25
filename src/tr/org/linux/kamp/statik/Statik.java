package tr.org.linux.kamp.statik;

public class Statik {

	public static String myString="Bu bir statik string";
	
	public static String staticMethod() {
		return "bu bir statik metod";
	}
	
	static {
		System.out.println("bu bir statik blok");
	}

	static {
		System.out.println("bu da bir static blok");
	}

}
