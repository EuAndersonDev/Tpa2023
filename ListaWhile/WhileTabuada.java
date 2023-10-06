import java.util.Scanner;
public class WhileTabuada {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);		
		int n = 0, i = 1;
		
		System.out.print("Insira o número que você deseja saber a tabuada: ");
		n = in.nextInt();
		
		while (i <=10) {
			System.out.println(n+" x "+i+" = "+ n * i);
			i++;
		}
	}
}
