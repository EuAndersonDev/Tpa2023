import java.util.Scanner;
public class SalarioProfessor {
	public static void main(String args[]) {
		//criar o objeto Scanner
		Scanner ler = new Scanner(System.in);
		
		//introdução ao usuário
		System.out.println("Olá professor! Vamos calcular seu salário?");
		
		//inicio do programa
		System.out.print("Digite o valor da sua hora-aula: ");
		double horaAula = ler.nextDouble();
		
		System.out.print("Digite quantas aulas você dá por mês: ");
		int aulaMes = ler.nextInt();
				
		System.out.print("Em quantos porcento está o desconto do INSS?: ");
		double descontoINSS = ler.nextDouble();
		
		double salarioBruto = aulaMes * horaAula;
		double salarioLiquido = salarioBruto - (salarioBruto/100*descontoINSS);
		
		System.out.print("Seu salário é de: "+salarioLiquido+"reais");
		
		//fechar o objeto scanner
		ler.close();
	}
}
