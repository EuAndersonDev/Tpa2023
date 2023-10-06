import java.util.Scanner;
public class SwitchCaseMes {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int m;
		System.out.println("Escreva o numero de um mes: ");
		m = in.nextInt();
		
		switch(m){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("Esse mes tem 31 dias");
				break;
			case 4:	
			case 6:
			case 9:
			case 11:
				System.out.println("Esse mes tem 30 dias");
				break;
			case 2:
				System.out.println("Esse mes tem 28 dias");
				break;
			default:
				System.out.println("Numero invalido");
		
		}
	}

}
