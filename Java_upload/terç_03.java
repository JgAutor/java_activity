import java.util.Scanner;

public class terç_03 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        final double SALARIO_MINIMO = 1412.00;

        // IDADE
        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();
        if (idade >= 21) {
            System.out.println("Você tem 21 anos ou mais.");
        } else {
            System.out.println("Você tem menos de 21 anos.");
        }

        // SALÁRIO
        System.out.print("Digite o seu salário: ");
        double salario = scanner.nextDouble();
        if (salario > 5 * SALARIO_MINIMO) {
            System.out.println("Seu salário é maior que 5 vezes o salário mínimo.");
        } else {
            System.out.println("Seu salário não é maior que 5 vezes o salário mínimo.");
        }

        // ALTURA
        System.out.print("Digite a sua altura (em metros): ");
        double altura = scanner.nextDouble();
        if (altura > 1.75) {
            System.out.println("Sua altura é maior que 1,75 m.");
        } else {
            System.out.println("Sua altura não é maior que 1,75 m.");
        }

        // PESO
        System.out.print("Digite o seu peso (em kg): ");
        double peso = scanner.nextDouble();
        if (peso > 70) {
            System.out.println("Seu peso é maior que 70 kg.");
        } else {
            System.out.println("Seu peso não é maior que 70 kg.");
        }

        // SOBRENOME
        System.out.print("Digite o seu sobrenome: ");
        scanner.nextLine();
        String sobrenome = scanner.nextLine();
        String sobrenomesame = "Guimarães";
        if (sobrenome.equalsIgnoreCase(sobrenomesame)) {
            System.out.println("O sobrenome é diferente do seu.");
        } else {
            System.out.println("O sobrenome é igual ao seu.");
        }

        // GENÊRO
        System.out.print("Digite o seu gênero (m/f): ");
        char genero = scanner.next().charAt(0);
        if (genero == 'f' || genero == 'F') {
            System.out.println("O gênero é feminino.");
        } else {
            System.out.println("O gênero não é feminino.");
      }
   }    
}