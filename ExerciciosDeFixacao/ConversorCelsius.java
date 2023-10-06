import java.util.Scanner;
public class ConversorCelsius {
	public static void main(String args[]) {
		//criar objeto Scanner
		Scanner ler = new Scanner(System.in);
		
		//introdução ao usuário
		System.out.println("Olá usuário! Vamos converter a sua temperatura de graus Farenheit para Celsius!");
		
		//inicio do programa
		System.out.print("Insira sua temperatura em graus Fahrenheit: ");
		double f = ler.nextDouble(); 
		
		double celsius = (f-32) * 5/9;
		System.out.println("A temperatura convertida é: "+celsius);
		
		//fechar objeto Scanner
		ler.close();
	}
}
