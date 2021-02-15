import java.util.Random;
import java.util.Scanner;

public class ManaProgramma {

	public static void main(String[] args) {
		String vards;
		int a, b;
		
		Scanner dati = new Scanner(System.in);
		Random rand = new Random();
		
		a = rand.nextInt(10);
		b = rand.nextInt(10);
		
		System.out.print("Ieavdi savu vārdu: ");
		vards = dati.next();
		
		System.out.println("\n"+vards+"\nIzlozētais skaitlis = "+(a+b));
	}
}
