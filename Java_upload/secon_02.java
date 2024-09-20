import java.util.Scanner;

public class secon_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        // Informações pessoais
        String nome = "João Victor";
        int idade = 17;
        double peso = 50.0;
        double altura = 1.70;
        String serieFavorita = "Big Bang Teory";
        String musicaFavorita = "Cativa";
        String jogoFavorito = "Hollow Knight";

        // Quantidade de características iguais
        int caracteristicasIguais = 0;

        // Leitura das informações da pessoa
        System.out.print("Digite o nome da pessoa: ");
        String nomePessoa = scanner.nextLine();
        System.out.print("Digite a idade da pessoa: ");
        int idadePessoa = scanner.nextInt();
        System.out.print("Digite o peso da pessoa (em kg): ");
        double pesoPessoa = scanner.nextDouble();
        System.out.print("Digite a altura da pessoa (em metros): ");
        double alturaPessoa = scanner.nextDouble();
        scanner.nextLine(); // Consome a quebra de linha
        System.out.print("Digite a série favorita da pessoa: ");
        String seriePessoa = scanner.nextLine();
        System.out.print("Digite a música favorita da pessoa: ");
        String musicaPessoa = scanner.nextLine();
        System.out.print("Digite o jogo favorito da pessoa: ");
        String jogoPessoa = scanner.nextLine();

        // Verificação e Comparação das informações da pessoa
        
        if (nomePessoa.equalsIgnoreCase(nome)) {
            System.out.println("Pessoa com nome igual.");
            caracteristicasIguais++;
        } else {
            System.out.println("Pessoa com nome diferente.");
        }
        if (idadePessoa == idade) {
            System.out.println("Idade igual.");
            caracteristicasIguais++;
        } else {
            System.out.println("Idade diferente.");
        }
        if (pesoPessoa == peso) {
            System.out.println("Peso igual.");
            caracteristicasIguais++;
        } else {
            System.out.println("Peso diferente.");
        }
        if (alturaPessoa == altura) {
            System.out.println("Altura igual.");
            caracteristicasIguais++;
        } else {
            System.out.println("Altura diferente.");
        }
        if (seriePessoa.equalsIgnoreCase(serieFavorita)) {
            System.out.println("Série favorita igual.");
            caracteristicasIguais++;
        } else {
            System.out.println("Série favorita diferente.");
        }
        if (musicaPessoa.equalsIgnoreCase(musicaFavorita)) {
            System.out.println("Música favorita igual.");
            caracteristicasIguais++;
        } else {
            System.out.println("Música favorita diferente.");
        }
        if (jogoPessoa.equalsIgnoreCase(jogoFavorito)) {
            System.out.println("Jogo favorito igual.");
            caracteristicasIguais++;
 
        } else {
            System.out.println("Jogo favorito diferente.");
        }
        if (caracteristicasIguais >= 3) {
            System.out.println("Esta pessoa é bem parecida comigo!");
        } else {
            System.out.println("Esta pessoa tem algumas diferenças.");
      }
   }   
}