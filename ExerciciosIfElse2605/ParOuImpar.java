import java.util.Scanner;
public class ParOuImpar {
	public static void main(String[] args) {
		//criar objeto scanner
		Scanner ler = new Scanner(System.in);
		
		//introdução ao usuário
		System.out.println("Olá usuário! Vamos ver se o número escolhido por você é par ou ímpar");
		
		//inicio do programa
		System.out.print("Informe um número: ");
		int numero = ler.nextInt();
		
		double resto = numero % 2;
		
		if(resto == 0) {
			System.out.println("O número escolhido é par");
		} else {
			System.out.println("O número escolhido é ímpar");
		}
		
		//fechar objeto Scanner
		ler.close();
	}
}
