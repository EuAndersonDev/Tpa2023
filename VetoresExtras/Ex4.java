public class Ex4 {
	public static void main(String[] args) {
		final int TAM = 11;
		int a[], b[], i, j = 0, conta = 2, k;
		a = new int[TAM];
		
		//Criação do vetor A com os respectivos numeros de indice
		for(i=0; i<TAM; i++) {
			a[i] = j;
			j += 1;
		}
		
		System.out.print("A = [ ");
		//percorrer todos os indices do vetor
		for(i=0; i<TAM; i++) {
			
			if(a[i] == 0) {
				System.out.print("1, ");
			} else if(a[i] == 1) {
				System.out.print("2, ");
			} else {
				for(k=1; k<a[i]; k++) {
					conta = conta * 2;
				}
				System.out.print(conta+", ");
				conta = 2;
			}
		}	
		System.out.print(" ]");
		
	}
}
