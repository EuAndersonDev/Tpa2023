import java.util.Scanner;
public class AreaSala {
	public static void main(String args[]) {
		//criar o objeto Scanner
		Scanner ler = new Scanner(System.in);
		
		//introdução ao usuário
		System.out.println("Olá usuário! Vamos calcular a área de sua sala retangular.");
		
		//inicio do programa
		System.out.print("Insira a largura da sala: ");
		double largura = ler.nextDouble();
				
		System.out.print("Insira o comprimento da sala: ");
		double comprimento = ler.nextDouble();
		
		double area = largura * comprimento;
		System.out.println("A área da sala é: "+area);
		
		//fechar objeto Scanner
		ler.close();
	}
}
