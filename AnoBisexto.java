package estruturaCondicional;
import java.util.Scanner;

public class AnoBisexto {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Qual é o ano que deseja ser verificado");
		int ano = ler.nextInt();

		if (ano % 4 == 0 && ano % 100 != 0 ) {
			System.out.println(ano+" é bisexto");				
		}else if (ano % 400 == 0){
			System.out.println(ano+" é bisexto");			
		}else {
			System.out.println(ano+" não é bisexto");
		}
		ler.close();
	}
}