import java.util.Arrays;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int TAM = 10;
        int a[], b[], i;
        a = new int[TAM];
        b = new int[TAM];

        //leitura do vetor A
        for(i=0; i<TAM; i++) {
            System.out.print("Digite o "+(i+1)+"o valor do vetor A: ");
            a[i] = in.nextInt();
        }

        //copia do vetor A no vetor B
        for(i=0; i<TAM; i++) {
            b[i] = a[i];
        }

        //Utilizar isso é roubar prof? kkkkkkkkk
        Arrays.sort(b);

        //Apresentando o vetor C
        System.out.print("B = [ ");
        for(i=0; i<TAM; i++) {
            System.out.print(b[i]+" ");
        }
        System.out.print("]");
    }
}
