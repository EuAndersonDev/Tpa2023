package ifElse_sintese;
import java.util.Scanner;
public class CustoViagem {
	public static void main(String[] args) {
		//criar objeto Scanner
		Scanner ler = new Scanner(System.in);
		
		double despacho = 0;
		double assento = 0;
		
		//inicio do programa
		System.out.print("Vamos calcular seu custo de viagem! ");
		System.out.print("Insira o valor da passagem: ");
		double passagem  = ler.nextDouble();
		
		//Vai despachar bagagem?
		System.out.print("Você vai despachar bagagem? Se sim escreva escreva 'sim' se não escreva 'não': ");
		String respBagagem = ler.next();
		
		if (respBagagem.equalsIgnoreCase("sim")) {
			System.out.print("Insira a quantidade de volumes: ");
			int qtdVolumes = ler.nextInt();
			despacho = qtdVolumes * 90;
		}
		
		//Vai reservar assento?
		System.out.print("Vai reservar marcar o assento? Se sim escreva 'sim' se não escreva'não'");
		String respAssento = ler.next();
				
		if (respAssento.equalsIgnoreCase("sim")) {
			assento = 1 * 60;
		}
		
		//calcular valor final
		double valorFinal = passagem + despacho + assento;
		
		System.out.println("O valor de sua viagem ficou de "+valorFinal+" reais");
	}
}
