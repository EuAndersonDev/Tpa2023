package ifElse_sintese;
import java.util.Scanner;
public class IngressoTeatro {
	public static void main(String[] args) {
		//criar objeto Scanner
		Scanner ler = new Scanner(System.in);
		
		//inicio do programa
		System.out.print("Escreva o preço do ingresso: ");
		double ingresso = ler.nextDouble();
		
		System.out.print("Você é estudante? ");
		String resposta= ler.next();
		
		if (resposta.equalsIgnoreCase("Sim")) {
			double ingEstudante = ingresso / 2;
			System.out.println("Como você é estudante o seu ingresso custa: "+ingEstudante+" reais");
		}
		else {
			System.out.println("Como você não é estudante seu ingresso custa: "+ingresso+" reais");
		}
		//fechar objeto Scanner
		ler.close();
	}

}
