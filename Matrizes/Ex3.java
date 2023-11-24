import java.util.Random;
public class Ex3 {
	public static void main(String[] args) {
        int v[][] = new int[3][4];
        int i, j, soma = 0;
        Random in = new Random();

        //preenchendo a matriz com valores aleatorios
        for(i=0; i<3; i++){
            for(j=0; j<4;j++){
                v[i][j] = in.nextInt()%50;
            }
        }
        
        //fazer a soma
        for(i=0; i<3; i++) {
        	for(j=0; j<3; j++) {
        		soma += v[i][j];
        	}
        	v[i][3] = soma;
        	soma = 0;
        }
        
        //imprimindo a matriz
        for (i = 0; i < 3; i++) {
            System.out.println();
            System.out.print("[ ");
            for (j = 0; j < 4; j++) {
                System.out.print(v[i][j]+" ");
            }
            System.out.print("]");
        }
        System.out.println();
	}
}
