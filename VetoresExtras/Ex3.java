import java.util.*;
public class Ex3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 10;
		int a[], b[], i, j, qtde = 0;
		a = new int[TAM];
		
		//leitura do vetor A
		for(i=0; i<TAM; i++) {
			System.out.print("Digite o "+(i+1)+"o valor do vetor A: ");
			a[i] = in.nextInt();
		}
		
		//primo
		System.out.println("A = [ ");
		for(i=0; i<TAM; i++) {
			
			for(j=1;j<=a[i];j++) {
				if(a[i] % j == 0) {
					qtde++;
				}
			}
			
			if(qtde<3) {
				System.out.println(a[i]+" primo");
				qtde = 0;
			} else {
				System.out.println(a[i]);
				qtde = 0;
			}
		}	
		System.out.println("]");
	}
}
