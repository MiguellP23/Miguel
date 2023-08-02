import java.util.Random;

public class Main {

	public static void main(String[] args) {
		long []arregloEnterosLargos = new long[20];
		
		Random r = new Random ();
		
		for (int i = 0; i < arregloEnterosLargos.length; i++) {
			arregloEnterosLargos [i] = r.nextInt(100);
		}
		
		for (int i = 0; i < arregloEnterosLargos.length; i++) {
		  System.out.print(arregloEnterosLargos [i]+ " - ");
		}
		System.out.println("Uwu");
		
//		Arrays.
	}
}
