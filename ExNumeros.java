package estruturaCondicional;
import java.util.Scanner;

public class ExNumeros {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		System.out.println("Qual é o primeiro número");
		int numero1 = ler.nextInt();
		System.out.println("Qual é o segundo termo ");
		int numero2 = ler.nextInt();
		String msg = numero1 >= numero2 ? "Maior ou igual" : "Menor";
		System.out.println(msg);
		ler.close();
	}

}
