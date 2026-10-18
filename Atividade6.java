package JavaLista6;

import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        int base,exp,cont,resultado;
        base = 0;
        exp =0;
        cont=0;
        resultado =1;
        System.out.println("escreva uma base e um expoente para fazer o calculo");
        Scanner sc = new Scanner(System.in);
        base = sc.nextInt();
        exp = sc.nextInt();
        while (cont<exp){
            resultado= resultado*base;
            cont++;
        }
        sc.close();
        System.out.println("\nResultado: " + base + " elevado a " + exp + " é igual a " + resultado);

    }
}
