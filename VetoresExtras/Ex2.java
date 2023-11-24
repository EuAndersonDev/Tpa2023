import java.util.*;
public class Ex2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 5;
		int a[], b[], i, j;
		a = new int[TAM];

		//leitura do vetor A
		for(i=0; i<TAM; i++) {
			System.out.print("Digite o "+(i+1)+"o valor do vetor A: ");
			a[i] = in.nextInt();
		}
		
		for(i=0; i<TAM; i++) {
			for(j=0; j<11; j++) {
				System.out.println(a[i] +" x "+j+" = "+ a[i] * j);
			}
			System.out.println("");
		}
	}
}
