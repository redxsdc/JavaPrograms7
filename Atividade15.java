package JavaLista7;

import java.util.Scanner;

public class Atividade15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a senha de 4 dígitos:");
        int senha = sc.nextInt();
        while (senha != 1234) {
            System.out.println("Senha incorreta. Tente novamente:");
            senha = sc.nextInt();
        }
        System.out.println("Acesso liberado!");
        sc.close();
    }
}
