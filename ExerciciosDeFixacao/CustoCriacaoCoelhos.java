import java.util.Scanner;
public class CustoCriacaoCoelhos {
	public static void main(String args[]) {
		//criar objeto Scanner
		Scanner ler = new Scanner(System.in);
		
		//introdução ao usuário
		System.out.println("Olá usuário! Vamos calcular o custo de criação dos seus coelhos!");
		
		//inicio do programa
		System.out.print("Insira quantos coelhos você tem: ");
		int numCoelhos = ler.nextInt();
		
		double custo = (numCoelhos*0.70)/18+10;
		System.out.println("O custo de criação de seus coelhos ficará em: "+custo+" reais.");
		
		//fechar objeto Scanner
		ler.close();
	}
}
