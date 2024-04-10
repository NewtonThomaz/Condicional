package estruturaCondicional;
import java.util.Scanner;

public class CalculoDaSemana {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Informe o dia da semana:");
		int dia = ler.nextInt();

		switch (dia) {
		case 1:
			System.out.println("O número corresponde a segunda-feira");
			break;
		case 2:
			System.out.println("O número corresponde a terça-feira");
			break;
		case 3:
			System.out.println("O número corresponde a quarta-feira");
			break;
		case 4:
			System.out.println("O número corresponde a queinta-feira");
			break;
		case 5:
			System.out.println("O número corresponde a sexta-feira");
			break;
		case 6:
			System.out.println("O número corresponde a sabado");
			break;
		case 7:
			System.out.println("O número corresponde a domingo");
			break;
		default:
			System.out.println("Seu número não é valido");
		}
		ler.close();
	}
}