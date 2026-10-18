package JavaLista7;

import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor inicial:");
        double valor = sc.nextDouble();
        int repeticoes = 0;
        while (valor <= 1000) {
            valor *= 1.05;
            repeticoes++;
        }
        System.out.printf("Valor final: %.2f\n", valor);
        System.out.println("Repetições necessárias: " + repeticoes);
        sc.close();
    }
}