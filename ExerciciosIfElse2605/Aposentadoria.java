import java.util.Scanner;
public class Aposentadoria {
	public static void main(String[] args) {
		//criar objeto scanner
		Scanner ler = new Scanner(System.in);
		
		//introdução ao usuário
		System.out.println("Olá usuário! Vamos calcular seu novo salário!");
		
		//inicio do programa
		System.out.print("Insira o seu salário atual: ");
		double salarioAtual = ler.nextDouble();
		
		if(salarioAtual <= 1212) {
			double salarioFinal = salarioAtual + (salarioAtual*0.05);
			System.out.println("O seu salário é de: "+salarioFinal+" reais");
		} else {
			double salarioFinal2 = salarioAtual + (salarioAtual*0.035);
			System.out.println("O seu salário é de: "+salarioFinal2+" reais");
		}
		
		//fechar objeto Scanner
		ler.close();
	}
}
