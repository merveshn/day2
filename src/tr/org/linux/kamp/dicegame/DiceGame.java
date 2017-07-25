package tr.org.linux.kamp.dicegame;
import java.util.Random;
import java.util.Scanner;

public class DiceGame {

	private static Random rgen= new Random();
	
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.println("kullanıcı 1 ismini giriniz:");
		String kul1= input.next();
		
		System.out.println("kullanıcı 2 ismini giriniz:");
		String kul2= input.next();
		
		int num1= DiceRoller();
		int num2=DiceRoller();
		
		System.out.println(num1);
		System.out.println(num2); 
		
		if(num1==num2)
			System.out.println("Berabere kaldı.");
		else {	
		int winner=num1>num2?num1:num2;
		String str= winner==num1?kul1:kul2;
		System.out.println("Oyuncu " + str +" " + winner+ " " + "atarak kazandı."  );
		}

	}
	
	private static int DiceRoller() {
		return rgen.nextInt(5)+1;
	}
}
