import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int TAM = 5;
        int a[], b[], i, j;
        boolean verificador;
        a = new int[TAM];

        // Leitura do vetor A
        for(i = 0; i < TAM; i++) {
            System.out.print("Digite o " + (i + 1) + "o valor do vetor A: ");
            a[i] = in.nextInt();
        }

        verificador = true;
        j = TAM - 1;

        for(i=0; i<=TAM - 1; i++) {
            if(a[i] != a[j]) {
                verificador = false;
            }
            j--;
        }

        if(verificador == true) {
            System.out.println("Os valores inseridos fizeram com que o vetor fosse um palíndromo!!!");
        } else {
            System.out.println("Os valores inseridos não fizeram com que o vetor fosse um palíndromo!!!");
        }
    }
}
