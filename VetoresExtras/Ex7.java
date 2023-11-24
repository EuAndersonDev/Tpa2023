import java.util.*;

public class Ex7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int TAM = 10;
        int a[], b[], i = 0, j = 0, k = 0;
        a = new int[TAM];
        b = new int[TAM];

        // Leitura do vetor A
        for (i = 0; i < TAM; i++) {
            System.out.print("Digite o " + (i + 1) + "o valor do vetor A: ");
            a[i] = in.nextInt();
        }

        // Leitura do vetor B
        for (i = 0; i < TAM; i++) {
            System.out.print("Digite o " + (i + 1) + "o valor do vetor B: ");
            b[i] = in.nextInt();
        }

        // Verificar elementos que estão em A, mas não em B
        int naoContidos = 0;
        for (i = 0; i < TAM; i++) {
            boolean contido = false;

            for (j = 0; j < TAM; j++) {
                if (a[i] == b[j]) {
                    contido = true;
                    break;
                }
            }

            if (contido == false) {
                naoContidos++;
            }
        }

        // Criar vetor C com elementos de A que não estão em B
        int c[] = new int[naoContidos];

        for (i = 0; i < TAM; i++) {
            boolean contido = false;

            for (j = 0; j < TAM; j++) {
                if (a[i] == b[j]) {
                    contido = true;
                    break;
                }
            }

            if (contido == false) {
                c[k] = a[i];
                k++;
            }
        }

        // Apresentando o vetor C
        System.out.print("C = [ ");
        for (i = 0; i < naoContidos; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.print("]");
    }
}
