import java.util.Scanner;
public class SwitchCaseSigno {
	public static void main(String[] args) {
		while(perguntar().equalsIgnoreCase("sim")) {
		}
		System.out.println("Ok");
	}
	
	public static String perguntar() {
		Scanner in = new Scanner(System.in);
		
		int d;
		int m;
		System.out.print("Escreva o seu dia de nascimento: ");
		d = in.nextInt();
		System.out.print("Escreva o seu mês de nascimento: ");
		m = in.nextInt();
		
		while ((d<1 || m<1) ||d>29 && m==02 || d>30 && (m==04 || m==06 || m==9 || m==11) || d>31 && (m==01 ||  m==03||  m==05|| m==07 || m==8 || m==10) || m>12) {
			System.out.println("Dia ou mês inválido, digite os valores novamente.");
			System.out.print("Escreva o seu dia de nascimento: ");
			d = in.nextInt();
			System.out.print("Escreva o seu mês de nascimento: ");
			m = in.nextInt();
		}
		
		switch (m) {
			case 1:
				if (d<=20) {
					System.out.println("Seu signo é: Capricórnio!");
				} else {
					System.out.println("Seu signo é: Aquário!");
				}	
				break;
			case 2:
				if (d<=18) {
					System.out.println("Seu signo é: Aquário!");
				} else {
					System.out.println("Seu signo é: Peixes!");
				}
				break;
			case 3:
				if (d<=20) {
					System.out.println("Seu signo é: Peixes!");
				} else {
					System.out.println("Seu signo é: Áries!");
				}
				break;
			case 4:
				if (d<=20) {
					System.out.println("Seu signo é: Áries!");
				} else {
					System.out.println("Seu signo é: Touro!");
				}
				break;
			case 5:
				if (d<=20) {
					System.out.println("Seu signo é: Touro!");
				} else {
					System.out.println("Seu signo é: Gêmeos!");
				}
				break;
			case 6:
				if (d<=20) {
					System.out.println("Seu signo é: Gêmeos!");
				} else {
					System.out.println("Seu signo é: Câncer!");
				}
				break;
			case 7:
				if (d<=22) {
					System.out.println("Seu signo é: Câncer!");
				} else {
					System.out.println("Seu signo é: Leão!");
				}
				break;
			case 8:
				if (d<=22) {
					System.out.println("Seu signo é: Leão!");
				} else {
					System.out.println("Seu signo é: Virgem!");
				}
				break;
			case 9:
				if (d<=22) {
					System.out.println("Seu signo é: Virgem!");
				} else {
					System.out.println("Seu signo é: Libra!");
				}
				break;
			case 10:
				if (d<=22) {
					System.out.println("Seu signo é: Libra!");
				} else {
					System.out.println("Seu signo é: Escorpião!");
				}
				break;
			case 11:
				if (d<=21) {
					System.out.println("Seu signo é: Escorpião!");
				} else {
					System.out.println("Seu signo é: Sagitário!");
				}
				break;
			case 12:
				if (d<=21) {
					System.out.println("Seu signo é: Sagitário!");
				} else {
					System.out.println("Seu signo é: Capricórnio!");
				}
				break;
		}
		
		System.out.println("Quer refazer?");
		String resposta = in.next();
		return resposta;
	}	
}
