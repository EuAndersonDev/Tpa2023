import java.util.Scanner;
public class ProximoDia {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Insira o dia: ");
		int d = in.nextInt();
		System.out.print("Insira o mês: ");
		int m = in.nextInt();
		System.out.print("Insira o ano:");
		int a = in.nextInt();
		boolean valido = true;
		
		
		
		
		//Dar erro se:
				//For Maior ou igual que 31 nos meses 02, 04, 06, 09, 11
				//For Maior ou igual que 30 nos meses 01, 03, 05, 07, 08, 10
				//Se o mes for maior que 12
				//Se o dia,mes ou ano for negativo
				//Se o for dia 30 no mes 2
		if( (d>28 && m==02 && a%4)|| (d<1 || m<1 || a<1) ||d>29 && m==02 || d>30 && (m==04 || m==06 || m==9 || m==11) || d>31 && (m==01 ||  m==03||  m==05|| m==07 || m==8 || m==10) || m>12) {
			System.out.println("Insira uma entrada válida!");
			valido = false;
		} else {
			//Verificação dos meses de 31 dias
			if(d==31 && (m==01 ||  m==03||  m==05|| m==07 || m==8 || m==10)) {
				d=01;
				m=m+1;
				a = a;
				//Vericação do mes 12
			} else if(d==31 && m==12) {
				d = 01;
				m = 01;
				a = a+1;
				//verificação de meses de 30 dias 
			} else if (d==30 && (m==04 || m==06 || m==9 || m==11)) {
				d = 01;
				m = m+1;
				//Verificação de fevereiro e ano bissexto
			} else if (d==28 && m==02 && a%4==0) {
				d=d+1;
			} else if (d==29 && m==02 ){
				d=01;
				m=03;
			} else {
				d=d+1;
			}
		}
		if (valido) {
			System.out.println("Amanhã é dia: "+d+" Mês: "+m+" e Ano: "+a);
		}
	}
}

