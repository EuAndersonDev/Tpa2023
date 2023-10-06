import java.util.Scanner;
public class NotasDeUsuario {
	public static void main(String args[]) {
		//criar objeto Scanner
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite a sua 1º nota: ");
		double n1 = ler.nextDouble();
		
		System.out.print("Digite a sua 2º nota: ");
		double n2 = ler.nextDouble();
		
		System.out.print("Digite a sua 3º nota: ");
		double n3 = ler.nextDouble();
		
		System.out.print("Digite a sua 4º nota: ");
		double n4 = ler.nextDouble();
		
		double media = (n1 + n2 + n3 + n4) / 4;
		
		System.out.println("A média de suas notas é: "+media);
		
		//fechar objeto scanner
		ler.close();
	}
}
