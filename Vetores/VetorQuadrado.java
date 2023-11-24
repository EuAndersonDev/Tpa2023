import java.util.*;
public class VetorQuadrado {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 10;
		int a[], b[], i;
		a = new int[TAM];
		b = new int[TAM];
		
		//leitura do laço A e calculo do quadrado
		for(i=0; i<TAM; i++) {
			System.out.print("Digite o "+(i+1)+"o valor do vetor A: ");
			a[i] = in.nextInt();
			b[i] = a[i] * a[i];
		}
		
		//Apresentando o laço B
		System.out.print("B = [ ");
		for(i=0; i<TAM; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.print("]");
	}
}
