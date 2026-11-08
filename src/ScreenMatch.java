public class ScreenMatch {
    public static void main(String[] args) {

        String nomeDoFilme = "Jogos Vorazes: Em Chamas";
        int anoDeLancamento = 2013;
        boolean includoNoPlano = false;
        double notaDoFilme = 9.7;

        double mediaDoFilme = (9.5 + 7.7 + 9.2) / 3;
        System.out.printf("Média do filme é %.2f%n ", mediaDoFilme);

        // Outro exemplo de formatação de texto
        String nome = "Maria";
        int idade = 30;
        double valor = 55.9999;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));

    }
}
