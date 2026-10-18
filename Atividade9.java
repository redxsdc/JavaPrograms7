package JavaLista6;

import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args) {
        int idade, cont, soma;
        double media;
        soma = 0;
        cont = 0;
        media = 0;
        System.out.println("escreva a idade das pessoas, caso queira encerrar digite 0");
        Scanner sc = new Scanner(System.in);
        idade = sc.nextInt();
        while (idade != 0) {
            soma += idade;
            cont++;
            idade = sc.nextInt();
        }
        sc.close();
        if (cont > 0) {
            media = (double) soma / cont;
            System.out.println("a media é: " + media);
        } else {
            System.out.println("nenhuma idade valida inserida");
        }
    }
}