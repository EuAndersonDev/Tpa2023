import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int proximo, n;
        int anterior = 0; // os dois primeiros numeros da sequencia de fibonacci e 1
		int atual = 1; // os dois primeiros numeros da sequencia de fibonacci e 1
		int i = 1; // o contador ja inicia em dois por conta dos dois primeiros numeros da sequencia
		
		System.out.print("Insira até que número você quer que o programa calcule a série de Fibonacci: ");
		n = in.nextInt();
		
		
		while (i <= n) {
			if (i==n) {
				System.out.print(atual);
			}else {
				System.out.print(atual+", ");
			}
				proximo = anterior+atual;
				anterior = atual;
				atual = proximo; 
			i++;
		}
	}
}
