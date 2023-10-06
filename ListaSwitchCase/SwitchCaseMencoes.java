import java.util.Scanner;
public class SwitchCaseMencoes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int alunos;
        int i = 0, r = 0, b = 0, mb = 0;  
        
        System.out.print("Insira a quantidade de alunos: ");
        alunos = in.nextInt();
        
        //Enquanto o numero de menções for menor à quantidade de alunos...
        while (i + r + b + mb < alunos) {
            System.out.print("Digite qual menção você vai inserir agora, I, R, B, ou MB? ");
            String mencaoescolhida = in.next().toLowerCase();
            switch (mencaoescolhida) {
                case "i":
                    System.out.print("Digite a quantidade de menções I que você deu: ");
                    i = in.nextInt();
                    break;
                case "r":
                    System.out.print("Digite a quantidade de menções R que você deu: ");
                    r = in.nextInt();
                    break;
                case "b":
                    System.out.print("Digite a quantidade de menções B que você deu: ");
                    b = in.nextInt();
                    break;
                case "mb":
                    System.out.print("Digite a quantidade de menções MB que você deu: ");
                    mb = in.nextInt();
                    break;
                default:
                    System.out.println("Menção inválida. Digite novamente.");
                    break;
            }
        }

        int somanotas = i + r + b + mb;
        // Verificação se o número de menções está igual ao de alunos
        if (somanotas != alunos) {
            System.out.println("Você não digitou a quantidade certa de notas ou de alunos.");
        } else {
            System.out.println("Menção MB: " + ((double) mb / alunos) * 100 + "%");
            System.out.println("Menção B: " + ((double) b / alunos) * 100 + "%");
            System.out.println("Menção R: " + ((double) r / alunos) * 100 + "%");
            System.out.println("Menção I: " + ((double) i / alunos) * 100 + "%");
        }
        in.close();
    }
}
