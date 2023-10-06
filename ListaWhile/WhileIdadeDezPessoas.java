import java.util.Scanner;
public class WhileIdadeDezPessoas {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i = 1, idade = 0, maiores = 0, menores = 0;
		
		while (i<=10) {
			System.out.print("Digite a idade da "+i+"a pessoa: ");
			idade = in.nextInt();
			if (idade>=18) {
				maiores++;
			} else {
				menores++;
			}
			i++;
		}
		
		System.out.println("De 10 pessoas "+maiores+" são maiores de idade e "+menores+" são menores de idade.");
	}
}
