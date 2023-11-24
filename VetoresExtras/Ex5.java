import java.util.*;
public class Ex5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 5;
		int a[], b[], i, j, k;
		a = new int[TAM];
		b = new int[TAM];
		
		//leitura do vetor A
		for(i=0; i<TAM; i++) {
			System.out.print("Digite o "+(i+1)+"o valor do vetor A: ");
			a[i] = in.nextInt();
		}
		
		for(i=0; i<TAM; i++) {
		
			k = a[i];
			for(j = a[i] - 1; j > 0; j--) {
				k = k * j;
			}
			b[i] = k;
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
