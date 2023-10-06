import java.util.Scanner;
public class MaximoDivida {
	public static void main(String args[]) {
		//criar objeto scanner
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite seu salário: ");
		double salario = ler.nextDouble();
		
		double maximoDivida = salario*0.30;
		
		System.out.println("Sua dívida tem valor máximo de: "+maximoDivida);
		
		//fechar objeto scanner
		ler.close();
	}
}
