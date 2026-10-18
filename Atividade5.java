package JavaLista6;

import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        double compras, soma;
        soma = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva o valor dos produtos produtos");
        compras = sc.nextDouble();
        while (compras >= 0) {
            soma += compras;
            System.out.println("valor total até o momento: " + soma);
            System.out.println("escreva o valor do proximo produto");
            compras = sc.nextDouble();
        }
        System.out.println("numero negativo digitado, programa encerrado");
        System.out.println("valor da conta a ser pago " + soma);
        sc.close();
    }
}