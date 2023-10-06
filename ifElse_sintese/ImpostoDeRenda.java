package ifElse_sintese;
import java.util.Scanner;
public class ImpostoDeRenda {
	public static void main(String[] args) {
		//criar objeto Scanner
		Scanner ler = new Scanner(System.in);
		double imposto;
		
		//inicio do programa
		System.out.print("Escreva seu salário: ");
		double salario = ler.nextDouble();
		
		if (salario >= 4664.68) {
			imposto = salario*0.275 - 869.36;
			
		} else if (salario >= 3751.05) {
				 imposto = salario*0.225 - 636.13;
		} else if (salario >= 2826.66) {
				 imposto = salario*0.15-354.8;
		} else if (salario >= 1903.99) {
					imposto = salario*0.705-142.8;
		} else {
					imposto = 0;
		}
		System.out.printf("\nSeu imposto custará: R$%.2f", imposto);
		ler.close();
		}
	}

