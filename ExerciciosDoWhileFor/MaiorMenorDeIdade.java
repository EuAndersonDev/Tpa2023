import java.util.Scanner;
public class MaiorMenorDeIdade {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int idade;
		String resposta;
		do{
			System.out.print("Digite a idade: ");
			idade = in.nextInt();
			if (idade>=18) {
				System.out.println("Maior de idade");
			} else {
				System.out.println("Menor de idade");
			}
			System.out.print("Deseja continuar? ");
			resposta = in.next();
		}while(resposta.equalsIgnoreCase("sim"));


	}

}
