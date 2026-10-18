package JavaLista7;

import java.util.Scanner;

public class Atividade17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int somaPares = 0;
        System.out.println("Informe números (digite 0 para encerrar):");
        int num = sc.nextInt();
        while (num != 0) {
            if (num % 2 == 0) {
                somaPares += num;
            }
            num = sc.nextInt();
        }
        System.out.println("Soma apenas dos pares: " + somaPares);
        sc.close();
    }
}
