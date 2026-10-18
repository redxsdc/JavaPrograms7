package JavaLista7;

import java.util.Scanner;

public class Atividade18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cont = 0;
        int maiores50 = 0;
        int menores20 = 0;
        System.out.println("Informe 10 números inteiros:");
        while (cont < 10) {
            int num = sc.nextInt();
            if (num > 50) {
                maiores50++;
            } else if (num < 20) {
                menores20++;
            }
            cont++;
        }
        System.out.println("Quantidade de números maiores que 50: " + maiores50);
        System.out.println("Quantidade de números menores que 20: " + menores20);

        sc.close();
    }
}