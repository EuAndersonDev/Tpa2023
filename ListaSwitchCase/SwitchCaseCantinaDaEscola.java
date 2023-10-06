import java.util.Scanner;
public class SwitchCaseCantinaDaEscola {
	public static void main(String[] args) {
		while(perguntar().equalsIgnoreCase("sim")) {
		}
		System.out.println("Ok");
	}
	
	public static String perguntar() {
		Scanner in = new Scanner(System.in);
		
		int codigo;
		System.out.print("Digite o código do produto para consulta: ");
		codigo = in.nextInt();
		
		while(codigo>5 || codigo<1) {
			System.out.println("Código inválido, só são aceitas os códigos de 1 a 5, escreva um novo código.");
			System.out.println("Digite o código do produto para consulta: ");
			codigo = in.nextInt();
		}
		
		switch (codigo) {
			case 1:
				System.out.println("Cachorro Quente, valor de R$8,00");
				break;
			case 2:
				System.out.println("Cheeseburger, valor de R$12,00");
				break;
			case 3:
				System.out.println("X-Salada, valor de R$15,00");
				break;
			case 4:
				System.out.println("Misto quente, valor de R$11,00");
				break;
			case 5:
				System.out.println("Pão na chapa, valor de R$6,00");
				break;
		}
		System.out.print("Quer refazer a consulta?");
		String resposta = in.next();
		return resposta;
	}
}
