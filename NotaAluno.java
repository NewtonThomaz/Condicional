package estruturaCondicional;
import java.util.Scanner;

public class NotaAluno {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe a primeira nota:");
		double nota01 = ler.nextDouble();
		
		System.out.println("Informe a segunad nota:");
		double nota02 = ler.nextDouble();
		
		System.out.println("Informe a terceira nota:");
		double nota03 = ler.nextDouble();
		
		System.out.println("Informe a quarta nota:");
		double nota04 = ler.nextDouble();
		
		double media =(nota01+nota02+nota03+nota04)/4;
		
		String mensagem = media  >= 6? "Aprovado "+media : "Reprovado "+media;
		System.out.println(mensagem);
		
		ler.close();
	}
}