package estruturaCondicional;
import java.util.Scanner;

public class CalculoDoSalario {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Quantos anos você trabalhou?");
		double s = ler.nextDouble();
		
		String msg = s > 3? "Seu bonûs corresponde a 7%": "Seu bônus corresponde a 5%";
		System.out.println(msg);

		ler.close();
	}
}