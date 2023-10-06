import java.util.Scanner;
public class CalculoPrestacao {
	public static void main(String args[]) {
		//criar o objeto Scanner
		Scanner ler = new Scanner(System.in);
		
		//introdução ao usuário 
		System.out.println("Olá usuário! Vamos calcular sua prestação em atraso!");
		
		//inicio do programa
		System.out.print("Insira o valor da sua prestacao sem juros:");
		double valor = ler.nextDouble();
		
		System.out.print("Insira a taxa de juros aplicada ao dia: ");
		double taxa = ler.nextDouble();
		
		System.out.print("Insira quantos dias sua prestação está atrasada: ");
		int tempo = ler.nextInt();
		
		//calculo da prestação
		double prestacao = valor+(valor*(taxa/100)*tempo);
		
		//mostrar o valor da apresentação para o usuário
		System.out.println("O valor final da sua prestação é: "+prestacao);
		
		//fechar objeto scanner
		ler.close();
	}
}
