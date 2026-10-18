package JavaLista7;

import java.util.Scanner;

public class Atividade16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contIntervalo = 0;
        System.out.println("Informe números (digite 0 para encerrar):");
        int num = sc.nextInt();
        while (num != 0) {
            if (num >= 10 && num <= 50) {
                contIntervalo++;
            }
            num = sc.nextInt();
        }
        System.out.println("Quantidade entre 10 e 50: " + contIntervalo);
        sc.close();
    }
}
