import java.util.Scanner;

public class ScreenMatch {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o filme que deseja: ");
        String filme = leitura.nextLine();

        System.out.println("Digite o ano de lançamento: ");
        int anoDeLancamento = leitura.nextInt();

        System.out.println("Digite sua nota para o filme de 0 a 10: ");
        double avaliacao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);
    }
}
