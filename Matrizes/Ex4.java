import java.util.Arrays;
import java.util.Random;
import java.util.*;
import java.util.HashSet;
import java.util.Set;
public class Ex4 {
	public static void main(String[] args) {
        int v[][] = new int[4][4];
        int i, j, valor, bingo = 0, rodadas = 0;
        boolean verificador = false ;
        Random in = new Random();
        Scanner sc = new Scanner(System.in);
        
        //preenchendo a matriz com valores aleatorios
        for(i=0; i<4; i++){
            for(j=0; j<4;j++){
                v[i][j] = (int)(Math.random()*76);
            }
        }
        
        //imprimindo a matriz
        for (i = 0; i < 4; i++) {
            System.out.println();
            System.out.print("[ ");
            for (j = 0; j < 4; j++) {
                System.out.print(v[i][j]+"\t");
            }
            System.out.print("]");
        }
        System.out.println();
        
        //Pesquisador
        while (bingo < 16) {
		    System.out.print("Digite o valor que quer fazer a verificação de existência dentro bingo: ");
		    valor = sc.nextInt();
		
		    verificador = false;
		    for(i = 0; i < 4; i++) {
		    	for(j = 0; j<4; j++) {
		            if(v[i][j] == valor){
		                verificador = true;
		                break;
		            }
		    	}
		    }
		    
		    if(verificador == false) {
		        System.out.println("O valor "+valor+" não existe no bingo");
		    } else{
		        System.out.println("O valor "+valor+" existe no vetor existe no bingo!");
		        bingo += 1;
		    }
		    rodadas += 1;
        }
        
        System.out.println("BINGO!");
        System.out.println("Você demorou "+rodadas+" rodadas para dar bingo!");
	}
}
