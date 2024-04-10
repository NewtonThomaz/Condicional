package estruturaCondicional;
import java.util.Scanner;

public class Ternario {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Qual sua idade?");
		int idade = ler.nextInt();
		String mensagem = idade >= 18? "Maior de idade" : "Menor de idade";
		System.out.println(mensagem); //imprime "Maior de idade"
		ler.close();
	}

}
