import java.util.Scanner;
public class CampoDeFutebol {
	public static void main(String[] args) {
		//criar objeto Scanner
		Scanner ler = new Scanner(System.in);
		
		//introdução ao usuário
		System.out.println("Olá usuário! Vamos verificar se o campo de futebol está nos padrões da FIFA");
		
		//inicio do programa
		System.out.print("Insira a largura do campo: ");
		double lc = ler.nextDouble();
		
		System.out.print("Insira o comprimento: ");
		double cc = ler.nextDouble();
		
		double area = lc * cc;
		
		if(area >= 110) {
			System.out.println("O campo está no padrão da FIFA");
		} else {
			System.out.println("O campo não está no padrão da FIFA");
			
		}
		
		//fechar objeto Scanner
		ler.close();
	}
}
