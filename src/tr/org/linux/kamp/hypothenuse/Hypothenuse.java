package tr.org.linux.kamp.hypothenuse;

import java.math.*;
import java.util.Scanner;

public class Hypothenuse {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter height and width: ");

		int h = input.nextInt();
		int w = input.nextInt();
		int hypo = (int) (Math.hypot(h, w));
		System.out.println("Hypothenuse: " + hypo);
		System.out.println("Area of triangle: " + getArea(h, w));
		System.out.println("Perimeter of triangle: " + getPerimeter(w, h, hypo));
		
	}

	private static int getArea(int he, int we) {
		return he * we / 2;
	}

	private static int getPerimeter(int we, int he, int hypo) {
		return we + he + hypo;
	}
}
