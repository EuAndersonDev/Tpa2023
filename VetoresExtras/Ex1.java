import java.util.*;
public class Ex1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 20;
		int a[], b[], i, j = 0;
		a = new int[TAM];
		b = new int[TAM];
		
		//leitura do vetor A
		for(i=0; i<TAM; i++) {
			System.out.print("Digite o "+(i+1)+"o valor do vetor A: ");
			a[i] = in.nextInt();
		}
		
		//separação de pares
		for(i=0; i<TAM; i++) {
			if (a[i] % 2 == 0) {
				b[j] = a[i];
				j++;
			}
		}
		
		//colocar impares
		for(i=0; i<TAM; i++) {
			if (a[i] % 2 != 0) {
				b[j] = a[i];
				j++;
			}
		}
		
		System.out.print("B = [ ");
		for(i=0; i<TAM; i++) {
			if(i == (TAM-1)) {
				System.out.print(b[i]);
			}else {
				System.out.print(b[i]+", ");
			}
		}
		System.out.print(" ]");
	}
}
