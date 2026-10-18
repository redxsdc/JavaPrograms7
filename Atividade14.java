package JavaLista7;

import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma nota (entre 0 e 10):");
        double nota = sc.nextDouble();
        while (nota < 0 || nota > 10) {
            System.out.println("Nota inválida! Digite novamente:");
            nota = sc.nextDouble();
        }
        System.out.println("Nota válida registrada: " + nota);
        sc.close();
    }
}
