package tr.org.linux.kamp.sphere;
import java.math.*;
import java.util.Scanner;

public class Sphere {

	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter radius: ");
		int radius= sc.nextInt();
		System.out.println("Volume of sphere is: " + volume(radius));
		
	}
	
	private static double volume(int r) {
		
		return Math.PI*Math.pow(r, 3)*4/3;
		
	}
	
}
