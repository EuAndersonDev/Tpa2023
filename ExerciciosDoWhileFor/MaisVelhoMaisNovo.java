import java.util.Scanner;
import java.time.LocalDate;
public class MaisVelhoMaisNovo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int anoAtual, maisVelho = -99999, maisNovo = 99999, idadeUsuario, i;
		
		anoAtual = LocalDate.now().getYear() ;
		
		for(i=1;i<=10;i++) {
			System.out.print("Digite que ano o "+i+"o usuario nasceu: ");
			idadeUsuario = in.nextInt();
			idadeUsuario = anoAtual - idadeUsuario;
			
			System.out.println("Idade do "+i+"o usuário é: "+idadeUsuario);
			
			if(idadeUsuario>maisVelho) {
				maisVelho = idadeUsuario;
				
			}
			if(idadeUsuario<maisNovo) {
				maisNovo = idadeUsuario;
			} 
			
		}
		
		System.out.println("O usuário mais velho tem: "+maisVelho+" anos.");
		System.out.println("O usuário mais novo tem: "+maisNovo+" anos.");
		in.close();
	} 
}
