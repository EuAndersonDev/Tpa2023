import java.util.Scanner;
public class NumeroFatorial {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n, i;
		System.out.print("Digite o número que você quer descobrir o fatorial: ");
		n = in.nextInt();
		i = n - 1; //Atribuir o valor de n - 1 ao contador
		 
		while (i>0) {
			n = n * i; //n vai receber o valor dele * o numero de i (que é n - 1)
			i--; //Subtrair um no contador
		}
		System.out.println("O fatorial desse número é: "+n);
	}
}
