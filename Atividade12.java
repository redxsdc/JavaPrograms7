package JavaLista7;

import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número maior que 1:");
        double valor = sc.nextDouble();
        int divisoes = 0;
        while (valor / 2 > 1) {
            valor /= 2;
            divisoes++;
        }
        System.out.println("Divisões realizadas: " + divisoes);
        System.out.printf("Valor restante: %.4f\n", valor);
        sc.close();
    }
}
