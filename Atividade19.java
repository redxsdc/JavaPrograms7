package JavaLista7;

import java.util.Scanner;

public class Atividade19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int somaMaiores100 = 0;
        int contMaiores100 = 0;
        System.out.println("Informe números (digite 0 para encerrar):");
        int num = sc.nextInt();
        while (num != 0) {
            if (num > 100) {
                somaMaiores100 += num;
                contMaiores100++;
            }
            num = sc.nextInt();
        }
        if (contMaiores100 > 0) {
            double media = (double) somaMaiores100 / contMaiores100;
            System.out.printf("Média dos números maiores que 100: %.2f\n", media);
        } else {
            System.out.println("Nenhum número maior que 100 foi informado.");
        }
        sc.close();
    }
}
