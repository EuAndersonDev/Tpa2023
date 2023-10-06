import java.util.Scanner;
public class SwitchCaseEscolaDeFutebol {
	public static void main(String[] args) {
		while(perguntar().equalsIgnoreCase("sim")) {
		}
		System.out.println("Ok");
	}
		
	public static String perguntar() {
		Scanner in = new Scanner(System.in);
		
		int idade;
		System.out.print("Escreva a idade do aluno: ");
		idade = in.nextInt();
		
		while(idade<6 || idade>10) {
			System.out.println("Idade inválida, só são aceitas idades de 6 a 10, escreva uma nova idade.");
			System.out.println("Escreva a idade do aluno: ");
			idade = in.nextInt();
		}
		
		switch (idade) {
			case 6:
				System.out.println("A categoria do aluno é: Dente de leite.");
				break;
			case 7:
				System.out.println("A categoria do aluno é: Júnior.");
				break;
			case 8:
				System.out.println("A categoria do aluno é: Júnior Max.");
				break;
			case 9:
				System.out.println("A categoria do aluno é: Júnior Master.");
				break;
			case 10:
				System.out.println("A categoria do aluno é: Master");
				break;
		}
		
		System.out.println("Quer refazer?");
		String resposta = in.next();
		return resposta;
	}		
}
