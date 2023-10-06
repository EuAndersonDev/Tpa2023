
public class JoaoEPedro {
	public static void main(String[] args) {
		double joao = 134; //tamanho em centímetros
		double pedro = 145; //tamanho em centímetros
		int i = 0; //contador de anos
		
		while (joao <= pedro) {
			joao += 2.5;
			pedro += 2;
			i++;
		}
		System.out.println("Demorará "+i+" anos para João ficar mais alto que pedro");
	}
}