import java.util.*;
public class VetorInvertido {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 5;
		int a[], b[], i, j = 0;
		a = new int[TAM];
		b = new int[TAM];
		
		//laço para leitura do vetor A
		for(i=0; i<TAM; i++) { 
			System.out.print("Digite o "+(i+1)+" valor do vetor A: "); 
			a[i]= in.nextInt();
		}
		
		//armazenar valores de A no vetor B de forma invertida
		for(i=(TAM-1); i>=0; i--) {
			if(j<TAM) {
				b[j] = a[i];
				j++;
			}
		}
		
		//apresentando o vetor B
		System.out.print("B = [ "); 
		for (i=0; i<TAM; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.print("]");
	}
}
