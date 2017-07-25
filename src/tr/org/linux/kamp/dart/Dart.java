package tr.org.linux.kamp.dart;

import java.util.Random;

public class Dart {
	private static Random rgen = new Random();

	public static void main(String[] args) {

		int inside = 0;
		int outside = 0;
		int counter = 0;

		while (counter < Long.MAX_VALUE) {

			double x = 2 * (rgen.nextDouble()) - 1;
			double y = 2 * (rgen.nextDouble()) - 1;

			if ((x * x + y * y) <= 1.0)
				inside++;
			else
				outside++;

			counter++;
		}

		float oran = ((float) inside / (float) counter);

		System.out.println(inside + " " + outside + " " + (oran));
		System.out.println(oran * 4);
	}
}
/*Hocanın kodu:
 * 
 * 
package montecarlo;

import java.util.Random;

/**
 *
 * @author oyas

public class MonteCarlo {
    private static Random rgen = new Random();
    /**
     * @param args the command line arguments
     
    public static void main(String[] args) {
        // TODO code application logic here
        int dartCount = 10000;
        int insideCount = 0;
        for(int i =0; i < dartCount;i++){
            if(isInCircle(getPoint(), getPoint())){
                insideCount++;
            }                
        }
        double pi = 4 * (insideCount*1.0/dartCount);
        System.out.println(pi);
    }
    
    public static double getPoint(){
        return (2 * rgen.nextDouble()) - 1 ;
    }
    
    public static boolean isInCircle(double x, double y){
        return Math.pow(x, 2) + Math.pow(y, 2) < 1;        
    }
    
}

 * 
 * 
 * 
 */ 


