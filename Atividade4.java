package JavaLista6;

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        int n;
        System.out.println("digite os numeros");
        System.out.println("caso queira encerrar digite 0");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while(n!=0){
            System.out.println("escreva um novo numero");
            n = sc.nextInt();
        }
        sc.close();
    }
}
