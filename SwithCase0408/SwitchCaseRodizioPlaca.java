import java.util.Scanner;
public class SwitchCaseRodizioPlaca {
	public static void main(String[] args) {
		while(perguntar().equalsIgnoreCase("sim")) {
			
		}
		System.out.println("Ok");
		
	}
	
	public static String perguntar() {
		Scanner in = new Scanner(System.in);
		
		int d;
		System.out.print("Escreva o ultimo numero da placa do seu carro: ");
		d = in.nextInt();
		
		while(d<0 || d>9) {
			System.out.println("Numero inválido, insira um novo numero");
			System.out.println("Escreva o ultimo numero da placa do seu carro: ");
			d = in.nextInt();
		}
		
		switch(d) {
			case 1:
			case 2:
				System.out.println("Seu carro não pode rodar na segunda-feira");
				break;
			case 3:	
			case 4:
				System.out.println("Seu carro não pode rodar na terça-feira");
				break;
			case 5:
			case 6:
				System.out.println("Seu carro não pode rodar na quarta-feira");
				break;
			case 7:
			case 8:
				System.out.println("Seu carro não pode rodar na quinta-feira");
				break;
			case 9:
			case 0:
				System.out.println("Seu carro nã pode rodar na sesxta-feira");
				break;
		}
		
		System.out.println("Quer refazer?");
		String resposta = in.next();
		return resposta;
	}
}
