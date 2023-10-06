import java.util.Scanner;
public class Potencia {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int base, expoente;
		double potencia;
		
		System.out.print("Insira a base de sua potência: ");
		base = in.nextInt();
		System.out.print("Insira o expoente de sua potência: ");
		expoente = in.nextInt();
		
		if (expoente == 0) { //expoente for igual a 0
            potencia = 1;
        } else if (expoente > 0) { //expoente for positivo
            potencia = base;
            while (expoente > 1) {
                potencia = potencia * base;
                expoente--;
            }
        } else { // expoente negativo
            potencia = 1.0 / base;
            while (expoente < -1) {
                potencia = potencia * (1.0 / base);
                expoente++;
            }
        }

		System.out.println("A potência é: "+potencia);
	}
}
