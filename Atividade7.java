package JavaLista6;

import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {
        System.out.println("Digite um número para calcular seu fatorial : ");
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("O fatorial não está definido para números negativos.");
        } else {
            int fatorial = 1;
            int contador = num;
            while (contador > 1) {
                fatorial *= contador;
                contador--;
            }

            System.out.println("O fatorial de " + num + " é " + fatorial + ".");
        }

        sc.close();




    }
}
