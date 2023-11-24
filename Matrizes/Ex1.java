import java.util.Random;
public class Ex1 {
    public static void main(String[] args) {
        int linhas = 4, colunas = 4;
        int v[][] = new int[linhas][colunas];

        // Preenchendo a matriz com o dobro do elemento anterior
        int valor = 2;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                v[i][j] = valor;
                valor *= 2;
            }
        }

        // Imprimindo a matriz
        for (int i = 0; i < 4; i++) {
            System.out.println();
            System.out.print("[ ");
            for (int j = 0; j < 4; j++) {
                System.out.print(v[i][j]+" ");
            }
            System.out.print(" ]");
        }
    }
}