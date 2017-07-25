package tr.org.linux.kamp.random;
import java.util.Random;

public class HelloRandom {
	public static void main(String[] args) {
		
		//random generator kullanırken tek sayı kullanmak daha mantıklı çünkü çok yakın sayılar elde edilebilir

		System.out.println("Math random " +Math.random());
		Random rgen= new Random(5);						  //seed verirsek hep aynı sayıları üretir
		System.out.println("next int " + rgen.nextInt()); //0 ile 1 arasında bir sayı üretiyor
		System.out.println("next double " + rgen.nextDouble());
		System.out.println("next boolean " + rgen.nextBoolean());
		
		Random rgen2= new Random(5);					  //seedler aynıysa fonksiyonlar aynı sayıyı üretir, seedler
		System.out.println("next int " + rgen2.nextInt());//yakınsa, üretilen sayılar da birbirine çok yakın olur
		
		Random rgen3= new Random();
		System.out.println("next int " + rgen3.nextInt(3));//nextInt(seed), o seede kadar bir random üretir


	}

}
