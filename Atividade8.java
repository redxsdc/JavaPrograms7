package JavaLista6;

public class Atividade8 {
    public static void main(String[] args) {
        double populacaoA = 1000;
        double taxaA = 0.02;
        double populacaoB = 1500;
        double taxaB = 0.01;
        int anos = 0;
        while (populacaoA <= populacaoB) {
            populacaoA += populacaoA * taxaA;
            populacaoB += populacaoB * taxaB;
            anos++;
        }System.out.println("A cidade A passará a cidade B em " + anos + " anos.");
        System.out.printf("População final de A: %.0f habitantes%n", populacaoA);
        System.out.printf("População final de B: %.0f habitantes%n", populacaoB);
    }
}
