import java.util.*;

public class Ex8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int TAM = 10;
        int a[], b[], i, valor;
        boolean verificador;
        a = new int[TAM];
        b = new int[TAM];

        // Leitura do vetor A
        for (i = 0; i < TAM; i++) {
            System.out.print("Digite o " + (i + 1) + "o valor do vetor A: ");
            a[i] = in.nextInt();
        }

        System.out.print("Digite o valor que quer fazer a verificação de existência dentro do vetor: ");
        valor = in.nextInt();

        verificador = false;
        for(i = 0; i < TAM; i++) {
            if(a[i] == valor){
                verificador = true;
                break;
            }
        }

        if(verificador == false) {
            System.out.println("O valor "+valor+" não existe no vetor A");
        } else{
            System.out.println("O valor "+valor+" existe no vetor A");
        }

    }
}
