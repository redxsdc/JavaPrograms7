package JavaLista6;

import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        int senha;
        System.out.println("escreva a senha correta: ");
        Scanner sc = new Scanner(System.in);
        senha = sc.nextInt();
        while (senha != 1234) {
            System.out.println("senha errada,tente novamennte");
            senha = sc.nextInt();
        }
        System.out.println("senha correta");
        sc.close();
    }
}