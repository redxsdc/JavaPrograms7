package JavaLista7;

import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidade = 0;
        int somaTotal = 0;
        System.out.println("Informe números (digite 0 para encerrar):");
        int num = sc.nextInt();
        while (num != 0) {
            somaTotal += num;
            quantidade++;
            num = sc.nextInt();
        }
        System.out.println("Quantidade digitada: " + quantidade);
        System.out.println("Soma total: " + somaTotal);
        if (quantidade > 0) {
            double media = (double) somaTotal / quantidade;
            System.out.printf("Média: %.2f\n", media);
        } else {
            System.out.println("Nenhum número foi informado antes do 0.");
        }
        sc.close();
    }
}