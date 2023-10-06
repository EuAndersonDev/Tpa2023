import java.util.Scanner;
public class NomeAnoAtualAnoNascimento {
	public static void main(String args[]) {
		// criar o objeto scanner
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
        String nome = ler.next();
        
        System.out.print("Digite seu ano de nascimento: ");
        int anoNascimento = ler.nextInt();
        
        System.out.print("Digite o ano atual: ");
        int anoAtual = ler.nextInt();
        
        int idade = anoAtual - anoNascimento;

        System.out.println(nome + ", você tem " + idade + " anos.");
        
        //fechar objeto scanner
        ler.close();
    }
}

