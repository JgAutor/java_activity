import java.util.Scanner;

public class prim_01 {
 
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        System.out.println("Sistema de Faturas:");
        // Entrada
        System.out.print("Digite o valor total da fatura: ");
        double vlorTotal = leia.nextDouble();
        System.out.print("Digite o número de parcelas: ");
        int numParcelas = leia.nextInt();
        System.out.print("Digite o percentual de desconto para pagamento antecipado (em %): ");
        double percenDesconto = leia.nextDouble();
        System.out.print("Digite o percentual de multa por atraso (em %): ");
        double percenMulta = leia.nextDouble();
        
        // Processamento
        double vlorDesconto = vlorTotal - (vlorTotal * percenDesconto / 100);
        double valorParcela = vlorTotal / numParcelas;
        double vlorParclMulta = valorParcela + (valorParcela * percenMulta / 100);
        double vlorMulta = valorParcela * percenMulta / 100;

        System.out.printf("Valor total com desconto para pagamento antecipado: R$ %.2f%n", vlorDesconto);
   
                System.out.println("Valor de cada parcela com multa: ");
        for (int n = 1; n <= numParcelas; n++) {
            System.out.printf("Parcela %d: R$ %.2f (Multa: R$ %.2f)%n", n, vlorParclMulta, vlorMulta);
        }
    }
}