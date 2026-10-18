package JavaLista7;

import java.util.Scanner;

public class Atividade20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0;
        System.out.println("Informe os valores dos produtos (Digite 0 para finalizar):");
        double preco = sc.nextDouble();
        while (preco != 0) {
            if (preco > 0) {
                total += preco;
            }
            preco = sc.nextDouble();
        }
        System.out.printf("Total da compra: R$ %.2f\n", total);
        if (total > 500) {
            double desconto = total * 0.10;
            double totalComDesconto = total - desconto;
            System.out.printf("Desconto aplicado (10%%): R$ %.2f\n", desconto);
            System.out.printf("Valor final a pagar: R$ %.2f\n", totalComDesconto);
        } else {
            System.out.printf("Valor final a pagar: R$ %.2f\n", total);
        }
        sc.close();
    }
}
