package JavaLista6;

import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        int nota;
        System.out.println("insira um nota de 0 a 10,por gentileza");
        Scanner sc = new Scanner(System.in);
        nota = sc.nextInt();
        while (nota < 0 || nota > 10) {
            System.out.println("escreva uma nota valida");
            nota = sc.nextInt();
        }
        System.out.println("obrigado pela avalição");
        sc.close();
    }
}