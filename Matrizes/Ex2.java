import java.util.Random;

public class Ex2 {
    public static void main(String[] args) {
        int v[][] = new int[3][3];
        int i, j;
        Random in = new Random();

        //preenchendo a matriz com valores aleatorios
        for(i=0; i<3; i++){
            for(j=0; j<3;j++){
                v[i][j] = in.nextInt()%50;
            }
        }

        //busca maior
        int maior = -9999;
        for(i=0; i<3; i++){
            for(j=0; j<3;j++){
                if(v[i][j]> maior){
                    maior = v[i][j];
                }
            }
        }

        //busca menor
        int menor = 9999;
        for(i=0; i<3; i++){
            for(j=0; j<3;j++){
                if(v[i][j] < menor){
                    menor = v[i][j];
                }
            }
        }

        //imprimindo a matriz
        for (i = 0; i < 3; i++) {
            System.out.println();
            System.out.print("[ ");
            for (j = 0; j < 3; j++) {
                System.out.print(v[i][j]+" ");
            }
            System.out.print("]");
        }
        System.out.println();
        System.out.println("O maior valor da matriz é: "+maior);
        System.out.println("O menor valor da matriz é: "+menor);
    }
}
