package estruturaCondicional;
import java.util.Scanner;

public class Multiplo {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("informe um valor: ");
		double a = ler.nextDouble();

		String mensagem = a % 5 == 0? "O número  "+ a + " é multiplo de 5" : "O número  "+ a + " não é multiplo de 5";
		System.out.println(mensagem);

		ler.close();
	}
}