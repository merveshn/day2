package tr.org.linux.kamp.cardgame;
import java.util.Random;


public class CardGame {
	
	private static Random rgen= new Random();
	
	public static void main(String[] args) {
		System.out.println( chooseRandomRank() + " of " + chooseRandomSuit() );
	}
	
	private static String chooseRandomRank() {
		int number= rgen.nextInt(12)+1;
		//String str= new String();
		switch(number) {
			case 1:
				return "As";
			case 11:
				return "Vale";
			case 12:
				return "Kız";
			case 13:
				return "Papaz";
			default:
				//str=""+number;
				return ""+number;
		
		}
		
	}

	
	private static String chooseRandomSuit() {
		int card= rgen.nextInt(4);
		if(card==0) return "Karo";
		else if(card==1) return "Maça";
		else if(card==2) return "Sinek";
		else return "Kupa";
		
		
	}
	
}
