package JavaLista6;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        int n, cont, contNegativo;
        cont = 1;
        contNegativo = 0;
        System.out.println("digite 10 numeros");
        Scanner sc = new Scanner(System.in);
        while (cont <= 10) {
            n = sc.nextInt();
            if (n < 0) {
                contNegativo++;
            }
            cont++;
        }
        sc.close();
        System.out.println("quantidade de numeros negativos digitados: " + contNegativo);
    }
}
